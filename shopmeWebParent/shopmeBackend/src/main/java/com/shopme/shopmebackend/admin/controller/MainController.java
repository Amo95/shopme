package com.shopme.shopmebackend.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/admin")
public class MainController {

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
}
