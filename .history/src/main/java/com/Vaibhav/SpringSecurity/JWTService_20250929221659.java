package com.Vaibhav.SpringSecurity;

import org.springframework.stereotype.Service;

@Service
public class JWTService {

    public String generateToken(String username) {

        Map<String, Object> claims = new HashMap<>();

        return Jwts.builder()
                .claims()
                .subjet(username)
                .issuedAt(new Date(System.currentTimeMills))
    }
}
