package com.simple.patterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        final ServicesFacade facade = new ServicesFacade();
        facade.doTheWholeThing();
    }
}
