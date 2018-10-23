package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 商品分类表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopGoodsCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    private Integer catId;
    /**
     * 分类名称
     */
    private String catName;
    /**
     * 父ID
     */
    private Integer parentId;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 分类图片
     */
    private String iconImage;
    /**
     * 分类级别
     */
    private Integer level;
    /**
     * 关键词
     */
    private String keywords;
    /**
     * 描述
     */
    private String description;
    /**
     * 是否删除0:未删除;1:已删除,默认为0
     */
    private Integer isDel;
    private Date createdTime;
    /**
     * 更新时间(自更新)
     */
    private Date updatedTime;

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
 
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
 
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
 
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "ShopGoodsCategory{" +
        "catId=" + catId +
        ", catName=" + catName +
        ", parentId=" + parentId +
        ", sort=" + sort +
        ", iconImage=" + iconImage +
        ", level=" + level +
        ", keywords=" + keywords +
        ", description=" + description +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}