package com.hzit.satisfaction.service.impl;

import com.hzit.satisfaction.mapper.CommentMapper;
import com.hzit.satisfaction.service.CommentService;
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
    public List<Double> searchAllAvg(String typename) {
        return commentMapper.searchAllAvg(typename);
    }
}
