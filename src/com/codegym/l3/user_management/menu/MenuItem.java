package com.codegym.l3.user_management.menu;

import com.codegym.l3.user_management.service.UserService;

import java.util.Scanner;

public abstract class MenuItem { // MenuItem extends UserService  menuItem is not a menuService
    protected UserService userService = new UserService(); // HAS A
    protected Scanner scanner = new Scanner(System.in);

    public abstract void action();
}
