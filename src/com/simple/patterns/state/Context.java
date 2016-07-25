package com.simple.patterns.state;

/**
 * Created by lumi on 24/07/16.
 */
public class Context {

    State state = State.STATE_A;

    public void doSomething() {
        state.doThat();
    }

    public void changeState(State state) {
        this.state = state;
    }

}
