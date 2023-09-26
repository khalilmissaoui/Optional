package org.mk;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<User> users = new ArrayList<>();

    public Database (){
        User user1 = new User("khalil");
        User user2 = new User("chroufa");
        this.users.add(user2);
        this.users.add(user1);
    }

    public User getUser(String name) {
        for (User user: users ) {
            if (user.name.equals(name))
                return user;
        }
        return null;
    }
}
