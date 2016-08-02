package com.simple.patterns.behavioral.state;

/**
 * Created by lumi on 24/07/16.
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.doSomething();

        context.changeState(State.STATE_B);
        context.doSomething();

        context.changeState(State.STATE_C);
        context.doSomething();

        context.changeState(State.STATE_D);

        context.doSomething();
    }
}
