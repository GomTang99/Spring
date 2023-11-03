package com.sbs.academy.controller;

import com.sbs.academy.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    /*
    @GetMapping("/home")
    public String model(Model model){
        model.addAttribute("hello", "hello, World!");
        return "hello";
    }
     */

    @GetMapping("/")
    public String home(Model model) {
//        Person person = new Person("아이유", 26);
        model.addAttribute("person", new Person("아이유", 26));

        return "home";
    }
}
