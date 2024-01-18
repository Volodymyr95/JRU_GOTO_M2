package com.codegym.l1.polymorphism.menu.oop;

import java.util.HashMap;
import java.util.Scanner;

public class OOPMain {
    public static void main(String[] args) {
        HashMap<Integer, Action> actions = new HashMap<>();
        actions.put(1, new ActionForOne());
        actions.put(2, new ActionForTwo());
        actions.put(3, new ActionForThree());

        System.out.println("Type number from 1 to 3");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //validation for i
        actions.get(i).execute();

    }
}
