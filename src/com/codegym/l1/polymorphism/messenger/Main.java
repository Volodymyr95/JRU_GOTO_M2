package com.codegym.l1.polymorphism.messenger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("John", new EmailMessenger()));
        users.add(new User("Max", new TelegramMessenger()));
        users.add(new User("Ivan", new TelegramMessenger()));
        users.add(new User("Oleh", new WAMessenger()));
        users.add(new User("Taras", new EmailMessenger()));


        users.get(0).setMessenger(new TelegramMessenger());

        for (User u : users) {
            u.getMessenger().sentMessage();
        }
    }
}
