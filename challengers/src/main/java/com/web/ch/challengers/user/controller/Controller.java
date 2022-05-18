package com.web.ch.challengers.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/user")
    public String PageSignUp(){
        return "user/signUp";
    }

}
