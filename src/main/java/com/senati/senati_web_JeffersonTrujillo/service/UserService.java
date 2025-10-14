package com.senati.senati_web_JeffersonTrujillo.service;

import com.senati.senati_web_JeffersonTrujillo.model.User;
import com.senati.senati_web_JeffersonTrujillo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
