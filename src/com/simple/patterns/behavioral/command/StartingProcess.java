package com.simple.patterns.behavioral.command;

public class StartingProcess implements Command {
    @Override
    public void execute() {
        System.out.println("Starting process...");
    }
}
