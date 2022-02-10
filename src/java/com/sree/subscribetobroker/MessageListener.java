/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sree.subscribetobroker;

import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 *
 * @author sreep
 */
public class MessageListener implements IMqttMessageListener{
    
    //This method is called when messages arrives
    @Override
    public void messageArrived(String string, MqttMessage mm) throws Exception {
         System.out.println(mm.toString());
    }
    
    
}
