package com.spring.security.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String dashbaord() {
        return "Welcome to Admin Dashboard";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable long id) {
        return "Admin deleted user -" + id;
    }

}
