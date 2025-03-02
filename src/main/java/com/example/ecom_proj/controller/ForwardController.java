package com.example.ecom_proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {
    @RequestMapping("/{path:[^\\.]*}")
    public String forward() {
        return "forward:/index.html";
    }
}

