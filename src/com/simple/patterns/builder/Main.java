package com.simple.patterns.builder;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        Bang bang = new BangBuilder().getInstance();
        System.out.println(bang);
    }
}
