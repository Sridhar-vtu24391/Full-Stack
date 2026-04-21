package com.example.userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "User " + id + " from User-Service";
    }
}