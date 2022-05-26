package com.web.ch.challengers.user.controller;
import com.web.ch.challengers.user.domain.UserVO;
import com.web.ch.challengers.user.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController

@RequestMapping(path ="/user")
public class RestController {
    @Autowired
    UserService service;

    @GetMapping(path = "/userList") //전체조회(관리자)
    public List<UserVO> userList(){return service.readAll(); }

    @GetMapping(path = "/readUser/{id}") //id로 상세조회(관리자)
    public UserVO readUser(@PathVariable int id){
        return service.read(id);
    }
    @PostMapping(path = "/modifyUserInfo") //회원정보수정(유저)
    public int modifyUserInfo(@RequestBody UserVO vo){
        return service.modifyUser(vo);
    }

    @PostMapping(path = "/signUp") //회원가입
    public int registerUser(UserVO vo){
        vo.setUserStatus("y");
        vo.setUserLevel(("새내기"));
        return service.insertUser(vo);
    }

}
