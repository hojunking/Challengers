package com.web.ch.challengers.board.dao;

import com.web.ch.challengers.board.vo.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardDAOImpl implements BoardDAO{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void write(BoardVO boardVO) throws Exception {
        sqlSession.insert("boardMapper.insert",boardVO);
    }
}
