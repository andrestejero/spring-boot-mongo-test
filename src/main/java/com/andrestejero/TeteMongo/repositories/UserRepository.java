package com.andrestejero.TeteMongo.repositories;

import com.andrestejero.TeteMongo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByFirstName(String firstName);
}
