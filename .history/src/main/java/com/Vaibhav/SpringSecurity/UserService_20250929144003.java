package com.Vaibhav.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole("USER");
        user.setEnabled(true);
        return repo.save(user);
    }

    public String login(User user) {
        User existingUser = repo.findByUsername(user.getUsername());
        if (existingUser != null && encoder.matches(user.getPassword(), existingUser.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}
