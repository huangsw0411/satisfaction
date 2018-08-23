package com.hzit.satisfaction.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.satisfaction.entity.Check;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface CheckMapper {

	void insertCheck(Check check);

	void deleteCheckByCheckId(Integer checkId);

	void updateCheck(Check check);

	Page<Check> searchCheckByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Check> searchCheckByParams(@Param("map") Map<String, String> map);

} 
