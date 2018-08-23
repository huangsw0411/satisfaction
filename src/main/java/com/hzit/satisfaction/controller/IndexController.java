package com.hzit.satisfaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String toindex(){
        return "index";
    }

    @RequestMapping("p_{url}")
    public String toPage(@PathVariable("url") String url){
        return url;
    }
}
