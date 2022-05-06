package com.web.ch.challengers.test.service;

import com.web.ch.challengers.test.domain.EmployeeVO;
import com.web.ch.challengers.test.mapper.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService{
    @Autowired
    EmployeesMapper map;

    @Override
    public List<EmployeeVO> getList() {
        return map.getList();
    }

    @Override
    public EmployeeVO read(EmployeeVO vo) {
        return map.read(vo);
    }

    @Override
    public int delete(EmployeeVO vo) {
        return map.delete(vo);
    }

    @Override
    public int update(EmployeeVO vo) {
        return map.update(vo);
    }

    @Override
    public int insert(EmployeeVO vo) {
        return map.insert(vo);
    }
}
