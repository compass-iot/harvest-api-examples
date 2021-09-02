# Compass ingest examples
- Repo contains examples of how to use the compass ingest apis
- There are two types of api, straight http (see curl directory) and a grpc based api.
- Minimal examples of grpc api usage are available in several languages
- Grpc api does not yet support streaming, but may in the future
- The api key provided in the examples is a real key that undergoes all the validation logic but does not write anything to our databases

Below shows information about specific fields within the compass api

# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [compass/harvest/v1alpha1/ingest.proto](#compass/harvest/v1alpha1/ingest.proto)
    - [BatchInsertRequest](#compass.harvest.v1alpha1.BatchInsertRequest)
    - [BatchInsertResponse](#compass.harvest.v1alpha1.BatchInsertResponse)
    - [InsertError](#compass.harvest.v1alpha1.InsertError)
  
    - [IngestService](#compass.harvest.v1alpha1.IngestService)
  
- [compass/harvest/v1alpha1/position_event.proto](#compass/harvest/v1alpha1/position_event.proto)
    - [Acceleration](#compass.harvest.v1alpha1.Acceleration)
    - [Gyro](#compass.harvest.v1alpha1.Gyro)
    - [Position](#compass.harvest.v1alpha1.Position)
    - [PositionEvent](#compass.harvest.v1alpha1.PositionEvent)
    - [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry)
  
    - [TransportType](#compass.harvest.v1alpha1.TransportType)
    - [VehicleType](#compass.harvest.v1alpha1.VehicleType)
  
- [Scalar Value Types](#scalar-value-types)



<a name="compass/harvest/v1alpha1/ingest.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/ingest.proto



<a name="compass.harvest.v1alpha1.BatchInsertRequest"></a>

### BatchInsertRequest
Batch request for sending multiple events in a single call
please don&#39;t go crazy on the message size !


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| events | [PositionEvent](#compass.harvest.v1alpha1.PositionEvent) | repeated |  |






<a name="compass.harvest.v1alpha1.BatchInsertResponse"></a>

### BatchInsertResponse
List of errors ordered according to the BatchInsertRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| errors | [InsertError](#compass.harvest.v1alpha1.InsertError) | repeated |  |






<a name="compass.harvest.v1alpha1.InsertError"></a>

### InsertError
e.g. if BatchInsertRequest.events[2] contains an error
BatchInsertResponse.errors.index = 2 should contain the relevant message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [int32](#int32) |  |  |
| error | [google.rpc.Status](#google.rpc.Status) |  |  |





 

 

 


<a name="compass.harvest.v1alpha1.IngestService"></a>

### IngestService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Insert | [PositionEvent](#compass.harvest.v1alpha1.PositionEvent) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| BatchInsert | [BatchInsertRequest](#compass.harvest.v1alpha1.BatchInsertRequest) | [BatchInsertResponse](#compass.harvest.v1alpha1.BatchInsertResponse) |  |

 



<a name="compass/harvest/v1alpha1/position_event.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/position_event.proto



<a name="compass.harvest.v1alpha1.Acceleration"></a>

### Acceleration
Acceleration is measured in gforce
so if the vehicle is decelerating at 9.8m/s^2 (newtons) in the x axis,
the input to this api should be Acceleration { 1, 0, 0 }


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| x | [double](#double) |  | acceleration / braking |
| y | [double](#double) |  | side to side / turning force |
| z | [double](#double) |  | vertical up / down force |






<a name="compass.harvest.v1alpha1.Gyro"></a>

### Gyro
Rotational data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| roll | [double](#double) |  |  |
| pitch | [double](#double) |  |  |
| yaw | [double](#double) |  |  |






<a name="compass.harvest.v1alpha1.Position"></a>

### Position



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latlng | [compass.type.geo.LatLng](#compass.type.geo.LatLng) |  | lat and lng of the vehicle position |
| speed | [double](#double) |  | speed of vehicle in km/h |
| bearing | [double](#double) |  | [optional] bearing of vehicle in degrees [0, 360) |






<a name="compass.harvest.v1alpha1.PositionEvent"></a>

### PositionEvent
- Either VehicleID or TripID MUST be present.
- Ideally both, followed by just VehicleID, followed by just TripID.
- Position, VehicleType and TransportType are required
- Any extra metadata can be added in &#39;labels&#39; and will be greatly appreciated!


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) |  | Unique identifier for the vehicle. |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  | Timestamp that event occured |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) |  |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) |  |  |
| position | [Position](#compass.harvest.v1alpha1.Position) |  |  |
| acceleration | [Acceleration](#compass.harvest.v1alpha1.Acceleration) |  |  |
| gyro | [Gyro](#compass.harvest.v1alpha1.Gyro) |  |  |
| trip_id | [string](#string) |  | Id linking points of the same trip |
| labels | [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry) | repeated | extra metadata not suppported by our api that may be useful :) |






<a name="compass.harvest.v1alpha1.PositionEvent.LabelsEntry"></a>

### PositionEvent.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |





 


<a name="compass.harvest.v1alpha1.TransportType"></a>

### TransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| TRANSPORT_TYPE_UNSPECIFIED | 0 |  |
| PRIVATE | 1 | Anything not public |
| PUBLIC | 2 | Vehicle operated by public services |



<a name="compass.harvest.v1alpha1.VehicleType"></a>

### VehicleType


| Name | Number | Description |
| ---- | ------ | ----------- |
| VEHICLE_TYPE_UNSPECIFIED | 0 |  |
| BUS | 1 |  |
| CAR | 2 |  |
| VAN | 3 |  |
| TRUCK | 4 |  |


 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [compass/harvest/v1alpha1/ingest.proto](#compass/harvest/v1alpha1/ingest.proto)
    - [BatchInsertRequest](#compass.harvest.v1alpha1.BatchInsertRequest)
    - [BatchInsertResponse](#compass.harvest.v1alpha1.BatchInsertResponse)
    - [InsertError](#compass.harvest.v1alpha1.InsertError)
  
    - [IngestService](#compass.harvest.v1alpha1.IngestService)
  
- [compass/harvest/v1alpha1/position_event.proto](#compass/harvest/v1alpha1/position_event.proto)
    - [Acceleration](#compass.harvest.v1alpha1.Acceleration)
    - [Gyro](#compass.harvest.v1alpha1.Gyro)
    - [Position](#compass.harvest.v1alpha1.Position)
    - [PositionEvent](#compass.harvest.v1alpha1.PositionEvent)
    - [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry)
  
    - [TransportType](#compass.harvest.v1alpha1.TransportType)
    - [VehicleType](#compass.harvest.v1alpha1.VehicleType)
  
- [Scalar Value Types](#scalar-value-types)



<a name="compass/harvest/v1alpha1/ingest.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/ingest.proto



<a name="compass.harvest.v1alpha1.BatchInsertRequest"></a>

### BatchInsertRequest
Batch request for sending multiple events in a single call
please don&#39;t go crazy on the message size !


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| events | [PositionEvent](#compass.harvest.v1alpha1.PositionEvent) | repeated |  |






<a name="compass.harvest.v1alpha1.BatchInsertResponse"></a>

### BatchInsertResponse
List of errors ordered according to the BatchInsertRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| errors | [InsertError](#compass.harvest.v1alpha1.InsertError) | repeated |  |






<a name="compass.harvest.v1alpha1.InsertError"></a>

### InsertError
e.g. if BatchInsertRequest.events[2] contains an error
BatchInsertResponse.errors.index = 2 should contain the relevant message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [int32](#int32) |  |  |
| error | [google.rpc.Status](#google.rpc.Status) |  |  |





 

 

 


<a name="compass.harvest.v1alpha1.IngestService"></a>

### IngestService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Insert | [PositionEvent](#compass.harvest.v1alpha1.PositionEvent) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| BatchInsert | [BatchInsertRequest](#compass.harvest.v1alpha1.BatchInsertRequest) | [BatchInsertResponse](#compass.harvest.v1alpha1.BatchInsertResponse) |  |

 



<a name="compass/harvest/v1alpha1/position_event.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/position_event.proto



<a name="compass.harvest.v1alpha1.Acceleration"></a>

### Acceleration
Acceleration is measured in gforce
so if the vehicle is decelerating at 9.8m/s^2 (newtons) in the x axis,
the input to this api should be Acceleration { 1, 0, 0 }


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| x | [double](#double) |  | acceleration / braking |
| y | [double](#double) |  | side to side / turning force |
| z | [double](#double) |  | vertical up / down force |






<a name="compass.harvest.v1alpha1.Gyro"></a>

### Gyro
Rotational data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| roll | [double](#double) |  |  |
| pitch | [double](#double) |  |  |
| yaw | [double](#double) |  |  |






<a name="compass.harvest.v1alpha1.Position"></a>

### Position



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latlng | [compass.type.geo.LatLng](#compass.type.geo.LatLng) |  | lat and lng of the vehicle position |
| speed | [double](#double) |  | speed of vehicle in km/h |
| bearing | [double](#double) |  | [optional] bearing of vehicle in degrees [0, 360) |






<a name="compass.harvest.v1alpha1.PositionEvent"></a>

### PositionEvent
- Either VehicleID or TripID MUST be present.
- Ideally both, followed by just VehicleID, followed by just TripID.
- Position, VehicleType and TransportType are required
- Any extra metadata can be added in &#39;labels&#39; and will be greatly appreciated!


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) |  | Unique identifier for the vehicle. |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  | Timestamp that event occured |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) |  |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) |  |  |
| position | [Position](#compass.harvest.v1alpha1.Position) |  |  |
| acceleration | [Acceleration](#compass.harvest.v1alpha1.Acceleration) |  |  |
| gyro | [Gyro](#compass.harvest.v1alpha1.Gyro) |  |  |
| trip_id | [string](#string) |  | Id linking points of the same trip |
| labels | [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry) | repeated | extra metadata not suppported by our api that may be useful :) |






<a name="compass.harvest.v1alpha1.PositionEvent.LabelsEntry"></a>

### PositionEvent.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |





 


<a name="compass.harvest.v1alpha1.TransportType"></a>

### TransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| TRANSPORT_TYPE_UNSPECIFIED | 0 |  |
| PRIVATE | 1 | Anything not public |
| PUBLIC | 2 | Vehicle operated by public services |



<a name="compass.harvest.v1alpha1.VehicleType"></a>

### VehicleType


| Name | Number | Description |
| ---- | ------ | ----------- |
| VEHICLE_TYPE_UNSPECIFIED | 0 |  |
| BUS | 1 |  |
| CAR | 2 |  |
| VAN | 3 |  |
| TRUCK | 4 |  |


 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [compass/harvest/v1alpha1/ingest.proto](#compass/harvest/v1alpha1/ingest.proto)
    - [BatchInsertRequest](#compass.harvest.v1alpha1.BatchInsertRequest)
    - [BatchInsertResponse](#compass.harvest.v1alpha1.BatchInsertResponse)
    - [InsertError](#compass.harvest.v1alpha1.InsertError)
  
    - [IngestService](#compass.harvest.v1alpha1.IngestService)
  
- [compass/harvest/v1alpha1/position_event.proto](#compass/harvest/v1alpha1/position_event.proto)
    - [Acceleration](#compass.harvest.v1alpha1.Acceleration)
    - [Gyro](#compass.harvest.v1alpha1.Gyro)
    - [Position](#compass.harvest.v1alpha1.Position)
    - [PositionEvent](#compass.harvest.v1alpha1.PositionEvent)
    - [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry)
  
    - [TransportType](#compass.harvest.v1alpha1.TransportType)
    - [VehicleType](#compass.harvest.v1alpha1.VehicleType)
  
- [Scalar Value Types](#scalar-value-types)



<a name="compass/harvest/v1alpha1/ingest.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/ingest.proto



<a name="compass.harvest.v1alpha1.BatchInsertRequest"></a>

### BatchInsertRequest
Batch request for sending multiple events in a single call
please don&#39;t go crazy on the message size !


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| events | [PositionEvent](#compass.harvest.v1alpha1.PositionEvent) | repeated |  |






<a name="compass.harvest.v1alpha1.BatchInsertResponse"></a>

### BatchInsertResponse
List of errors ordered according to the BatchInsertRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| errors | [InsertError](#compass.harvest.v1alpha1.InsertError) | repeated |  |






<a name="compass.harvest.v1alpha1.InsertError"></a>

### InsertError
e.g. if BatchInsertRequest.events[2] contains an error
BatchInsertResponse.errors.index = 2 should contain the relevant message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [int32](#int32) |  |  |
| error | [google.rpc.Status](#google.rpc.Status) |  |  |





 

 

 


<a name="compass.harvest.v1alpha1.IngestService"></a>

### IngestService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Insert | [PositionEvent](#compass.harvest.v1alpha1.PositionEvent) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| BatchInsert | [BatchInsertRequest](#compass.harvest.v1alpha1.BatchInsertRequest) | [BatchInsertResponse](#compass.harvest.v1alpha1.BatchInsertResponse) |  |

 



<a name="compass/harvest/v1alpha1/position_event.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/position_event.proto



<a name="compass.harvest.v1alpha1.Acceleration"></a>

### Acceleration
Acceleration is measured in gforce
so if the vehicle is decelerating at 9.8m/s^2 (newtons) in the x axis,
the input to this api should be Acceleration { 1, 0, 0 }


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| x | [double](#double) |  | acceleration / braking |
| y | [double](#double) |  | side to side / turning force |
| z | [double](#double) |  | vertical up / down force |






<a name="compass.harvest.v1alpha1.Gyro"></a>

### Gyro
Rotational data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| roll | [double](#double) |  |  |
| pitch | [double](#double) |  |  |
| yaw | [double](#double) |  |  |






<a name="compass.harvest.v1alpha1.Position"></a>

### Position



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latlng | [compass.type.geo.LatLng](#compass.type.geo.LatLng) |  | lat and lng of the vehicle position |
| speed | [double](#double) |  | speed of vehicle in km/h |
| bearing | [double](#double) |  | [optional] bearing of vehicle in degrees [0, 360) |






<a name="compass.harvest.v1alpha1.PositionEvent"></a>

### PositionEvent
- Either VehicleID or TripID MUST be present.
- Ideally both, followed by just VehicleID, followed by just TripID.
- Position, VehicleType and TransportType are required
- Any extra metadata can be added in &#39;labels&#39; and will be greatly appreciated!


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) |  | Unique identifier for the vehicle. |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  | Timestamp that event occured |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) |  |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) |  |  |
| position | [Position](#compass.harvest.v1alpha1.Position) |  |  |
| acceleration | [Acceleration](#compass.harvest.v1alpha1.Acceleration) |  |  |
| gyro | [Gyro](#compass.harvest.v1alpha1.Gyro) |  |  |
| trip_id | [string](#string) |  | Id linking points of the same trip |
| labels | [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry) | repeated | extra metadata not suppported by our api that may be useful :) |






<a name="compass.harvest.v1alpha1.PositionEvent.LabelsEntry"></a>

### PositionEvent.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |





 


<a name="compass.harvest.v1alpha1.TransportType"></a>

### TransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| TRANSPORT_TYPE_UNSPECIFIED | 0 |  |
| PRIVATE | 1 | Anything not public |
| PUBLIC | 2 | Vehicle operated by public services |



<a name="compass.harvest.v1alpha1.VehicleType"></a>

### VehicleType


| Name | Number | Description |
| ---- | ------ | ----------- |
| VEHICLE_TYPE_UNSPECIFIED | 0 |  |
| BUS | 1 |  |
| CAR | 2 |  |
| VAN | 3 |  |
| TRUCK | 4 |  |


 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

