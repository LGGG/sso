package com.yufu.aserver.controller;

import com.yufu.aserver.service.AuthServerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    AuthServerHandler authServerHandler;

    @GetMapping("login")
    public Object login(){
        return authServerHandler.sayHiFromClientOne();
    }
}
