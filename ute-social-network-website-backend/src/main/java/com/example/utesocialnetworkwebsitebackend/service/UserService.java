package com.example.utesocialnetworkwebsitebackend.service;

import com.example.utesocialnetworkwebsitebackend.eitities.User;

import java.util.List;

public interface UserService {
    public User getUserByEmail();
    public List<User> getAllUser();
}
