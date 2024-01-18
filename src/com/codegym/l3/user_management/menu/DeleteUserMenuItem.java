package com.codegym.l3.user_management.menu;

public class DeleteUserMenuItem extends MenuItem {
    @Override
    public void action() {
        System.out.println("Type user Id:");
        int userId = scanner.nextInt();
        userService.deleteUser(userId);
    }
}
