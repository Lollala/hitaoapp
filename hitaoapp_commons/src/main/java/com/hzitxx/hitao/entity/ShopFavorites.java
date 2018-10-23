package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 买家收藏表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopFavorites implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 收藏编号
     */
    private Integer favId;
    /**
     * 商品编号
     */
    private Integer goodsId;
    /**
     * 会员ID
     */
    private Integer memberId;
    /**
     * 收藏类型(1:商品 2:文章,默认为商品)
     */
    private String favType;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品广告词
     */
    private String goodsJingle;
    /**
     * 商品主图
     */
    private String mainImage;
    /**
     * 收藏时间
     */
    private Date favTime;

    public Integer getFavId() {
        return favId;
    }

    public void setFavId(Integer favId) {
        this.favId = favId;
    }
 
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
 
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
 
    public String getFavType() {
        return favType;
    }

    public void setFavType(String favType) {
        this.favType = favType;
    }
 
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
 
    public String getGoodsJingle() {
        return goodsJingle;
    }

    public void setGoodsJingle(String goodsJingle) {
        this.goodsJingle = goodsJingle;
    }
 
    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }
 
    public Date getFavTime() {
        return favTime;
    }

    public void setFavTime(Date favTime) {
        this.favTime = favTime;
    }
 


    @Override
    public String toString() {
        return "ShopFavorites{" +
        "favId=" + favId +
        ", goodsId=" + goodsId +
        ", memberId=" + memberId +
        ", favType=" + favType +
        ", goodsName=" + goodsName +
        ", goodsJingle=" + goodsJingle +
        ", mainImage=" + mainImage +
        ", favTime=" + favTime +
        "}";
    }
}