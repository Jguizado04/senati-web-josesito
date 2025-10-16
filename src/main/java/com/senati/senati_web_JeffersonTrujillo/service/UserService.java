package com.senati.senati_web_JeffersonTrujillo.service;

import com.senati.senati_web_JeffersonTrujillo.model.User;
import com.senati.senati_web_JeffersonTrujillo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public ResponseEntity<User> SaveUser(@RequestBody User user){
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);

    }





}
