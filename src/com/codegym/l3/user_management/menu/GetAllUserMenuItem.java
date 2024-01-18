package com.codegym.l3.user_management.menu;

public class GetAllUserMenuItem extends MenuItem {
    @Override
    public void action() {
        System.out.println("All users:");
        userService.getAllUsers();
    }
}
