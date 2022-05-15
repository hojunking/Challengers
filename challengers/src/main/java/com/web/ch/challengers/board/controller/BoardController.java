package com.web.ch.challengers.board.controller;

import com.web.ch.challengers.board.service.BoardService;
import com.web.ch.challengers.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class BoardController {
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    BoardService service;

    //게시판 글 작성 화면
    @GetMapping("/board/writeView")
    public void writeView() throws Exception{
        logger.info("writeView");
    }

    //게시판 글 작성
    @PostMapping("/board/write")
    public String write(BoardVO boardVO) throws Exception{
        logger.info("write");
        service.write(boardVO);
        return "redirect:/";
    }
}
