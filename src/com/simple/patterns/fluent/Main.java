package com.simple.patterns.fluent;

import java.time.LocalDate;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        FluentInterface fluent = new FluentInterface().getFluent()
                                                      .withValue(200.0)
                                                      .withDate(LocalDate.now());
        System.out.println(fluent);
    }
}
