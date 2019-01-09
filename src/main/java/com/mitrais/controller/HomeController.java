package com.mitrais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

    @ResponseBody
    @GetMapping("/hallo-cak")
    public String helloUstadho(){
        return "Assalamualaikum Ustadho";
    }
}
