package com.hzit.satisfaction.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.satisfaction.entity.Vediscuss;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface VediscussMapper {

	void insertVediscuss(Vediscuss vediscuss);

	void deleteVediscussByVdId(Integer vdId);

	void updateVediscuss(Vediscuss vediscuss);

	Page<Vediscuss> searchVediscussByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Vediscuss> searchVediscussByParams(@Param("map") Map<String, String> map);

} 
