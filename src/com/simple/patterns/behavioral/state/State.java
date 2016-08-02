package com.simple.patterns.behavioral.state;

/**
 * Created by lumi on 24/07/16.
 */
public enum State implements StateAction {
    STATE_A,
    STATE_B{
        @Override
        public void doThat() {
            System.out.println("Doing STATE_B stuff...");
        }
    },
    STATE_C{
        @Override
        public void doThat() {
            System.out.println("Doing STATE_C stuff...");
        }
    },
    STATE_D{
        @Override
        public void doThat() {
            throw new RuntimeException("STATE_D wants you to fuck off!");
        }
    };

    public void doThat() {
        System.out.println("Doing default stuff...");
    }
}
