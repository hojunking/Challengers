package com.web.ch.challengers.board.service;

import com.web.ch.challengers.board.domain.BoardVO;

public interface BoardService {
    public void write(BoardVO boardVO) throws Exception;
}
