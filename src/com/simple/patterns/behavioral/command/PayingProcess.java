package com.simple.patterns.behavioral.command;

public class PayingProcess implements Command {
    @Override
    public void execute() {
        System.out.println("Paying process...");
    }
}
