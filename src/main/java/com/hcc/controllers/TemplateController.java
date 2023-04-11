package com.hcc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {

    @GetMapping("/login")
    public String getLoginView() {
        return "login";
    }

    @GetMapping("assignments")
    public String getCourses() {
        return "assignments";
    }
}
