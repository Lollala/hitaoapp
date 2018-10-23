package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * <p>
 * 订单商品表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopOrderGoods implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单商品表索引id
     */
    private Integer recId;
    /**
     * 订单id
     */
    private Integer orderId;
    /**
     * 商品id
     */
    private Integer goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;
    /**
     * 商品数量
     */
    private Integer goodsNum;
    /**
     * 商品图片
     */
    private String goodsImage;
    /**
     * 商品实际成交价
     */
    private Long goodsPayPrice;
    /**
     * 买家ID
     */
    private Integer buyerId;
    /**
     * 1默认2团购商品3限时折扣商品4组合套装5赠品
     */
    private Integer goodsType;
    /**
     * 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
     */
    private Integer promotionsId;
    /**
     * 佣金比例
     */
    private Integer commisRate;
    private Integer isDel;
    private Date createdTime;
    private Date updatedTime;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }
 
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
 
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
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
 
    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
 
    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }
 
    public Long getGoodsPayPrice() {
        return goodsPayPrice;
    }

    public void setGoodsPayPrice(Long goodsPayPrice) {
        this.goodsPayPrice = goodsPayPrice;
    }
 
    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }
 
    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }
 
    public Integer getPromotionsId() {
        return promotionsId;
    }

    public void setPromotionsId(Integer promotionsId) {
        this.promotionsId = promotionsId;
    }
 
    public Integer getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(Integer commisRate) {
        this.commisRate = commisRate;
    }
 
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
 
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
 
    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
 


    @Override
    public String toString() {
        return "ShopOrderGoods{" +
        "recId=" + recId +
        ", orderId=" + orderId +
        ", goodsId=" + goodsId +
        ", goodsName=" + goodsName +
        ", goodsPrice=" + goodsPrice +
        ", goodsNum=" + goodsNum +
        ", goodsImage=" + goodsImage +
        ", goodsPayPrice=" + goodsPayPrice +
        ", buyerId=" + buyerId +
        ", goodsType=" + goodsType +
        ", promotionsId=" + promotionsId +
        ", commisRate=" + commisRate +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}