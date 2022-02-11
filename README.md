This program demonstrates the usage of an MQTT broker and how a client can subscribe and publish events to the broker. 
MQTT protocol is a lightweight telemetry protocol for constraint devices. MQTT protocol is defacto standard in the IoT platform and is supported by many cloud vendors. There are multiple versions of the protocol, the latest being MQTT 5.0. We need a Broker that supports the MQTT protocol to use the MQTT protocol. 


This program uses Eclipse Mosquitto broker, an open-source implementation of the MQTT 5.0 protocol. It is available in the following location, https://mosquitto.org/download/.
The application can publish or subscribe to the broker using MQTT client libraries. This java program use Paho open-source library, and it is available in the following location, 
https://www.eclipse.org/paho/
