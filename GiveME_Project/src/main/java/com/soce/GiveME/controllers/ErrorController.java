package com.soce.GiveME.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    String getError(){
        return "DEU ERRO MERMO";
    }
}
