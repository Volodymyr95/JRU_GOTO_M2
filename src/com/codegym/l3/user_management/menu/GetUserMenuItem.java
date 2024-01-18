package com.codegym.l3.user_management.menu;

public class GetUserMenuItem extends MenuItem {
    @Override
    public void action() {
        System.out.println("Type user id:");
        int userId = scanner.nextInt();
        userService.getUserById(userId);
    }
}
