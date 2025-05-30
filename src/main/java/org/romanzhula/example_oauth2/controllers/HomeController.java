package org.romanzhula.example_oauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to home page!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Welcome auth-ted user!";
    }

}
