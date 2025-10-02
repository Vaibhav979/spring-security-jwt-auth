package com.Vaibhav.SpringSecurity;

@RestController
public class UserController {
    
    @Autowired
    UserService service;

    public ResponseEntity<String> registerUser(@RequestBody User registrationUser) {
        // Check if the username already exists
        
    }
}
