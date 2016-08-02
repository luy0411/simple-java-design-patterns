package com.simple.patterns.structural.bridge;

public interface CommunicationBridge {
    void sendMessage(final String sender,
                     final String message);
}
