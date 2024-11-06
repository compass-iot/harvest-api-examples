package com.compassiot

import build.buf.gen.compass.harvest.v1alpha1.IngestServiceClient
import build.buf.gen.compass.harvest.v1alpha1.batchInsertRequest
import build.buf.gen.compassiot.compass.v1.*
import com.connectrpc.*
import com.connectrpc.extensions.GoogleJavaProtobufStrategy
import com.connectrpc.http.clone
import com.connectrpc.impl.ProtocolClient
import com.connectrpc.okhttp.ConnectOkHttpClient
import com.connectrpc.protocols.NetworkProtocol
import com.google.protobuf.Timestamp
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.internal.wait
import java.time.Instant

private data class ApiKeyInterceptor(private val key: String) : Interceptor {
    private fun copyWithAuth(headers: Headers): Headers {
        val cloned = headers.toMutableMap()
        cloned["authorization"] = listOf("apikey $key")
        return cloned
    }

    override fun streamFunction(): StreamFunction {
        return StreamFunction(requestFunction = { it.clone(headers = copyWithAuth(it.headers)) })
    }

    override fun unaryFunction(): UnaryFunction {
        return UnaryFunction(requestFunction = { it.clone(headers = copyWithAuth(it.headers)) })
    }
}

fun main() {
    // Setup client
    val url = "https://harvest.compassiot.cloud"
    val apiKey = "bc8760b6f6f12b8ada9fdfd4503e847f"
    val client = IngestServiceClient(ProtocolClient(
        httpClient = ConnectOkHttpClient(OkHttpClient()),
        config = ProtocolClientConfig(
            host = url,
            serializationStrategy = GoogleJavaProtobufStrategy(),
            networkProtocol = NetworkProtocol.CONNECT,
            interceptors = listOf { ApiKeyInterceptor(apiKey) }
        )
    ))

    // 2. Create data packet
    val now = Instant.now()
    val pe = positionEvent {
        vehicleId = "abc123"
        vehicleType = VehicleType.CAR
        transportType = TransportType.PRIVATE
        timestamp = Timestamp.newBuilder().setSeconds(now.epochSecond).build()
        position = position {
            latlng = latLng {
                lat = 45.0
                lng = 90.0
            }
            speed = 60.0
        }
        acceleration = acceleration {
            x = 1.0
            y = 2.0
            z = 3.0
        }
        labels.putAll(mapOf(
            Pair("make", "toyota"),
            Pair("something", "nice")
        ))
    }

    // 3. Run client
    runBlocking {
        // For insert() need to catch exception to figure out cause
        try {
            client.insert(pe).getOrThrow()
        } catch (e: Exception) {
            // Do something with exception
        }

        // batchInsert() will not throw an exception. Any errors will be propagated in batchResponse.errors
        val batch = batchInsertRequest {
            events.add(pe)
        }
        val response = client.batchInsert(batch).getOrThrow()
        if (response.errorsCount > 0) {
            println(response.errorsList)
        }
        println("Success writing to Harvest")
    }
}