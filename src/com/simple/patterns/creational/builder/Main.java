package com.simple.patterns.creational.builder;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        final Bang simpleBang = new BangBuilder().getSimpleBang("Luis");
        System.out.println(simpleBang);

        final Bang complexBang = new BangBuilder().getComplexBang("Luis",200.0,"123455434123");
        System.out.println(complexBang);
    }
}
