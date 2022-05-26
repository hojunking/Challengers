package com.web.ch.challengers.test.service;

import com.web.ch.challengers.test.domain.TestVO;
import com.web.ch.challengers.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestService  {
    @Autowired
    TestMapper map;

    public List<TestVO> readMaria() {
        System.out.println("스팟2");
        return map.readMaria();
    }
}
