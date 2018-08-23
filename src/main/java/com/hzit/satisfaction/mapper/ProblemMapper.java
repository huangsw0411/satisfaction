package com.hzit.satisfaction.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.satisfaction.entity.Problem;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface ProblemMapper {

	void insertProblem(Problem problem);

	void deleteProblemByProId(Integer proId);

	void updateProblem(Problem problem);

	Page<Problem> searchProblemByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Problem> searchProblemByParams(@Param("map") Map<String, String> map);

} 
