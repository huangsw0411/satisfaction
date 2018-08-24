package com.hzit.satisfaction.service.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.satisfaction.entity.Comment;
import com.hzit.satisfaction.mapper.CommentMapper;
import com.hzit.satisfaction.service.CommentService;
import com.hzit.satisfaction.tools.Tools;
import com.hzit.satisfaction.vo.SimpleCommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/24 0024.
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Map> searchAllAvg() {
        return commentMapper.searchAllAvg();
    }

    @Override
    public List<Map> searchAvgByMonth(String time) {
        return commentMapper.searchAvgByMonth(time);
    }

    @Override
    public List<Map> searchAvgByYear() {
        return commentMapper.searchAvgByYear();
    }

    @Override
    public Page<SimpleCommentVo> searchSimpleCommentByPage(SimpleCommentVo comment, int page, int pagesize) {
        PageRequest p=new PageRequest(page,pagesize);
        Map map= Tools.convertBeanToMap(comment);
        return commentMapper.searchTeacherList(map,p);
    }
}
