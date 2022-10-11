
using Compass.Harvest.V1Alpha1;
using Compass.Type.Geo;
using Grpc.Net.Client;
using Google.Protobuf.WellKnownTypes;


namespace Client
{
    class ExampleClient
    {
        static int Main(string[] args)
        {

        String url = "https://harvest-grpc.compassiot.cloud:443";
        String apiKey = "apikey bc8760b6f6f12b8ada9fdfd4503e847f";
        GrpcChannel channel = GrpcChannel.ForAddress(url);
        IngestService.IngestServiceClient client = new Compass.Harvest.V1Alpha1.IngestService.IngestServiceClient(channel);
        Grpc.Core.Metadata headers = new Grpc.Core.Metadata();
        headers.Add("Authorization", $"{apiKey}");
        Grpc.Core.Metadata header = new Grpc.Core.Metadata();

        PartialEventLatLng partialEvt = new PartialEventLatLng {
            VehicleId = "testvehicle123",
            Region = "AUS",
            Timestamp = DateTimeOffset.Now.ToUnixTimeSeconds(),
            Longitude = 151.0,
            Latitude = -33.0
        };

        PositionEvent evt = new PositionEvent {
            VehicleId = "testvehicle123",
            VehicleType = VehicleType.Car,
            TransportType = TransportType.Private,
            Acceleration =  new Acceleration {X = 1, Y = 2, Z = 3},
            Position = new Position{Latlng = new LatLng{Latitude = 45, Longitude = 90}},
            Gyro = new Gyro{Roll = -1, Pitch = -2, Yaw = -3},
            Timestamp = Timestamp.FromDateTime(DateTime.UtcNow)};

        BatchInsertRequest evts = new BatchInsertRequest {
            Events = {evt}
        };

        try
        {
            client.InsertPartialLatLng(partialEvt, headers);
            client.Insert(evt, headers);
            client.BatchInsert(evts, headers);
        }
        catch (Exception e)
        {
            Console.Write(e.Message);
            return 0;
        }
            Console.Write("\nSuccessfully pushed events via GRPC API!\n");
            return 1;
        }
    }
}
