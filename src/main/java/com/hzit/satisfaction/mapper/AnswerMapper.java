package com.hzit.satisfaction.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.satisfaction.entity.Answer;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface AnswerMapper {

	void insertAnswer(Answer answer);

	void deleteAnswerByAnsId(Integer ansId);

	void updateAnswer(Answer answer);

	Page<Answer> searchAnswerByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Answer> searchAnswerByParams(@Param("map") Map<String, String> map);

} 
