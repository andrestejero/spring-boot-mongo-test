package com.andrestejero.TeteMongo.repositories;

import com.andrestejero.TeteMongo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.validation.constraints.NotNull;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByFirstName(@NotNull String firstName);

}
