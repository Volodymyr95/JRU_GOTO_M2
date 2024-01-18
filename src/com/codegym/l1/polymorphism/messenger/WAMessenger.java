package com.codegym.l1.polymorphism.messenger;

public class WAMessenger extends Messenger {

    @Override
    public void sentMessage() {
        System.out.println("sent via WA");
    }
}
