package com.web.ch.challengers.user.service;

import com.web.ch.challengers.user.domain.UserVO;
import com.web.ch.challengers.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper map;

    public List<UserVO> readAll() {
        return map.readAll();
    }

    public UserVO read() {
        return map.read();
    }
    public int insertUser(UserVO vo) {
        return 1;
    }

    public int modifyUser(UserVO vo) {
        return 1;
    }
}
