package com.Vaibhav.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(HttpRequest request) {
        return "Hello, World!" + request.Session().getId();
    }
}
