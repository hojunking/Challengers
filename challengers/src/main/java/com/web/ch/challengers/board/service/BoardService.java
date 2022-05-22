package com.web.ch.challengers.board.service;

import com.web.ch.challengers.board.domain.BoardVO;
import org.springframework.stereotype.Service;

public interface BoardService {
    public void write(BoardVO boardVO) throws Exception;
}
