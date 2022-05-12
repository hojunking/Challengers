package com.web.ch.challengers.user.controller;

import com.web.ch.challengers.user.domain.UserVO;
import com.web.ch.challengers.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController

@RequestMapping(path ="/user")
public class RestController {
    @Autowired
    UserService service;

    @GetMapping(path = "/userList")
    public List<UserVO> userList(){return service.readAll(); }

    @PostMapping(path = "/modifyUserInfo")
    public int modifyUserInfo(UserVO vo){
        return 1;
    }
}
