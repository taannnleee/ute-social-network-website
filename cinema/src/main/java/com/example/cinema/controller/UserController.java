package com.example.cinema.controller;

import com.example.cinema.entity.User;
import com.example.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    //    @Autowired
//    private UserService userservice;
    private final UserService userservice;
    @GetMapping()
    public String g(){
        return "home";
    }

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }

    @PostMapping("/hi")
    public User add(@RequestBody User user) {
        return userservice.addUser(user);
    }

}
