package com.springsecurity.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping(value = "/admin")
    public String firstPage() {
        return "Hello World Admin authorization";
    }

    @GetMapping(value = "/user")
    public String userPage(){
       return "Hello User page";
    }

}
