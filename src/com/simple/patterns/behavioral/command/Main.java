package com.simple.patterns.behavioral.command;

public class Main {

    public static void main(String[] args) {
        final ProcessingQueue queue = new ProcessingQueue();
        queue.addCommand(new StartingProcess());
        queue.addCommand(new PayingProcess());
        queue.addCommand(new BillingProcess());

        queue.execute();
    }
}
