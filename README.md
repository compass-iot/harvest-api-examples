# Harvest API Examples

This repo contains examples on how to use our Harvest API. The API key provided in each example is a real key which undergoes all the validation logic but does not write anything to our databases. While this is useful for testing, please use the API key we've given to you.

## Schema definition

We use [protobuf](https://protobuf.dev) to define our schema and hosted at the [Buf Schema Registry (BSR)](https://buf.build/compassiot/harvest).

## Examples

Harvest runs on [ConnectRPC](https://connectrpc.com) but the protocol itself is compatible with [gRPC](https://grpc.io). We encourage to use Connect as it has better conformance to HTTP/1.1 and therefore fewer quirks than gRPC. The examples in this repo will be written using Connect when possible, otherwise it will be in gRPC.

### ConnectRPC
- [Go](https://github.com/compass-iot/harvest-api-examples/tree/main/harvest-go)
- [Kotlin](https://github.com/compass-iot/harvest-api-examples/tree/main/harvest-kotlin)

### gRPC
- [C#](https://github.com/compass-iot/harvest-api-examples/tree/main/harvest-csharp)
- [Java](https://github.com/compass-iot/harvest-api-examples/tree/main/harvest-java)
