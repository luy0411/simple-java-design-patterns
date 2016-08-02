package com.simple.patterns.structural.bridge;

public class LoggedTalk implements CommunicationBridge{
    @Override
    public void sendMessage(String sender, String message) {
        System.out.println(sender + " - " + message);
    }
}
