package com.codegym.l3.user_management;

import com.codegym.l3.user_management.exception.InvalidUserArgumentException;
import com.codegym.l3.user_management.menu.Menu;

import java.util.Scanner;

public class UserManagementMain {
    private static final String MENU_INFO = """
                    1 - Get All Users
                    2 - Add new user
                    3 - Delete user by Id
                    4 - Get user by Id
                    0 - Exit
            """;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println(MENU_INFO);
            int userInput = scanner.nextInt();
            userInputValidation(userInput);
            if (userInput == 0) {
                isRunning = false;
                System.out.println("Bye!");
            } else {
                new Menu().run(userInput);
            }
        }
    }

    private static void userInputValidation(int userInput) {
        int firstItemNumber = 0;
        int lastItemNumber = 4;
        if (userInput > lastItemNumber || userInput < firstItemNumber) {
            throw new InvalidUserArgumentException(
                    String.format("%d is out of the scope", userInput));
        }
    }
}
