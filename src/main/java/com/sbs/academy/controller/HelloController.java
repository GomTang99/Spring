package com.sbs.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "home";
    }
    @GetMapping("/time")
    public String date() {
        // 시간 가져오기
        LocalDateTime servertime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedDateTime = servertime.format(formatter);

        return "The time on the server is " + formattedDateTime;
    }

}
