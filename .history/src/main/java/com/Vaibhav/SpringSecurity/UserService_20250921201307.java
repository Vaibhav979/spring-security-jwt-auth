package com.Vaibhav.SpringSecurity;

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
}
