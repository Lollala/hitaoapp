package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopBrand implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 索引ID
     */
    private Integer brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 类别名称
     */
    private String brandClass;
    /**
     * 所属分类id
     */
    private Integer classId;
    /**
     * 图片
     */
    private String brandPic;
    /**
     * 排序
     */
    private Integer brandSort;
    /**
     * 推荐，0为否，1为是，默认为0
     */
    private Integer brandRecommend;
    /**
     * 品牌申请，0为申请中，1为通过，默认为1，申请功能是会员使用，系统后台默认为1
     */
    private Integer brandApply;
    /**
     * 是否删除0:未删除;1:已删除，默认为0
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
 
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
 
    public String getBrandClass() {
        return brandClass;
    }

    public void setBrandClass(String brandClass) {
        this.brandClass = brandClass;
    }
 
    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
 
    public String getBrandPic() {
        return brandPic;
    }

    public void setBrandPic(String brandPic) {
        this.brandPic = brandPic;
    }
 
    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }
 
    public Integer getBrandRecommend() {
        return brandRecommend;
    }

    public void setBrandRecommend(Integer brandRecommend) {
        this.brandRecommend = brandRecommend;
    }
 
    public Integer getBrandApply() {
        return brandApply;
    }

    public void setBrandApply(Integer brandApply) {
        this.brandApply = brandApply;
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
        return "ShopBrand{" +
        "brandId=" + brandId +
        ", brandName=" + brandName +
        ", brandClass=" + brandClass +
        ", classId=" + classId +
        ", brandPic=" + brandPic +
        ", brandSort=" + brandSort +
        ", brandRecommend=" + brandRecommend +
        ", brandApply=" + brandApply +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}