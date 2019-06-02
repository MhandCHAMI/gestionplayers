package com.checkconsulting.back.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authent")
public class AuthentController {


    @GetMapping("/isAuthenticated")
    public String isAuthenticated() {
        return "test ok modifié sur develop test push";
    }
}
