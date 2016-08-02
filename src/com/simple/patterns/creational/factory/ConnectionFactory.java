package com.simple.patterns.creational.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private Connection connection;

    public Connection getConnection(){
        try {
            final String banco = System.getenv("tipoBanco");

            if (banco.equals("mysql"))
                connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
            else if (banco.equals("oracle"))
                connection =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:banco", "usuario", "senha");

            return connection;
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
