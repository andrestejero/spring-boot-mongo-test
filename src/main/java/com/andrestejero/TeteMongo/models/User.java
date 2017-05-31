package com.andrestejero.TeteMongo.models;

import com.sun.istack.internal.Nullable;

public class User {

    @Nullable
    private final String firstName;

    @Nullable
    private final String lastName;

    public User(@Nullable String firstName, @Nullable String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Nullable
    public String getFirstName() {
        return firstName;
    }

    @Nullable
    public String getLastName() {
        return lastName;
    }
}
