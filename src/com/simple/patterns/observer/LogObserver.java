package com.simple.patterns.observer;

/**
 * Created by lumi on 23/07/16.
 */
public class LogObserver implements Observer{

    @Override
    public void avisar() {
        System.out.println("Avisou o logger...");
    }
}
