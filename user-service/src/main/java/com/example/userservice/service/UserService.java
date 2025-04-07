package com.example.userservice.service;

import com.example.userservice.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User createUser(User user);
}
