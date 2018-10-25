package com.hzitxx.hitao.entity;

import java.math.BigDecimal;
/**
 * 商品表部分数据信息
 * @author Lenovo
 *
 */
public class MiniGoods {
	/**
	 * 商品id
	 */
	private int goodsId;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品价格
	 */
	private BigDecimal goodsPrice;
	/**
	 * 商品图片
	 */
	private String mainImage;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getMainImage() {
		return mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	@Override
	public String toString() {
		return "MiniGoods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", mainImage=" + mainImage + "]";
	}
	

}
