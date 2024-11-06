# cURL example
```bash

### Simple
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertCompat' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "vehicle_id":"abc123",
   "timestamp":"2021-04-01T06:24:04+10:00",
   "transport_type":1,
   "vehicle_type":2,
   "position":{
      "latlng":{
         "latitude":45,
         "longitude":90
      },
      "speed":60,
      "bearing": 359
   },
   "acceleration":{
      "x":1,
      "y":2,
      "z":3
   },
   "gyro":{
      "roll":-1,
      "pitch":-2,
      "yaw":-3
   },
   "labels":{
      "make":"toyota",
      "something":"nice"
   }
}'
```

### Batch
```bash
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/BatchInsertCompat' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
    "events": [
        {
           "vehicle_id":"abc123",
           "timestamp":"2021-04-01T06:24:04+10:00",
           "transport_type":1,
           "vehicle_type":2,
           "position":{
              "latlng":{
                 "latitude":45,
                 "longitude":90
              },
              "speed":60,
              "bearing": 359
           },
           "acceleration":{
              "x":1,
              "y":2,
              "z":3
           },
           "gyro":{
              "roll":-1,
              "pitch":-2,
              "yaw":-3
           },
           "labels":{
              "make":"toyota",
              "something":"nice"
           }
        },
        {
           "vehicle_id":"abc123",
           "timestamp":"2021-04-01T06:24:06+10:00",
           "transport_type":1,
           "vehicle_type":2,
           "position":{
              "latlng":{
                 "latitude":45.001,
                 "longitude":90
              },
              "speed":59,
              "bearing": 359
           },
           "acceleration":{
              "x":1,
              "y":2,
              "z":3
           },
           "gyro":{
              "roll":-1,
              "pitch":-2,
              "yaw":-3
           },
           "labels":{
              "make":"toyota",
              "something":"nice"
           }
        }
    ]
}'
```

## Partial examples
```bash
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialLatLng' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "timestamp":1665029812,
   "latitude":45,
   "longitude":90
}'
```

```bash
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialEventAcceleration' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "timestamp":1665029813,
   "x":1.1,
   "y":0.5,
   "z":-1.1
}'
```

```bash
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialEventGyro' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "timestamp":1665029815,
   "roll":1.1,
   "pitch":0.5,
   "yaw":-1.1
}'
```

```bash
// Odo in km
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialEventOdo' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "timestamp":1665029815,
   "odo":1.1
}'
```

```bash
// Fuel between 0 and 1.0
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialEventFuelOrCharge' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "timestamp":1665029815,
   "fuel_or_charge":0.98
}'
```

```bash
// Nested props NOT allowed
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialEventMetadataKV' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "timestamp":1665029815,
   "labels": {
      "string_prop": "value",
      "number_prop": "123"
   }
}'
```

```bash
// escaped json string, nested props allowed
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialEventMetadataJSON' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "timestamp":1665029815,
   "json_metadata": "{\"string_prop\": \"value\",\"number_prop\": 123,\"nested_prop\": {\"prop\": \"eller\"}"
}'
```

### Vehicle endpoints
These endpoints are for static properties of a given vehicle e.g. make / model
as opposed to the above endpoints which are properties of the point in time event
```bash
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialVehicleMetadataJSON' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "transport_type": 1,
   "vehicle_type": 2,
   "json_metadata": "{\"string_prop\": \"value\",\"number_prop\": 123,\"nested_prop\": {\"prop\": \"eller\"}}"
}'
```

```bash
curl --location --request POST 'https://harvest.compassiot.cloud/compass.harvest.v1alpha1.IngestService/InsertPartialVehicleMetadataKV' \
--header 'Authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--header 'Content-Type: application/json' \
--data-raw '{
   "region": "AUS",
   "vehicle_id":"abc123",
   "transport_type": 1,
   "vehicle_type": 2,
   "labels": {
      "string_prop": "value",
      "number_prop": "123"
   }
}'
```

Numerical values in `transport_type` and `vehicle_type`
```protobuf
enum TransportType {
  TRANSPORT_TYPE_UNSPECIFIED = 0;
  PRIVATE = 1;
  PUBLIC = 2;
}
enum VehicleType {
  VEHICLE_TYPE_UNSPECIFIED = 0;
  BUS = 1;
  CAR = 2;
  VAN = 3;
  TRUCK = 4;

  LCV = 5;
  HCV = 6;

  LV = 8;
  HV = 9;

  CRANE = 10;
  TRACTOR = 11;
  TRAILER = 12;
  LOADER = 13;
  MOTORCYCLE = 14;
  GARBAGE_TRUCK = 15;
  MICROBUS = 16;
  SNOWPLOW = 17;

  PICKUP_TRUCK = 18;
  SUV = 19;
}
```
