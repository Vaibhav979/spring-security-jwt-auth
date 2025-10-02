package com.Vaibhav.SpringSecurity;

@RestController
public class UserController {
    
    @Autowired
    UserService service;

    public User registerUser(@RequestBody User registrationUser) {
        // Check if the username already exists
        
    }
}
