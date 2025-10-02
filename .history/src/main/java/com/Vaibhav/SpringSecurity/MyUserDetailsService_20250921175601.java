package com.Vaibhav.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // --- ADDED FOR DEBUGGING ---
        System.out.println("Attempting to load user by username: " + username);
        // --- END DEBUGGING ---
        
        User user = userRepository.findByUsername(username);
        if (user == null) {
            // --- ADDED FOR DEBUGGING ---
            System.out.println("User '" + username + "' not found in the database.");
            // --- END DEBUGGING ---
            throw new UsernameNotFoundException("User not found");
        }
        
        // --- ADDED FOR DEBUGGING ---
        System.out.println("User '" + username + "' found. Returning UserPrincipal.");
        // --- END DEBUGGING ---
        
        return new UserPrincipal(user);

}