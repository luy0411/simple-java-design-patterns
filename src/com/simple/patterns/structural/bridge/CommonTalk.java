package com.simple.patterns.structural.bridge;

public class CommonTalk implements CommunicationBridge {
    @Override
    public void sendMessage(String sender, String message) {
        System.out.println("New message: " + message);
    }
}
