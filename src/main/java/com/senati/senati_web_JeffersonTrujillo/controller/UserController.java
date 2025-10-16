package com.senati.senati_web_JeffersonTrujillo.controller;

import com.senati.senati_web_JeffersonTrujillo.model.User;
import com.senati.senati_web_JeffersonTrujillo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @PostMapping("/api/user")
    public ResponseEntity<User> savaUser (@RequestBody User user) { return userService.SaveUser(user); }
    
}
