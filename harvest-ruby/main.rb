# Copied from https://github.com/grpc/grpc/blob/master/examples/ruby/greeter_client.rb
this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(this_dir, 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'compass/harvest/v1alpha1/harvest_services_pb'
require 'google/protobuf/timestamp_pb'

# Auth interceptor that injects API key into request headers
class AuthInterceptor < GRPC::ClientInterceptor
  def initialize(apikey)
    super
    @apikey = apikey
  end

  def request_response(request:, call:, method:, metadata:)
    metadata['authorization'] = "apikey #{@apikey}"
    yield
  end
end

def main
  # Replace the test API key below with yours;
  # test API key only validates the request
  apikey = 'bc8760b6f6f12b8ada9fdfd4503e847f'
  harvest_url = 'harvest.compassiot.cloud:443'

  creds = GRPC::Core::ChannelCredentials.new
  ingester = Compass::Harvest::V1alpha1::IngestService::Stub.new(
    harvest_url,
    creds,
    interceptors: [AuthInterceptor.new(apikey)]
  )

  pe = Compassiot::Compass::V1::PositionEvent.new(
    vehicle_id: 'surecam-vehicle1',
    vehicle_type: :VAN, # or some other vehicle type, if unknown, set to unspecified
    transport_type: :PRIVATE,
    timestamp: Google::Protobuf::Timestamp.new(seconds: Time.now.to_i), # Compass can handle nanoseconds
    position: Compassiot::Compass::V1::Position.new(
      latlng: Compassiot::Compass::V1::LatLng.new(
        lat: 37.7749,
        lng: -122.4194
      ),
      speed: 50.0,
      bearing: 90.0
    ),
    # For data / variants which are not defined in PositionEvent schema
    labels: {
      'some-metadata' => 'foo'
    }
  )

  # Single insert (can return exception here)
  ingester.insert(pe)
  printf("Success inserting single event \n")

  # Prefer batch insert for better throughput
  batch_req = Compass::Harvest::V1alpha1::BatchInsertRequest.new(events: [pe])
  batch_res = ingester.batch_insert(batch_req)
  if batch_res.errors.length.positive?
    throw "Found batch error: #{batch_res.inspect}"
  else
    printf("Success inserting batch events, #{batch_res.inspect} \n")
  end
end

main
