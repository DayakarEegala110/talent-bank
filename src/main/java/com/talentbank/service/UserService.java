package com.talentbank.service;

import java.util.List;

import com.talentbank.model.User;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
}
