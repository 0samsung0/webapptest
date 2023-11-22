package com.example.practisewithoutsequrity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/admin/hello")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminHello() {
        return "Hello Admin!";
    }

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello Public!";
    }
}