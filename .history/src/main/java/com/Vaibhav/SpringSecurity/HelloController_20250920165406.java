package com.Vaibhav.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;


@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(HttpRequest request) {
        return "Hello, World!" + request.getSession().getId();
    }
}
