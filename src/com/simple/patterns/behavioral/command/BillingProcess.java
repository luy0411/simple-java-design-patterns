package com.simple.patterns.behavioral.command;

public class BillingProcess implements Command{
    @Override
    public void execute() {
        System.out.println("Billing process...");
    }
}
