package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopFavorites;

/**
 * 买家收藏表
 * @author Lenovo
 *
 */
public interface ShopFavoritesMapper {
	/**
	 * 增加买家收藏
	 * @param shopFavorites
	 * @return
	 */
	int addShopFavorites(ShopFavorites shopFavorites);
	/**
	 * 更新买家收藏
	 * @param shopFavorites
	 * @return
	 */
	int updateShopFavorites(ShopFavorites shopFavorites);
	/**
	 * 删除买家收藏
	 * @param favId
	 * @return
	 */
	int deleteShopFavorites(Map<String,Object> map);
	/**
	 * 查询一条数据
	 * @param favId
	 * @return
	 */
	ShopFavorites findone(Integer favId);
	/**
	 * 查询所有收藏
	 * @return
	 */
	List<ShopFavorites> selectShopFavorites(Map<String, Object> map);
	/**
	 * 获得用户收藏总数
	 */
	Integer getTotalByMemberId(Integer memberId);
}
