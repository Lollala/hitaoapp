package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopFrontCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 类目编号
     */
    private Integer frontCatId;
    /**
     * 后台类目编号
     */
    private Integer catId;
    /**
     * 类目名称
     */
    private String catName;
    /**
     * 类目级别,最高三级类目
     */
    private Integer level;
    /**
     * 父级类目
     */
    private Integer parentId;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 分类图标
     */
    private String iconImage;
    /**
     * 地址
     */
    private String url;
    /**
     * 广告图
     */
    private String advImage;
    /**
     * 广告链接
     */
    private String advLink;

    public Integer getFrontCatId() {
        return frontCatId;
    }

    public void setFrontCatId(Integer frontCatId) {
        this.frontCatId = frontCatId;
    }
 
    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }
 
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
 
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
 
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
 
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
 
    public String getIconImage() {
        return iconImage;
    }

    public void setIconImage(String iconImage) {
        this.iconImage = iconImage;
    }
 
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
 
    public String getAdvImage() {
        return advImage;
    }

    public void setAdvImage(String advImage) {
        this.advImage = advImage;
    }
 
    public String getAdvLink() {
        return advLink;
    }

    public void setAdvLink(String advLink) {
        this.advLink = advLink;
    }
 


    @Override
    public String toString() {
        return "ShopFrontCategory{" +
        "frontCatId=" + frontCatId +
        ", catId=" + catId +
        ", catName=" + catName +
        ", level=" + level +
        ", parentId=" + parentId +
        ", sort=" + sort +
        ", iconImage=" + iconImage +
        ", url=" + url +
        ", advImage=" + advImage +
        ", advLink=" + advLink +
        "}";
    }
}