package com.soce.GiveME.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    String getAllUsers(){
        return "testee";
    }

//    @GetMapping("/error")
//    String getErrorMessage(){
//        return "foi mal";
//    }
}
