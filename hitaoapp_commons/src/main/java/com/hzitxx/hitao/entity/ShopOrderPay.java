package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 订单支付表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopOrderPay implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer payId;
    /**
     * 支付单号
     */
    private Long paySn;
    /**
     * 买家ID
     */
    private Integer buyerId;
    /**
     * 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
     */
    private Integer apiPayState;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }
 
    public Long getPaySn() {
        return paySn;
    }

    public void setPaySn(Long paySn) {
        this.paySn = paySn;
    }
 
    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }
 
    public Integer getApiPayState() {
        return apiPayState;
    }

    public void setApiPayState(Integer apiPayState) {
        this.apiPayState = apiPayState;
    }
 


    @Override
    public String toString() {
        return "ShopOrderPay{" +
        "payId=" + payId +
        ", paySn=" + paySn +
        ", buyerId=" + buyerId +
        ", apiPayState=" + apiPayState +
        "}";
    }
}