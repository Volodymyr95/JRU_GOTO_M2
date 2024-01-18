package com.codegym.l1.polymorphism.menu;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        System.out.println("Type number from 1 to 3");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        //validation for i

        if (i == 1) {
            //Some logic for 1
            System.out.println("Some logic for 1");
        } else if (i == 2) {
            //Some logic for 2
            System.out.println("Some logic for 2");
        } else if (i == 3) {
            //Some logic for 3
            System.out.println("Some logic for 3");
        } else {
            System.out.println("Invalid input");
        }

    }
}
