package com.hlm.springbootTest.controller;

import com.hlm.springbootTest.entity.User;
import com.hlm.springbootTest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public Object getUser(@PathVariable("id") Integer id){
       return  userService.findById(id);
    }

}
