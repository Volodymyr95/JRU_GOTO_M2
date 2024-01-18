package com.codegym.l3.user_management.menu;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<Integer, MenuItem> items =
            Map.of(1, new GetAllUserMenuItem(),
                    2, new AddUserMenuItem(),
                    3, new DeleteUserMenuItem(),
                    4, new GetUserMenuItem());

    public void run(int item) {
        MenuItem menuItem = items.get(item);
        menuItem.action();
    }
}
