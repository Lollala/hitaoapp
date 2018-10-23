package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * <p>
 * 运费模板扩展表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopTransportExtend implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 运费模板扩展ID
     */
    private Integer id;
    /**
     * 市级地区ID组成的串，以，隔开，两端也有，
     */
    private String areaId;
    /**
     * 省级地区ID组成的串，以，隔开，两端也有，
     */
    private String topAreaId;
    /**
     * 地区name组成的串，以，隔开
     */
    private String areaName;
    /**
     * 首件数量
     */
    private Integer snum;
    /**
     * 首件运费
     */
    private BigDecimal sprice;
    /**
     * 续件数量
     */
    private Integer xnum;
    /**
     * 续件运费
     */
    private BigDecimal xprice;
    /**
     * 是否默认运费1是2否
     */
    private Integer isDefault;
    /**
     * 运费模板ID
     */
    private Integer transportId;
    /**
     * 运费模板
     */
    private String transportTitle;
    /**
     * 是否删除0:未删除;1:已删除
     */
    private Integer isDel;
    /**
     * 录入时间
     */
    private Date createdTime;
    /**
     * 修改时间
     */
    private Date updatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
 
    public String getTopAreaId() {
        return topAreaId;
    }

    public void setTopAreaId(String topAreaId) {
        this.topAreaId = topAreaId;
    }
 
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
 
    public Integer getSnum() {
        return snum;
    }

    public void setSnum(Integer snum) {
        this.snum = snum;
    }
 
    public BigDecimal getSprice() {
        return sprice;
    }

    public void setSprice(BigDecimal sprice) {
        this.sprice = sprice;
    }
 
    public Integer getXnum() {
        return xnum;
    }

    public void setXnum(Integer xnum) {
        this.xnum = xnum;
    }
 
    public BigDecimal getXprice() {
        return xprice;
    }

    public void setXprice(BigDecimal xprice) {
        this.xprice = xprice;
    }
 
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
 
    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }
 
    public String getTransportTitle() {
        return transportTitle;
    }

    public void setTransportTitle(String transportTitle) {
        this.transportTitle = transportTitle;
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
        return "ShopTransportExtend{" +
        "id=" + id +
        ", areaId=" + areaId +
        ", topAreaId=" + topAreaId +
        ", areaName=" + areaName +
        ", snum=" + snum +
        ", sprice=" + sprice +
        ", xnum=" + xnum +
        ", xprice=" + xprice +
        ", isDefault=" + isDefault +
        ", transportId=" + transportId +
        ", transportTitle=" + transportTitle +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}