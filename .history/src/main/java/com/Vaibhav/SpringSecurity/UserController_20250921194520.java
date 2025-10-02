package com.Vaibhav.SpringSecurity;

@RestController
public class UserController {
    
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user){
        
    }
}
