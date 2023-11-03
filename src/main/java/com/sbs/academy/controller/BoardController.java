package com.sbs.academy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public void registerForm() {
        log.info("registerForm");
    }
//
//    @RequestMapping("/modify")
//    public void modifyForm() {
//        log.info("수정폼");
//    }
//
//    @RequestMapping("/list")
//    public void list() {
//        log.info("리스트 출력");
//    }
//
//
//    @RequestMapping("/read/{boardNo}")
//    public String read(@PathVariable int boardNo) {
//        log.info("읽은 게시판 번호 : " + boardNo);
//        return "board/read";
//    }




}
