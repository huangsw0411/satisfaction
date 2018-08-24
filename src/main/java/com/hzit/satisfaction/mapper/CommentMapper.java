package com.hzit.satisfaction.mapper;

import java.util.List;
import java.util.Map;

import com.hzit.satisfaction.vo.SimpleCommentVo;
import org.apache.ibatis.annotations.Param;
import com.hzit.satisfaction.entity.Comment;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface CommentMapper {

	void insertComment(Comment comment);

	void deleteCommentByComId(Integer comId);

	void updateComment(Comment comment);

	Page<Comment> searchCommentByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Comment> searchCommentByParams(@Param("map") Map<String, String> map);


	List<Map> searchAllAvg();

	List<Map> searchAvgByYear();

	List<Map> searchAvgByMonth(String time);

	Page<SimpleCommentVo> searchTeacherList(@Param("map") Map map,Pageable pageable);



} 
