package com.simple.patterns.observer;

import java.util.List;

/**
 * Created by lumi on 23/07/16.
 */
public class Processer {

    private List<Observer> observerList;

    public Processer(List<Observer> observerList) {
        this.observerList = observerList;
    }

    void doAnything(){
        callObservers();
        System.out.println("Doing anything...");
    }

    private void callObservers() {
        for (Observer observer : observerList) {
            observer.avisar();
        }
    }
}
