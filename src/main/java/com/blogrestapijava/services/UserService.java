package com.blogrestapijava.services;

import com.blogrestapijava.models.User;
import com.blogrestapijava.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Add other business logic as needed

    @Scheduled(fixedDelay = 5000) // Execute the method every 5 seconds
    public void runBackgroundTask() {
        // Perform your background task here
        System.out.println("Background task running...");
    }
}