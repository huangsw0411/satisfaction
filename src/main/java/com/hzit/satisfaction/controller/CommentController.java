package com.hzit.satisfaction.controller;

import com.hzit.satisfaction.entity.User;
import com.hzit.satisfaction.service.CommentService;
import com.hzit.satisfaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;


    @RequestMapping("searchallavg")
    @ResponseBody
    public Object dologin(String typename)
    {
        return commentService.searchAllAvg(typename);
    }
}
