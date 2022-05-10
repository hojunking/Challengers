package com.web.ch.challengers.user.userMapper;


import com.web.ch.challengers.user.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserVO> readAll();
    public UserVO read();
    public int insertUser(UserVO vo);
    public int modifyUser(UserVO vo);
}
