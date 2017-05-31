package com.andrestejero.TeteMongo.services;

import com.andrestejero.TeteMongo.models.User;

import java.util.List;

public interface UserService {

    User findUser(String id);

    User findByName(String name);

    List<User> findUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    void deleteUsers();

    boolean isUserExist(User user);
}
