package com.andrestejero.TeteMongo.models;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    public User(){}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
