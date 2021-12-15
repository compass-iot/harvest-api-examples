# harvest-api-examples

This repo contains examples on how to use our harvest api to send data to us

There are two major types of apis, the batching api and the streaming api
- The batching api is more awkward to use but will more likely be more efficient, though this should depend on your existing setup
- The streaming api should be simpler to use, it has language specific examples that use unary grpc and a basic json-http api if your language specific example is not present

Further documentation on the format and units are found within the folder of each of these
