package com.codegym.l2;

public class Audi extends Car {

    public Audi(String name, double price) {
        super(name, price);
    }

    @Override
    public void drive() {
        System.out.println("Audi drive");
    }
}
