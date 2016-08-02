package com.simple.patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        final LegacyDateAdapter adapter = new LegacyDateImpl();
        System.out.println(adapter.getDate());
    }
}
