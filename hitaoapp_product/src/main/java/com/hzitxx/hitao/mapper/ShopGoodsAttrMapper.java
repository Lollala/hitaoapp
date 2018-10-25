package com.hzitxx.hitao.mapper;

import java.util.List;

import com.hzitxx.hitao.entity.ShopGoodsAttr;

/**
 * 商品属性表
 * 
 * @author Lenovo
 *
 */
public interface ShopGoodsAttrMapper {
	/**
	 * 添加
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	int addShopGoodsAttr(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 删除
	 * 
	 * @param goodsId
	 * @return
	 */
	int deleteShopGoodsAttr(Integer goodsId);

	/**
	 * 修改
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	int updateShopGoodsAttr(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	List<ShopGoodsAttr> selectShopGoodsAttr();

	/**
	 * 查询一条数据
	 * 
	 * @param goodsId
	 * @return
	 */
	ShopGoodsAttr findone(Integer goodsId);
}
