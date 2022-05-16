package com.web.ch.challengers.board.boardMapper;

import com.web.ch.challengers.board.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public void write(BoardVO boardVO);
}
