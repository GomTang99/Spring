package com.sbs.academy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UserUrlController {
    @GetMapping("/register")
    public String parameterUserQuery(String userId, String password) {
        log.info("파라미터사용자 쿼리");
        log.info("사용자 ID = " + userId);
        log.info("사용자 password = " + password);
        return "success";
    }


}
