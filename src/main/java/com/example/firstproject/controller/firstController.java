package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {

    @GetMapping("/hi")
    public String nicetoMeetyou(Model model) {
        model.addAttribute("userName", "홍동우님");
        return "greetings";
    }
}
