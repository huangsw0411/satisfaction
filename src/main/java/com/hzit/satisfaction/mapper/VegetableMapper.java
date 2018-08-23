package com.hzit.satisfaction.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.satisfaction.entity.Vegetable;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface VegetableMapper {

	void insertVegetable(Vegetable vegetable);

	void deleteVegetableByVeId(Integer veId);

	void updateVegetable(Vegetable vegetable);

	Page<Vegetable> searchVegetableByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Vegetable> searchVegetableByParams(@Param("map") Map<String, String> map);

} 
