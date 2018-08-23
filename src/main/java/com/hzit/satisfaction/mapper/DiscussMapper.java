package com.hzit.satisfaction.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.satisfaction.entity.Discuss;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface DiscussMapper {

	void insertDiscuss(Discuss discuss);

	void deleteDiscussByDisId(Integer disId);

	void updateDiscuss(Discuss discuss);

	Page<Discuss> searchDiscussByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Discuss> searchDiscussByParams(@Param("map") Map<String, String> map);

} 
