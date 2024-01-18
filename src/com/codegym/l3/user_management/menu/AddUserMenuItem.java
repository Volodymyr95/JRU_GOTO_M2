package com.codegym.l3.user_management.menu;

import com.codegym.l3.user_management.model.User;

public class AddUserMenuItem extends MenuItem {
    @Override
    public void action() {
        System.out.println("Type username:");
        String username = scanner.nextLine();
        userService.addNewUser(new User(username));
    }
}
