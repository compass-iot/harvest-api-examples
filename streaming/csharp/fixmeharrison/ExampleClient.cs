using Google;
using Grpc;
using Compass.Harvest.V1Alpha1;
using Compass.Type.Geo;
using Compass.Iam;
using Grpc.Net.Client;
using Google.Protobuf.WellKnownTypes;


namespace Client
{
    class ExampleClient
    {
        static void Main(string[] args)
        {
            
        String url = "https://harvest.grpc.apis.compassiot.cloud:443";
        String apiKey = "apikey bc8760b6f6f12b8ada9fdfd4503e847f";
        GrpcChannel channel = GrpcChannel.ForAddress(url);
        IngestService.IngestServiceClient client = new Compass.Harvest.V1Alpha1.IngestService.IngestServiceClient(channel);
        Grpc.Core.Metadata headers = new Grpc.Core.Metadata();
        headers.Add("Authorization", $"{apiKey}");
        Grpc.Core.Metadata header = new Grpc.Core.Metadata();
        
        PositionEvent evt = new PositionEvent { 
            VehicleId = "testvehicle123", 
            VehicleType = VehicleType.Car, 
            TransportType = TransportType.Private, 
            Acceleration =  new Acceleration {X = 1, Y = 2, Z = 3}, 
            Position = new Position{Latlng = new LatLng{Latitude = 45, Longitude = 90}},
            Gyro = new Gyro{Roll = -1, Pitch = -2, Yaw = -3},
            Timestamp = Timestamp.FromDateTime(DateTime.UtcNow)};
            

        
        try
        {
            client.Insert(evt, headers);
            client.Insert(evt2, headers);
        }
        catch (Exception e)
        {
            Console.Write(e.Message);
            return 0;
        }
            Console.Write("\nSuccessfully pushed event via GRPC API!");
            return 0;
        }
    }
}