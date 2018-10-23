package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 地区表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopArea implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 索引ID
     */
    private Integer areaId;
    /**
     * 地区名称
     */
    private String areaName;
    /**
     * 地区父ID
     */
    private Integer areaParentId;
    /**
     * 排序
     */
    private Integer areaSort;
    /**
     * 邮编
     */
    private Integer postCode;
    /**
     * 地区深度，从1开始
     */
    private Integer areaDeep;
    /**
     * 是否删除0:未删除;1:已删除
     */
    private Integer isDel;
    /**
     * 录入时间
     */
    private Date createdTime;
    /**
     * 更新时间(自更新)
     */
    private Date updatedTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
 
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
 
    public Integer getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(Integer areaParentId) {
        this.areaParentId = areaParentId;
    }
 
    public Integer getAreaSort() {
        return areaSort;
    }

    public void setAreaSort(Integer areaSort) {
        this.areaSort = areaSort;
    }
 
    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
 
    public Integer getAreaDeep() {
        return areaDeep;
    }

    public void setAreaDeep(Integer areaDeep) {
        this.areaDeep = areaDeep;
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
        return "ShopArea{" +
        "areaId=" + areaId +
        ", areaName=" + areaName +
        ", areaParentId=" + areaParentId +
        ", areaSort=" + areaSort +
        ", postCode=" + postCode +
        ", areaDeep=" + areaDeep +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}