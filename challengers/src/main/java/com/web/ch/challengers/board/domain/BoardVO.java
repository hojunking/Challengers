package com.web.ch.challengers.board.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
}
