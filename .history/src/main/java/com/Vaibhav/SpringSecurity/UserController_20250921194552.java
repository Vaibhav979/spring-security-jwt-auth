package com.Vaibhav.SpringSecurity;

@RestController
public class UserController {
    
    @Autowired
    private UserRepository rep

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user){

    }
}
