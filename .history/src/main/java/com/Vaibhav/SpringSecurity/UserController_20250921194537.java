package com.Vaibhav.SpringSecurity;

@RestController
public class UserController {
    
    @Autowire

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user){

    }
}
