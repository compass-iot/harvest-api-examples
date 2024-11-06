using Compassiot.Compass.V1;
using Compass.Harvest.V1alpha1;
using Google.Protobuf.WellKnownTypes;
using Grpc.Core;
using Grpc.Net.Client;

namespace Client
{
    class ExampleClient
    {
        static int Main()
        {
            // Setup client
            string url = "https://harvest.compassiot.cloud";
            GrpcChannel channel = GrpcChannel.ForAddress(url);
            IngestService.IngestServiceClient client = new IngestService.IngestServiceClient(channel);

            // Setup auth
            string apikey = "bc8760b6f6f12b8ada9fdfd4503e847f";
            Metadata headers = new Metadata
            {
                { "Authorization", $"apikey {apikey}" }
            };

            var pe = new PositionEvent
            {
                VehicleId = "abc123",
                VehicleType = VehicleType.Car,
                TransportType = TransportType.Private,
                Timestamp = Timestamp.FromDateTime(DateTime.UtcNow),
                Position = new Position
                {
                    Latlng = new LatLng
                    {
                        Lat = 45,
                        Lng = 90
                    },
                    Speed = 60.0
                },
                Acceleration = new Acceleration
                {
                    X = 1.0,
                    Y = 2.0,
                    Z = 3.0
                },
            };
            pe.Labels.Add(new Dictionary<string, string>
            {
                { "make", "toyota" },
                { "something", "nice" },
            });

            var batch = new BatchInsertRequest
            {
                Events = { pe }
            };

            client.Insert(pe, headers);
            client.BatchInsert(batch, headers);
            Console.WriteLine("Success writing to Harvest");
            return 0;
        }
    }
}
