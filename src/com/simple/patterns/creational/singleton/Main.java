package com.simple.patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        final Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        final Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.hashCode());
    }
}
