package com.web.ch.challengers.board.controller;

import com.web.ch.challengers.board.boardMapper.BoardMapper;
import com.web.ch.challengers.board.domain.BoardVO;
import com.web.ch.challengers.board.service.BoardService;
import com.web.ch.challengers.board.service.BoardServiceImpl;
import com.web.ch.challengers.test.service.EmployeesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/board")
public class BoardController {

    @Autowired
    BoardService board;

    // 게시판 글 작성
    @PostMapping(path = "/write")
    public String write(BoardVO boardVO) throws Exception {
        board.write(boardVO);
        return null;
    }

    @GetMapping(value = "/test")
    public void temp(){
        System.out.println("게시판에 왔습니다.");
    }

}
