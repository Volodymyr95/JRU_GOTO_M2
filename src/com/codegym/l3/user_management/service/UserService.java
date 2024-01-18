package com.codegym.l3.user_management.service;

import com.codegym.l3.user_management.datastore.UserDB;
import com.codegym.l3.user_management.model.User;

public class UserService {

    private UserDB userDB = new UserDB();

    public void getAllUsers() {
        System.out.println(userDB.getAll());
    }

    public void addNewUser(User user) {
        userDB.add(user);
    }

    public void deleteUser(int userId) {
        User user = userDB.getById(userId);
        if (user == null) {
            System.out.println("User by Id not found!");
        } else {
            userDB.deleteById(userId);
        }
    }

    public void getUserById(int userId) {
        System.out.println(userDB.getById(userId));
    }

}
