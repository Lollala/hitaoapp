package com.hzitxx.hitao.service;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品属性表
 * @author Lenovo
 *
 */
public interface ShopGoodsAttrService {
	/**
	 * 添加
	 * 
	 * @return
	 */
	ServerResponse<Integer> add(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 删除
	 * 
	 * @return
	 */
	ServerResponse<Integer> delete(Integer goodsId);

	/**
	 * 修改
	 * 
	 * @return
	 */
	ServerResponse<Integer> update(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 查询所有数据
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	ServerResponse<PageUtil<List<ShopGoodsAttr>>> select(int page, int limit, Map<String, Object> map);

	/**
	 * 查询一条数据
	 * 
	 * @param goodsId
	 * @return
	 */
	ServerResponse<ShopGoodsAttr> findone(Integer goodsId);
}
