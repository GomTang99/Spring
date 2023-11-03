package com.sbs.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/headerfooter")
    public String headerfooterPage() {
        return "layOuts/headerfooter";
    }




}
