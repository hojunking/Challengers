package com.web.ch.test.controller;

import com.web.ch.test.domain.EmployeeVO;
import com.web.ch.test.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    EmployeesService service;

    //전체조회
    @GetMapping(path = "/emp")
    public List<EmployeeVO> empGet(){
        return service.getList();
    }
    //단건조회
    @GetMapping("/emp/{id}")
    public EmployeeVO getOne(@PathVariable int id){
        EmployeeVO vo =new EmployeeVO();
        vo.setEmployeeId(id);
        return service.read(vo);
    }
    //삽입
    @PostMapping("/emp")
    public void insert(EmployeeVO vo){
        service.insert(vo);
    }
    //수정
    @PostMapping("/empUpdate")
    public void update(EmployeeVO vo){
        service.update(vo);
    }
    @GetMapping(path = "/test")
    public String Test() {
        return "test";
    }
    // alt + enter
}

