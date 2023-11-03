package com.sbs.academy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {
    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");
        return "registerForm";
    }

    @PostMapping("/register")
    public String register() {
        log.info("register");
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String result() {
        log.info("result");
        return "result";
    }

}
