package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.client.discovery.event.InstanceRegisteredEvent;

import com.hzitxx.hitao.entity.ShopArea;

public interface ShopAreaMapper {
	/**
	 * 查询区域信息
	 * @param map
	 * @return
	 */
	public List<ShopArea> findShopArea(Map<String,Object> map);
	
	/**
	 * 添加区域信息
	 * @param sa
	 * @return
	 */
	public int addShopArea(ShopArea shopArea);
		
	/**
	 * 编辑区域信息
	 * @param sa
	 * @return
	 */
	public int updateShopArea(ShopArea sa);
	
	public int deletShopArea(Integer areaId);
	/**
	 * 获得简单显示的信息，用于三级联动
	 * @param map
	 * @return
	 */
	public List<ShopArea> littleFindShopArea(Map<String,Object> map);
}
