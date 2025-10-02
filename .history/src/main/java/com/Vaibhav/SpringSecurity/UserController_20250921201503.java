package com.Vaibhav.SpringSecurity;

@RestController
public class UserController {
    
    @Autowired
    UserService seriv

    public ResponseEntity<String> registerUser(@RequestBody User registrationUser) {
        // Check if the username already exists
        if (userRepository.findByUsername(registrationUser.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body("Username is already taken!");
        }

        // Encode the password before saving
        String encodedPassword = passwordEncoder.encode(registrationUser.getPassword());
        registrationUser.setPassword(encodedPassword);
        registrationUser.setRole("USER"); // Default role
        registrationUser.setEnabled(true);

        userRepository.save(registrationUser);

        return ResponseEntity.ok("User registered successfully!");
    }
}
