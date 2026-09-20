package com.spring.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String hello(Authentication auth) {
        return "Hello " + auth.getName() + "! you are authenticated";
    }

    @GetMapping("/profile")
    public String profile(Authentication auth) {
        return "User Profile - " + auth.getName();
    }

}
