package com.example.utesocialnetworkwebsitebackend.controller;

import com.example.utesocialnetworkwebsitebackend.eitities.User;
import com.example.utesocialnetworkwebsitebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userid")
    public ResponseEntity<String> getUserEmail() {
        User user = userService.getUserByEmail();
        if (user != null) {
            return new ResponseEntity<>(user.getEmail(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/home")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.getAllUser();

        if (userList.isEmpty()) {
            System.out.println("Fail");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
