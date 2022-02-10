/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sree.publishmessagetobroker;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 *
 * @author sreep
 * This program publish message to IOT Broker 
 */
public class PublishMessageToBroker {
    
    public static void main(String[] args){
            String topic        = "/decvice/DV1002";
            String content      = "Message from DV1000";          
            String broker       = "tcp://localhost:1883";
            String clientId     = "DV1000";
            MemoryPersistence persistence = new MemoryPersistence();
            try{
                //Creating a client connection 
                MqttClient mqttClient = new MqttClient(broker, clientId, persistence);
                //Connection options 
                MqttConnectOptions connOpts = new MqttConnectOptions();
                connOpts.setCleanSession(true);
                //Connecting to broker 
                mqttClient.connect(connOpts);
                //Creating a message 
                MqttMessage message = new MqttMessage(content.getBytes());
                //Setting QoS to Zero 
                message.setQos(0);
                mqttClient.publish(topic, message);
                System.out.println("Successfully Published messages");
                mqttClient.disconnect();
                System.exit(0);
            }catch(Exception e){
                System.out.println(e);
            }
                    
        
        
    }
}
