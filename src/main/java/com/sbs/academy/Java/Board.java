package com.sbs.academy.Java;



import lombok.*;
import net.bytebuddy.asm.Advice;

import java.time.LocalDateTime;



public class Board {
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;



//    public Board(String title, String content, String writer, LocalDateTime regDate) {
//        super();
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
//        this.regDate = regDate;
//    }

}
