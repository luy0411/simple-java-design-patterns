package com.simple.patterns.creational.factory;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection c = factory.getConnection();
    }
}
