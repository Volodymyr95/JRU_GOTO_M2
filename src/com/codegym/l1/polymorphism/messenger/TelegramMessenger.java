package com.codegym.l1.polymorphism.messenger;

public class TelegramMessenger extends Messenger {

    @Override
    public void sentMessage() {
        System.out.println("sent via Telegram");
    }
}
