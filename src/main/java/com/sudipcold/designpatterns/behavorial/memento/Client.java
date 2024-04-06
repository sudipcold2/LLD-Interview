package com.sudipcold.designpatterns.behavorial.memento;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws Exception {
        BlackBox blackBox = new BlackBox(100L, 20.0, 36.5f);
        // Save the state of the memento as a byte stream.
        byte[] memento = new byte[0];
        try {
            memento = blackBox.getState();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Do some work.

        // Now restore the blackbox to the previous state
        blackBox = blackBox.setState(memento);
        System.out.println(blackBox);

    }
}
