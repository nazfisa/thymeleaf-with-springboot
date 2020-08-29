package com.springbootwiththymeleaf.springbootwiththymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String showDate(Model model){
        model.addAttribute("date", new java.util.Date());
        return "helloPeople";
    }
}
