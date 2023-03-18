package com.akshar.controller;

import com.akshar.dto.LoginRequest;
import com.akshar.dto.ProductRequest;
import com.akshar.exception.LoginException;
import com.akshar.model.Product;
import com.akshar.model.User;
import com.akshar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")

public class AuthController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/login")
    ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
        Optional<User> user = userRepository.findByEmailId(loginRequest.getEmailId());
        if (user.isPresent()) {
            if (user.get().getPassword().equals(loginRequest.getPassword())) {
                return new ResponseEntity<>(user.get(), HttpStatus.OK);

            } else {
                throw new LoginException("Invalid EmailId or Password");
            }

        } else {
            throw new LoginException("Invalid EmailId or Password");
        }


    }
}
