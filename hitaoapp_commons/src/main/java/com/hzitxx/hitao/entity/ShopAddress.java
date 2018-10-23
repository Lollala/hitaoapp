package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 买家地址信息表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 地址ID
     */
    private Integer id;
    /**
     * 会员ID
     */
    private Integer memberId;
    /**
     * 会员姓名
     */
    private String memberName;
    /**
     * 省份id
     */
    private Integer provinceId;
    /**
     * 市级ID
     */
    private Integer cityId;
    /**
     * 地区ID
     */
    private Integer districtId;
    /**
     * 地区内容
     */
    private String fullRegion;
    /**
     * 地址
     */
    private String address;
    /**
     * 手机电话
     */
    private String telNumber;
    /**
     * 邮编
     */
    private Integer postCode;
    /**
     * 1默认收货地址
     */
    private Integer isDefault;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
 
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
 
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
 
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
 
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
 
    public String getFullRegion() {
        return fullRegion;
    }

    public void setFullRegion(String fullRegion) {
        this.fullRegion = fullRegion;
    }
 
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
 
    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
 
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
 


    @Override
    public String toString() {
        return "ShopAddress{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", memberName=" + memberName +
        ", provinceId=" + provinceId +
        ", cityId=" + cityId +
        ", districtId=" + districtId +
        ", fullRegion=" + fullRegion +
        ", address=" + address +
        ", telNumber=" + telNumber +
        ", postCode=" + postCode +
        ", isDefault=" + isDefault +
        "}";
    }
}