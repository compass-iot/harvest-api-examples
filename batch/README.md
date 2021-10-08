# cURL examples


[Documentation](https://storage.googleapis.com/compass-public-docs/harvestbatch/3.0.0/api.html)
- The api key provided in the examples is a real key that undergoes all the validation logic but does not write anything to our databases (this is useful for testing, but please use the api key given to you by us!)

## TestParser
#### Simple csv
```bash
curl --location --request POST 'https://harvest.batch.apis.compassiot.cloud/twirp/twirp.harvestbatch.BatchHarvestService/TestParser' \
--header 'Content-Type: application/json' \
--header 'authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--data-raw '{
  "payload": "trip_id,latitude,longitude,speed,timestamp,transport_type,vehicle_type,xacceleration,yacceleration,roll,custom_attr\na,-33,151,60,2021-09-28T04:45:32+00:00,1,2,0.1,-0.1,1,something\nb,-33.1,151.1,51,2021-09-29T04:45:32+00:00,1,2,0.2,-0.3,-1,cool",
  "filetype": "CSV",
  "fail_on_invalid_row": false
}'
```
#### Base64 csv
```bash
curl --location --request POST 'https://harvest.batch.apis.compassiot.cloud/twirp/twirp.harvestbatch.BatchHarvestService/TestParser' \
--header 'Content-Type: application/json' \
--header 'authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--data-raw '{
  "payload": "'$(echo "trip_id,latitude,longitude,speed,timestamp,transport_type,vehicle_type,xacceleration,yacceleration,roll,custom_attr\na,-33,151,60,2021-09-28T04:45:32+00:00,1,2,0.1,-0.1,1,something\nb,-33.1,151.1,51,2021-09-29T04:45:32+00:00,1,2,0.2,-0.3,-1,cool" | base64 -w 0)'",
  "filetype": "CSV",
  "fail_on_invalid_row": false,
  "base64_encoded": true
}'
```
#### Base64 Parquet
```bash
curl --location --request POST 'https://harvest.batch.apis.compassiot.cloud/twirp/twirp.harvestbatch.BatchHarvestService/TestParser' \
--header 'Content-Type: application/json' \
--header 'authorization: apikey <insert api key>' \
--data-raw '{
  "payload": "'$(cat small.parquet | base64 -w 0)'",
  "filetype": "PARQUET",
  "fail_on_invalid_row": false,
  "base64_encoded": true
}'
```

## StoreGCS
```bash
curl --location --request POST 'https://harvest.batch.apis.compassiot.cloud/twirp/twirp.harvestbatch.BatchHarvestService/StoreGCS' \
--header 'Content-Type: application/json' \
--header 'authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--data-raw '{
"url": "<some url>",
"filetype": "CSV"
}'
```

## GetUploadUrl
```bash
curl --location --request POST 'https://harvest.batch.apis.compassiot.cloud/twirp/twirp.harvestbatch.BatchHarvestService/GetUploadUrl' \
--header 'Content-Type: application/json' \
--header 'authorization: apikey bc8760b6f6f12b8ada9fdfd4503e847f' \
--data-raw '{
  "filetype": "CSV"
}'
```