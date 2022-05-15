package com.web.ch.challengers.board.dao;

import com.web.ch.challengers.board.vo.BoardVO;

public interface BoardDAO {

    public void write(BoardVO boardVO) throws Exception;
}
