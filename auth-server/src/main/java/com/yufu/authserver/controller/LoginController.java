package com.yufu.authserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth-server")
public class LoginController {

    @GetMapping("/login")
    public Object login(){
        return "hello world!";
    }
}
