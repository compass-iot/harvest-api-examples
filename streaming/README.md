# Compass ingest examples
- Repo contains examples of how to use the compass ingest apis
- There are two types of api, straight http (see curl directory) and a grpc based api.
- Minimal examples of grpc api usage are available in several languages
- Grpc api does not yet support streaming, but may in the future
- The api key provided in the examples is a real key that undergoes all the validation logic but does not write anything to our databases (this is useful for testing, but please use the api key given to you by us!)

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
    - [PartialEventAcceleration](#compass.harvest.v1alpha1.PartialEventAcceleration)
    - [PartialEventFuelOrCharge](#compass.harvest.v1alpha1.PartialEventFuelOrCharge)
    - [PartialEventGyro](#compass.harvest.v1alpha1.PartialEventGyro)
    - [PartialEventLatLng](#compass.harvest.v1alpha1.PartialEventLatLng)
    - [PartialEventMetadataJSON](#compass.harvest.v1alpha1.PartialEventMetadataJSON)
    - [PartialEventMetadataKV](#compass.harvest.v1alpha1.PartialEventMetadataKV)
    - [PartialEventMetadataKV.LabelsEntry](#compass.harvest.v1alpha1.PartialEventMetadataKV.LabelsEntry)
    - [PartialEventOdo](#compass.harvest.v1alpha1.PartialEventOdo)
    - [PartialVehicleMetadataJSON](#compass.harvest.v1alpha1.PartialVehicleMetadataJSON)
    - [PartialVehicleMetadataKV](#compass.harvest.v1alpha1.PartialVehicleMetadataKV)
    - [PartialVehicleMetadataKV.LabelsEntry](#compass.harvest.v1alpha1.PartialVehicleMetadataKV.LabelsEntry)
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
| InsertPartialLatLng | [PartialEventLatLng](#compass.harvest.v1alpha1.PartialEventLatLng) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialEventAcceleration | [PartialEventAcceleration](#compass.harvest.v1alpha1.PartialEventAcceleration) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialEventGyro | [PartialEventGyro](#compass.harvest.v1alpha1.PartialEventGyro) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialEventOdo | [PartialEventOdo](#compass.harvest.v1alpha1.PartialEventOdo) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialEventFuelOrCharge | [PartialEventFuelOrCharge](#compass.harvest.v1alpha1.PartialEventFuelOrCharge) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialEventMetadataKV | [PartialEventMetadataKV](#compass.harvest.v1alpha1.PartialEventMetadataKV) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialEventMetadataJSON | [PartialEventMetadataJSON](#compass.harvest.v1alpha1.PartialEventMetadataJSON) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialVehicleMetadataKV | [PartialVehicleMetadataKV](#compass.harvest.v1alpha1.PartialVehicleMetadataKV) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| InsertPartialVehicleMetadataJSON | [PartialVehicleMetadataJSON](#compass.harvest.v1alpha1.PartialVehicleMetadataJSON) | [.google.protobuf.Empty](#google.protobuf.Empty) |  |
| BatchInsert | [BatchInsertRequest](#compass.harvest.v1alpha1.BatchInsertRequest) | [BatchInsertResponse](#compass.harvest.v1alpha1.BatchInsertResponse) |  |

 



<a name="compass/harvest/v1alpha1/position_event.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/harvest/v1alpha1/position_event.proto



<a name="compass.harvest.v1alpha1.Acceleration"></a>

### Acceleration
Acceleration is measured in gforce
so if the vehicle is accelerating at 9.8m/s^2 (newtons) in the x axis,
the input to this api should be Acceleration { 1, 0, 0 }
if it is decelerating at 1m/s^2, the input to this api should be { -0.102, 0, 0 } (0.102 ~= 1/9.8)
if this is confusing, don&#39;t worry to hard about getting it correct, we can apply provider specific unit conversions post ingestion, just be consistent and let us know
Note that the vertical axis in the diagram is the z axis, not the y axis
Also note the &#43; and - signs in the diagram which direction should be positive and negative within each axis

![alt text](https://storage.googleapis.com/compass-public-docs/static/acc_gyro.png)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| x | [double](#double) | optional | acceleration / braking |
| y | [double](#double) | optional | side to side / turning force |
| z | [double](#double) | optional | vertical up / down force |






<a name="compass.harvest.v1alpha1.Gyro"></a>

### Gyro
Rotational data is measured in degrees per second
A positive value for roll, pitch or yaw is defined in the anti-clockwise direction when facing the positive direction of it&#39;s axis

See acceleration diagram for more details


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| roll | [double](#double) | optional |  |
| pitch | [double](#double) | optional |  |
| yaw | [double](#double) | optional |  |






<a name="compass.harvest.v1alpha1.PartialEventAcceleration"></a>

### PartialEventAcceleration



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| timestamp | [int64](#int64) | required |  |
| x | [double](#double) | optional |  |
| y | [double](#double) | optional |  |
| z | [double](#double) | optional |  |






<a name="compass.harvest.v1alpha1.PartialEventFuelOrCharge"></a>

### PartialEventFuelOrCharge



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| timestamp | [int64](#int64) | required |  |
| fuel_or_charge | [double](#double) | required |  |






<a name="compass.harvest.v1alpha1.PartialEventGyro"></a>

### PartialEventGyro



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| timestamp | [int64](#int64) | required |  |
| roll | [double](#double) | required |  |
| pitch | [double](#double) | required |  |
| yaw | [double](#double) | required |  |






<a name="compass.harvest.v1alpha1.PartialEventLatLng"></a>

### PartialEventLatLng



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| timestamp | [int64](#int64) | required |  |
| longitude | [double](#double) | required |  |
| latitude | [double](#double) | required |  |






<a name="compass.harvest.v1alpha1.PartialEventMetadataJSON"></a>

### PartialEventMetadataJSON



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| timestamp | [int64](#int64) | required |  |
| json_metadata | [string](#string) | required |  |






<a name="compass.harvest.v1alpha1.PartialEventMetadataKV"></a>

### PartialEventMetadataKV



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| timestamp | [int64](#int64) | required |  |
| labels | [PartialEventMetadataKV.LabelsEntry](#compass.harvest.v1alpha1.PartialEventMetadataKV.LabelsEntry) | repeated |  |






<a name="compass.harvest.v1alpha1.PartialEventMetadataKV.LabelsEntry"></a>

### PartialEventMetadataKV.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) | optional |  |
| value | [string](#string) | optional |  |






<a name="compass.harvest.v1alpha1.PartialEventOdo"></a>

### PartialEventOdo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| timestamp | [int64](#int64) | required |  |
| odo | [double](#double) | required |  |






<a name="compass.harvest.v1alpha1.PartialVehicleMetadataJSON"></a>

### PartialVehicleMetadataJSON



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) | optional |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) | optional |  |
| json_metadata | [string](#string) | required |  |






<a name="compass.harvest.v1alpha1.PartialVehicleMetadataKV"></a>

### PartialVehicleMetadataKV



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| region | [string](#string) | required |  |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) | optional |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) | optional |  |
| labels | [PartialVehicleMetadataKV.LabelsEntry](#compass.harvest.v1alpha1.PartialVehicleMetadataKV.LabelsEntry) | repeated |  |






<a name="compass.harvest.v1alpha1.PartialVehicleMetadataKV.LabelsEntry"></a>

### PartialVehicleMetadataKV.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) | optional |  |
| value | [string](#string) | optional |  |






<a name="compass.harvest.v1alpha1.Position"></a>

### Position



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latlng | [compass.type.geo.LatLng](#compass.type.geo.LatLng) | required | lat and lng of the vehicle position |
| speed | [double](#double) | optional | speed of vehicle in km/h |
| bearing | [double](#double) | optional | [optional] bearing of vehicle in degrees [0, 360) |






<a name="compass.harvest.v1alpha1.PositionEvent"></a>

### PositionEvent
- Either VehicleID or TripID MUST be present.
- Ideally both, followed by just VehicleID, followed by just TripID.
- Position, VehicleType and TransportType are required
- Any extra metadata can be added in &#39;labels&#39; and will be greatly appreciated!


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vehicle_id | [string](#string) | required |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) | required |  |
| transport_type | [TransportType](#compass.harvest.v1alpha1.TransportType) | optional |  |
| vehicle_type | [VehicleType](#compass.harvest.v1alpha1.VehicleType) | optional |  |
| position | [Position](#compass.harvest.v1alpha1.Position) | required |  |
| acceleration | [Acceleration](#compass.harvest.v1alpha1.Acceleration) | optional |  |
| gyro | [Gyro](#compass.harvest.v1alpha1.Gyro) | optional |  |
| trip_id | [string](#string) | optional | Id linking points of the same trip |
| provider | [string](#string) | optional |  |
| labels | [PositionEvent.LabelsEntry](#compass.harvest.v1alpha1.PositionEvent.LabelsEntry) | repeated | extra metadata not suppported by our api that may be useful :) |






<a name="compass.harvest.v1alpha1.PositionEvent.LabelsEntry"></a>

### PositionEvent.LabelsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) | optional |  |
| value | [string](#string) | optional |  |





 


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
| LCV | 5 |  |
| HCV | 6 |  |


 

 

 



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

- [compass/iam/permission.proto](#compass/iam/permission.proto)
    - [Permission](#compass.iam.Permission)
  
    - [File-level Extensions](#compass/iam/permission.proto-extensions)
  
- [compass/iam/token.proto](#compass/iam/token.proto)
    - [Token](#compass.iam.Token)
  
- [Scalar Value Types](#scalar-value-types)



<a name="compass/iam/permission.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/iam/permission.proto



<a name="compass.iam.Permission"></a>

### Permission



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | &lt;service&gt;.&lt;resource&gt;.&lt;verb&gt; (For example: compass.users.list) |





 

 


<a name="compass/iam/permission.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| permission | Permission | .google.protobuf.MethodOptions | 50000 |  |

 

 



<a name="compass/iam/token.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/iam/token.proto



<a name="compass.iam.Token"></a>

### Token



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user_id | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | if user_id is null, token is a workspace token and email should be null |
| workspace_id | [int64](#int64) |  |  |
| email | [string](#string) |  |  |
| workspace | [string](#string) |  |  |
| admin | [bool](#bool) |  |  |
| geofence | [compass.type.geo.Region](#compass.type.geo.Region) |  |  |
| home | [compass.type.geo.LatLng32](#compass.type.geo.LatLng32) |  |  |
| vins | [string](#string) | repeated |  |





 

 

 

 



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

- [compass/type/geo/geo.proto](#compass/type/geo/geo.proto)
    - [BoundingBox](#compass.type.geo.BoundingBox)
    - [LatLng](#compass.type.geo.LatLng)
    - [LatLng32](#compass.type.geo.LatLng32)
    - [Path](#compass.type.geo.Path)
    - [Region](#compass.type.geo.Region)
  
- [Scalar Value Types](#scalar-value-types)



<a name="compass/type/geo/geo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## compass/type/geo/geo.proto



<a name="compass.type.geo.BoundingBox"></a>

### BoundingBox



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| north_eastern | [LatLng](#compass.type.geo.LatLng) |  |  |
| south_western | [LatLng](#compass.type.geo.LatLng) |  |  |






<a name="compass.type.geo.LatLng"></a>

### LatLng
An object representing a latitude/longitude pair. This is expressed as a pair
of doubles representing degrees latitude and degrees longitude. Unless
specified otherwise, this must conform to the
&lt;a href=&#34;http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf&#34;&gt;WGS84
standard&lt;/a&gt;. Values must be within normalized ranges.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latitude | [double](#double) |  | The latitude in degrees. It must be in the range [-90.0, &#43;90.0]. |
| longitude | [double](#double) |  | The longitude in degrees. It must be in the range [-180.0, &#43;180.0]. |






<a name="compass.type.geo.LatLng32"></a>

### LatLng32



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latitude | [float](#float) |  | The latitude in degrees. It must be in the range [-90.0, &#43;90.0]. |
| longitude | [float](#float) |  | The longitude in degrees. It must be in the range [-180.0, &#43;180.0]. |






<a name="compass.type.geo.Path"></a>

### Path



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| points | [LatLng](#compass.type.geo.LatLng) | repeated |  |






<a name="compass.type.geo.Region"></a>

### Region



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| points | [LatLng32](#compass.type.geo.LatLng32) | repeated |  |





 

 

 

 



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

