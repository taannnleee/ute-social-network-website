package com.example.cinema.service.Impl;

import com.example.cinema.entity.User;
import com.example.cinema.repositories.UserRepository;
import com.example.cinema.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
@Component
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        if(user!=null)
        {
            return (userRepository.save(user));
        }
        return null;
    }

}
