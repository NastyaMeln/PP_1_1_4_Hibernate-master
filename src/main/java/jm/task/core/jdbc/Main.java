package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Tanya", "Timuraeva", (byte) 27);
        userService.saveUser("Stanislav", "Timuraev", (byte) 34);
        userService.saveUser("Natalia", "Timuraeva", (byte) 55);
        userService.saveUser("Vita", "Timuraeva", (byte) 6);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();

        //userService.removeUserById(3);
    }
}
