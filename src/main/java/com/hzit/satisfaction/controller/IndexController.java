package com.hzit.satisfaction.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.satisfaction.entity.Comment;
import com.hzit.satisfaction.service.CommentService;
import com.hzit.satisfaction.vo.SimpleCommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {


    @Autowired
    CommentService commentService;

    @RequestMapping("p_{url}")
    public String toPage(@PathVariable("url") String url){
        return url;
    }


    @RequestMapping({"/","index"})
    public String toIndex(ModelMap map, SimpleCommentVo comment, @RequestParam(name="currpage",defaultValue = "0") int currpage, @RequestParam(name="pagesize",defaultValue = "10") int pagesize){
        List<Map> avg=commentService.searchAvgByYear();
        map.put("date",new Date());
        map.put("teacherscore",avg.get(0).get("avgscore"));
        map.put("masterscore",avg.get(1).get("avgscore"));
        int sum=Integer.parseInt(avg.get(0).get("c").toString())+Integer.parseInt(avg.get(1).get("c").toString());
        map.put("total",sum);
        Page<SimpleCommentVo> data= commentService.searchSimpleCommentByPage(comment,currpage,pagesize);
        map.put("commentdata",data);

        return "index";
    }


}
