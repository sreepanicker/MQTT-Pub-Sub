/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sree.subscribetobroker;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 *
 * @author sreep
 * This program subecribe to messages 
 */
public class SubscribeToBroker {
    public static void main(String[] args){
        //TOPIC where client is subscribing to it
        String topic        = "/decvice/DV1001";
        String broker       = "tcp://localhost:1883";
        String clientId     = "DV1001";  
        MemoryPersistence persistence = new MemoryPersistence();
        try{
             //Creating a client connection 
                MqttClient mqttClient = new MqttClient(broker, clientId,persistence);
                //Connection options 
                MqttConnectOptions connOpts = new MqttConnectOptions();
                connOpts.setCleanSession(true);
                //Connecting to broker 
                mqttClient.connect(connOpts);
                //Creating a message 
                mqttClient.subscribe(topic, new MessageListener());
            
            while(true){
                
            }
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
}
