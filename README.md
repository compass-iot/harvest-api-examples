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
    - [Trip](#compass.harvest.v1alpha1.Trip)
    - [Trip.LabelsEntry](#compass.harvest.v1alpha1.Trip.LabelsEntry)
  
    - [TransportType](#compass.harvest.v1alpha1.TransportType)
    - [VehicleType](#compass.harvest.v1alpha1.VehicleType)
  
- [Scalar Value Types](#scalar-value-types)



<a name="compass/harvest/v1alpha1/ingest.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/ingest.proto



<a name="compass.harvest.v1alpha1.BatchInsertRequest"></a>

### BatchInsertRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| events | [PositionEvent](#compass.harvest.v1alpha1.PositionEvent) | repeated |  |






<a name="compass.harvest.v1alpha1.BatchInsertResponse"></a>

### BatchInsertResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| errors | [InsertError](#compass.harvest.v1alpha1.InsertError) | repeated |  |






<a name="compass.harvest.v1alpha1.InsertError"></a>

### InsertError



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



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| x | [double](#double) |  |  |
| y | [double](#double) |  |  |
| z | [double](#double) |  |  |






<a name="compass.harvest.v1alpha1.Gyro"></a>

### Gyro



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| roll | [double](#double) |  |  |
| pitch | [double](#double) |  |  |
| yaw | [double](#double) |  |  |






<a name="compass.harvest.v1alpha1.Position"></a>

### Position



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latlng | [compass.type.geo.LatLng](#compass.type.geo.LatLng) |  |  |
| speed | [double](#double) |  |  |
| bearing | [double](#double) |  |  |






<a name="compass.harvest.v1alpha1.PositionEvent"></a>

### PositionEvent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) |  | Unique identifier for the vehicle. |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) |  |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) |  |  |
| position | [Position](#compass.harvest.v1alpha1.Position) |  |  |
| acceleration | [Acceleration](#compass.harvest.v1alpha1.Acceleration) |  |  |
| gyro | [Gyro](#compass.harvest.v1alpha1.Gyro) |  |  |
| trip_id | [string](#string) |  |  |
| labels | [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry) | repeated |  |






<a name="compass.harvest.v1alpha1.PositionEvent.LabelsEntry"></a>

### PositionEvent.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="compass.harvest.v1alpha1.Trip"></a>

### Trip



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| trip_id | [string](#string) |  | Unique identifier for the trip. |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) |  |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) |  |  |
| position | [Position](#compass.harvest.v1alpha1.Position) | repeated |  |
| labels | [Trip.LabelsEntry](#compass.harvest.v1alpha1.Trip.LabelsEntry) | repeated |  |






<a name="compass.harvest.v1alpha1.Trip.LabelsEntry"></a>

### Trip.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |





 


<a name="compass.harvest.v1alpha1.TransportType"></a>

### TransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| TRANSPORT_TYPE_UNSPECIFIED | 0 |  |
| PRIVATE | 1 |  |
| PUBLIC | 2 |  |



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

