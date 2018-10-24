package com.hzitxx.hitao.service;
/**
 * 买家地址信息表
 * @author WE1
 *
 */

import java.util.Map;

import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopAddressService {
	/**
	 * 查找买家地址信息
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopAddress>> findShopAddress(Integer page,Integer limit,Map<String,Object> map);
	/**
	 * 添加买家地址信息
	 * @param shopAddress
	 * @return
	 */
	public ServerResponse<?> addShopAddress(ShopAddress shopAddress);
	/**
	 * 修改买家地址信息
	 * @param shopAddress
	 * @return
	 */
	public ServerResponse<?> updateShopAddress(ShopAddress shopAddress);
	/**
	 * 物理删除买家地址信息
	 * @param id
	 * @return
	 */
	public ServerResponse<?> deleteShopAddress(Integer id);
}
