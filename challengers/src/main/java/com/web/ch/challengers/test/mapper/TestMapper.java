package com.web.ch.challengers.test.mapper;

import com.web.ch.challengers.test.domain.TestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    public List<TestVO> readMaria();
}
