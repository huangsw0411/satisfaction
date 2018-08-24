package com.hzit.satisfaction.service;

import com.fc.platform.commons.page.Page;
import com.hzit.satisfaction.entity.Comment;
import com.hzit.satisfaction.entity.User;
import com.hzit.satisfaction.vo.SimpleCommentVo;

import java.util.List;
import java.util.Map;

public interface CommentService {

     List<Map> searchAllAvg();

     List<Map> searchAvgByMonth(String time);

     List<Map> searchAvgByYear();


     Page<SimpleCommentVo> searchSimpleCommentByPage(SimpleCommentVo comment, int page, int pagesize);

}
