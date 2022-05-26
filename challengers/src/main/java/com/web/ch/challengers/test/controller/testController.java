package com.web.ch.challengers.test.controller;

import com.web.ch.challengers.test.domain.EmployeeVO;
import com.web.ch.challengers.test.domain.TestVO;
import com.web.ch.challengers.test.service.EmployeesService;
import com.web.ch.challengers.test.service.TestService;
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
    @Autowired
    TestService testService;

    //MariaDB Test
    @GetMapping(path = "/mariaTest")
    public List<TestVO> readTest() {
        System.out.println("스팟1");
        return testService.readMaria();
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        //@RestController를 사용하면 내부적을 Jackson 라이브러리에 의해 VO객체를 JSON형태로 반환한다.
        //@RestController = Controller + ResponseBody => 주용도 : Json 형태로 객체 데이터 반환
    }

    @GetMapping("/emp2")
    public String getTwo(EmployeeVO vo){
        return vo.toString();
    }


    //삽입
    @PostMapping("/emp")
    public void insert(EmployeeVO vo){
        service.insert(vo);
    }


    @PostMapping("/emp/newinsert")
    public void myinsert(EmployeeVO vo){service.insert(vo);}

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

