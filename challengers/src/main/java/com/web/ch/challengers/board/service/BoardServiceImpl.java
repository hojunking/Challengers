package com.web.ch.challengers.board.service;

import com.web.ch.challengers.board.dao.BoardDAO;
import com.web.ch.challengers.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardDAO dao;

    @Override
    public void write(BoardVO boardVO) throws Exception {
        dao.write(boardVO);
    }
}
