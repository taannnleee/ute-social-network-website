package com.example.cinema.service;

import com.example.cinema.entity.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
@Primary
public interface UserService {
    public  User addUser(User user);
}
