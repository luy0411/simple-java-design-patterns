package com.simple.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ProcessingQueue {

    private List<Command> commands;

    public ProcessingQueue() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(final Command command){
        this.commands.add(command);
    }

    public void execute(){
        for (final Command command : commands) {
            command.execute();
        }
    }
}
