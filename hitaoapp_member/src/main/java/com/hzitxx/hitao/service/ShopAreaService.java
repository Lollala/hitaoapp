package com.hzitxx.hitao.service;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopArea;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopAreaService {


	/**
	 * 分页查询
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopArea>> findShopArea(Integer page,Integer limit,Map<String,Object> map);
	
	/**
	 * 
	 * @param shoparea
	 * @return
	 */
	public ServerResponse<?> addShopArea(ShopArea shoparea);
	
	/**
	 * 
	 * @param shoparea
	 * @return
	 */
	public ServerResponse<?> updateShopArea(ShopArea shoparea);
	
	/**
	 * 
	 * @param areaId
	 * @return
	 */
	public ServerResponse<?> deleteShopArea(Integer areaId);
	
	/**
	 * 根据父ID查询所有子信息
	 * @param map
	 * @return
	 */
	public ServerResponse<List<ShopArea>> getShopArea(Map<String,Object> map);
	/**
	 * 获得用于三级联动的简易查询
	 * @param map
	 * @return
	 */
	public ServerResponse<List<ShopArea>> littleFindShopArea(Map<String,Object> map);
}
