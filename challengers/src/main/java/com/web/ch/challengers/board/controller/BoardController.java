package com.web.ch.challengers.board.controller;

import com.web.ch.challengers.board.boardMapper.BoardMapper;
import com.web.ch.challengers.board.domain.BoardVO;
import com.web.ch.challengers.board.service.BoardService;
import com.web.ch.challengers.board.service.BoardServiceImpl;
import com.web.ch.challengers.test.service.EmployeesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    BoardService board = new BoardServiceImpl();

    // 게시판 글 작성
    @PostMapping("/board/write")
    public String wrtie(@RequestBody BoardVO boardVO) throws Exception {
        board.write(boardVO);
        return null;
    }

    @GetMapping("/board")
    public void temp(){
        System.out.println("게시판에 왔습니다.");
    }

}
