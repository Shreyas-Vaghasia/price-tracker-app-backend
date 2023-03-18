package com.akshar;

import com.akshar.model.User;
import com.akshar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class PriceTrackerAppBackendApplication  {
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(PriceTrackerAppBackendApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
////        User user = new User();
////        user.setRole("ADMIN");
////        user.setEmailId("test@gmail.com");
////        user.setPassword("test");
////        userRepository.save(user);
//        User user = new User();
//        user.setRole("USER");
//        user.setEmailId("user@gmail.com");
//        user.setPassword("user");
//        userRepository.save(user);
//    }
}
