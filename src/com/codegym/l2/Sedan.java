package com.codegym.l2;

public abstract class Sedan extends Car {
    public Sedan(String name, double price) {
        super(name, price);
    }

    public abstract void comfortDrive();
}
