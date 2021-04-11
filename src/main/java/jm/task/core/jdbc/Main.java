package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService u1 = new UserServiceImpl();

        u1.createUsersTable();

        u1.saveUser("Alex", "Shepard", (byte) 34);
        u1.saveUser("Dino", "Baggio", (byte) 45);
        u1.saveUser("Gabriel", "Batistuta", (byte) 44);
        u1.saveUser("Predrag", "Mijatovic", (byte) 47);

        System.out.println(u1.getAllUsers());

        u1.cleanUsersTable();

        u1.dropUsersTable(); // реализуйте алгоритм здесь
    }
}