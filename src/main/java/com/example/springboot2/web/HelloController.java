package com.example.springboot2.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.io.File;


@Controller
public class HelloController {
    @RequestMapping("hello")
    public String hello(Model m){
        System.out.println("p2ewew");
       m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
