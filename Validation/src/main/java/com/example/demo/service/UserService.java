package com.example.demo.service;

import com.example.demo.exception.AuthenticationException;
import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User register(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new AuthenticationException("Email already exist");
        }
        return userRepository.save(user);
    }
}
