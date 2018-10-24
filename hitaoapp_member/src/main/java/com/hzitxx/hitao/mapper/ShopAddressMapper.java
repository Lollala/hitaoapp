package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopAddress;

/**
 * 买家地址信息表
 * @author WE1
 *
 */
public interface ShopAddressMapper {
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	public List<ShopAddress> findShopAddress(Map<String,Object> map);
	/**
	 * 添加买家地址
	 * @param shopAddress
	 * @return
	 */
	public int addShopAddress(ShopAddress shopAddress);
	/**
	 * 修改地址信息
	 * @param shopAddress
	 * @return
	 */
	public int updateShopAddress(ShopAddress shopAddress);
	/**
	 * 物理删除地址信息
	 * @param id
	 * @return
	 */
	public int deleteShopAddress(Integer id);
}
