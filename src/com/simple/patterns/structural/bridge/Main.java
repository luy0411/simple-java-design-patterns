package com.simple.patterns.structural.bridge;

public class Main {

    public static void main(String[] args) {
        final String message = "Testing 1 2 3";
        final CommunicationBridge common = new CommonTalk();
        common.sendMessage(null, message);
        System.out.println("#############");
        final CommunicationBridge logged = new LoggedTalk();
        logged.sendMessage("Luis",message);
    }

}
