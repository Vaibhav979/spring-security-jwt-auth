package com.Vaibhav.SpringSecurity;

@Service
public class UserService {
    
    @Autowired
    UserRepository repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    
}
