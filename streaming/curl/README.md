# cURL example
```bash
curl --location --request POST 'https://harvest.apis.compassiot.cloud/v1alpha1/ingest' \
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
