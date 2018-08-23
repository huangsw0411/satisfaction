package com.hzit.satisfaction.controller;

import com.hzit.satisfaction.entity.User;
import com.hzit.satisfaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("dologin")
    @ResponseBody
    public Object dologin(User user)
    {
        return userService.login(user);
    }
}
