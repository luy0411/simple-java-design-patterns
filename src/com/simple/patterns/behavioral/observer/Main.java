package com.simple.patterns.behavioral.observer;

import java.util.Arrays;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        Processer processer = new Processer(Arrays.asList(new DBObserver(),new LogObserver()));
        processer.doAnything();
    }
}
