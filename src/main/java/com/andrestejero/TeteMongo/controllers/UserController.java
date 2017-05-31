package com.andrestejero.TeteMongo.controllers;

import com.andrestejero.TeteMongo.models.User;
import com.andrestejero.TeteMongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("/")
    public String getHome() {
        return "Ejemplos con Spring Boot";
    }

    @RequestMapping("/user")
    public User getUser() {
        return new User("Andres", "Tejero");
    }

    @RequestMapping("/save")
    public String saveUsers() {
        repository.deleteAll();
        //repository.save(new User("Andres", "Tejero"));
        //repository.save(new User("Jose", "Perez"));
        //repository.save(new User("Pepe", "Gomez"));
        return "Saved";
    }

    @RequestMapping("/users")
    public List<User> getUsers() {
        return repository.findAll();
    }
}
