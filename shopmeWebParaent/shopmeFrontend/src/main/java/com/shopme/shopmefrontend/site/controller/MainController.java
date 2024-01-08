package com.shopme.shopmefrontend.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/site")
public class MainController {

    @GetMapping
    public String viewHomePage(){
        return "index";
    }
}
