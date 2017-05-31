package com.andrestejero.TeteMongo.services;

import com.andrestejero.TeteMongo.models.User;
import com.andrestejero.TeteMongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findUser(String id) {
        return repository.findOne(id);
    }

    @Override
    public User findByName(String name) {
        return repository.findByFirstName(name);
    }

    @Override
    public List<User> findUsers() {
        return repository.findAll();
    }

    @Override
    public void saveUser(User user) {
        repository.save(user);
    }

    @Override
    public void updateUser(User user) {
        repository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        repository.delete(user);
    }

    @Override
    public void deleteUsers() {
        repository.deleteAll();
    }

    @Override
    public boolean isUserExist(User user) {
        return findByName(user.getFirstName())!=null;
    }
}
