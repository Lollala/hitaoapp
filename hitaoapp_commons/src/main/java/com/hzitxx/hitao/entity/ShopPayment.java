package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 支付方式表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopPayment implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 支付索引id
     */
    private Integer paymentId;
    /**
     * 支付代码名称
     */
    private String paymentCode;
    /**
     * 支付名称
     */
    private String paymentName;
    /**
     * 支付接口配置信息
     */
    private String paymentConfig;
    /**
     * 接口状态0禁用1启用
     */
    private Integer paymentState;
    /**
     * 是否删除0:未删除;1:已删除
     */
    private Integer isDel;
    /**
     * 更新时间(自更新)
     */
    private Date createdTime;
    /**
     * 更新时间(自更新)
     */
    private Date updatedTime;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }
 
    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }
 
    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }
 
    public String getPaymentConfig() {
        return paymentConfig;
    }

    public void setPaymentConfig(String paymentConfig) {
        this.paymentConfig = paymentConfig;
    }
 
    public Integer getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
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
        return "ShopPayment{" +
        "paymentId=" + paymentId +
        ", paymentCode=" + paymentCode +
        ", paymentName=" + paymentName +
        ", paymentConfig=" + paymentConfig +
        ", paymentState=" + paymentState +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}