package com.blogrestapijava.models;

import com.blogrestapijava.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // You can define custom queries here if needed
}