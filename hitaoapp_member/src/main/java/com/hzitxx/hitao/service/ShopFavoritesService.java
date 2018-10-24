package com.hzitxx.hitao.service;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 买家收藏表
 * 
 * @author Lenovo
 *
 */
public interface ShopFavoritesService {
	/**
	 * 添加
	 * 
	 * @param shopFavorites
	 * @return
	 */
	ServerResponse<Integer> addShopFavorites(ShopFavorites shopFavorites);

	/**
	 * 删除
	 * 
	 * @param favId
	 * @return
	 */
	ServerResponse<Integer> deleteFavorites(Integer favId);

	/**
	 * 修改
	 * 
	 * @param shopFavorites
	 * @return
	 */
	ServerResponse<Integer> updateFavorites(ShopFavorites shopFavorites);

	/**
	 * 查询一条数据
	 * 
	 * @param favId
	 * @return
	 */
	ServerResponse<ShopFavorites> findone(Integer favId);

	/**
	 * 获得用户收藏总数
	 */
	Integer getTotalByMemberId(Integer memberId);

	/**
	 * 查询所有数据
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	ServerResponse<PageUtil<List<ShopFavorites>>> selectShopFavorites(int page, int limit, Map<String, Object> map);
}
