package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 商品图片
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopGoodsImages implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品图片id
     */
    private Integer goodsImageId;
    /**
     * 商品编号
     */
    private Integer goodsId;
    /**
     * 颜色规格值id
     */
    private Integer colorId;
    /**
     * 商品图片
     */
    private String goodsImage;
    /**
     * 排序
     */
    private Integer goodsImageSort;
    /**
     * 默认主题，1是，0否
     */
    private Integer isDefault;

    public Integer getGoodsImageId() {
        return goodsImageId;
    }

    public void setGoodsImageId(Integer goodsImageId) {
        this.goodsImageId = goodsImageId;
    }
 
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
 
    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }
 
    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }
 
    public Integer getGoodsImageSort() {
        return goodsImageSort;
    }

    public void setGoodsImageSort(Integer goodsImageSort) {
        this.goodsImageSort = goodsImageSort;
    }
 
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
 


    @Override
    public String toString() {
        return "ShopGoodsImages{" +
        "goodsImageId=" + goodsImageId +
        ", goodsId=" + goodsId +
        ", colorId=" + colorId +
        ", goodsImage=" + goodsImage +
        ", goodsImageSort=" + goodsImageSort +
        ", isDefault=" + isDefault +
        "}";
    }
}