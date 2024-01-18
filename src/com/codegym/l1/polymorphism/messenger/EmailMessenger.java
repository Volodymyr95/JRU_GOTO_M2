package com.codegym.l1.polymorphism.messenger;

public class EmailMessenger extends Messenger {
    @Override
    public void sentMessage() {
        System.out.println("sent via email");
    }
}
