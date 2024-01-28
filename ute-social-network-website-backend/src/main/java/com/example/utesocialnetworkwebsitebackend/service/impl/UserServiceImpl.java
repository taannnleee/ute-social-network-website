package com.example.utesocialnetworkwebsitebackend.service.impl;

import com.example.utesocialnetworkwebsitebackend.eitities.User;
import com.example.utesocialnetworkwebsitebackend.repositories.UserRepository;
import com.example.utesocialnetworkwebsitebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByEmail() {
        User user = userRepository.findByEmail("letan").orElse(null);
        if (user != null) {
            return user;
        }
        return null;
    }

    public List<User> getAllUser() {
        if (userRepository == null) {
            // Xử lý trường hợp userRepository là null
            return Collections.emptyList();
        }

        List<User> listUser = userRepository.findAll();
        return listUser != null ? listUser : Collections.emptyList();
    }
}
