package com.hlm.springbootTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/hello")
    @ResponseBody
    public String login(){
        return "hello";
    }

}
