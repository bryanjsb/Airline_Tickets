package com.airline.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bryan
 */
import com.airline.logic.User.User;
import com.airline.logic.User.DaoUser;

public class LoginModel {

    public boolean verifyAuth(String user, String pass) {
        return daoUser.verifyAuth(user, pass);
    }

    public void addUser(User user) {
        daoUser.addUser(user);
    }

    public void addUser(String id, String user, String pass, String Role) {
        addUser(new User(id, user, pass, Role));
    }

    public User getUserById(String id) {
        return daoUser.getUserById(id).get();
    }

    public User getUserByUser(String user) {
        return daoUser.getUserByUser(user).get();
    }

    public boolean updateUser(User user) {
        return daoUser.updateUser(user);
    }

    public boolean deleteUser(String user) {
        return daoUser.DeleteUser(user);
    }

    public LoginModel() {
        daoUser = DaoUser.getInstance();
    }

    public static LoginModel getInstance() {
        if (loginModel == null) {
            loginModel = new LoginModel();
        }
        return loginModel;
    }

    private static LoginModel loginModel = null;

    private final DaoUser daoUser;
}
