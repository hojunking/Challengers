package com.web.ch.challengers.board.service;

import com.web.ch.challengers.board.boardMapper.BoardMapper;
import com.web.ch.challengers.board.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardMapper map;

    @Override
    public void write(BoardVO boardVO)  {
        map.write(boardVO);
    }
}
