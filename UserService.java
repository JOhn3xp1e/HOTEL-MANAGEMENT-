package com.hotel.service;

import com.hotel.dao.UserDAO;
import com.hotel.model.User;
import java.sql.SQLException;

public class UserService {
    private final UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public boolean registerUser(User user) {
        try {
            return userDAO.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteUser(String username) {
        try {
            return userDAO.deleteUser(username);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User loginUser(String username, String password) {
        try {
            return userDAO.getUserByCredentials(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}