package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 订单表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单索引id
     */
    private Integer orderId;
    /**
     * 订单编号
     */
    private Long orderSn;
    /**
     * 支付单号
     */
    private Long paySn;
    /**
     * 买家id
     */
    private Integer buyerId;
    /**
     * 买家姓名
     */
    private String buyerName;
    /**
     * 买家电子邮箱
     */
    private String buyerEmail;
    /**
     * 订单生成时间
     */
    private Date addTime;
    /**
     * 支付方式名称代码
     */
    private String paymentCode;
    /**
     * 支付(付款)时间
     */
    private Date paymentTime;
    /**
     * 订单完成时间
     */
    private Date finnshedTime;
    /**
     * 商品总价格
     */
    private Long goodsAmount;
    /**
     * 订单总价格
     */
    private Long orderAmount;
    /**
     * 预存款支付金额
     */
    private Long pdAmount;
    /**
     * 运费
     */
    private Long shippingFee;
    /**
     * 评价状态 0未评价，1已评价
     */
    private Integer evaluationState;
    /**
     * 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
     */
    private Integer orderState;
    /**
     * 退款状态:0是无退款,1是部分退款,2是全部退款
     */
    private Integer refundState;
    /**
     * 锁定状态:0是正常,大于0是锁定,默认是0
     */
    private Integer lockState;
    /**
     * 退款金额
     */
    private Long refundAmount;
    /**
     * 延迟时间,默认为0
     */
    private Date delayTime;
    /**
     * 物流单号
     */
    private String shippingCode;
    /**
     * 是否删除
     */
    private Integer isDel;
    /**
     * 下单时间
     */
    private Date createdTime;
    /**
     * 修改时间
     */
    private Date updatedTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
 
    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
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
 
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
 
    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }
 
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
 
    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }
 
    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
 
    public Date getFinnshedTime() {
        return finnshedTime;
    }

    public void setFinnshedTime(Date finnshedTime) {
        this.finnshedTime = finnshedTime;
    }
 
    public Long getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
    }
 
    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }
 
    public Long getPdAmount() {
        return pdAmount;
    }

    public void setPdAmount(Long pdAmount) {
        this.pdAmount = pdAmount;
    }
 
    public Long getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Long shippingFee) {
        this.shippingFee = shippingFee;
    }
 
    public Integer getEvaluationState() {
        return evaluationState;
    }

    public void setEvaluationState(Integer evaluationState) {
        this.evaluationState = evaluationState;
    }
 
    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
 
    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }
 
    public Integer getLockState() {
        return lockState;
    }

    public void setLockState(Integer lockState) {
        this.lockState = lockState;
    }
 
    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }
 
    public Date getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }
 
    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
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
        return "ShopOrder{" +
        "orderId=" + orderId +
        ", orderSn=" + orderSn +
        ", paySn=" + paySn +
        ", buyerId=" + buyerId +
        ", buyerName=" + buyerName +
        ", buyerEmail=" + buyerEmail +
        ", addTime=" + addTime +
        ", paymentCode=" + paymentCode +
        ", paymentTime=" + paymentTime +
        ", finnshedTime=" + finnshedTime +
        ", goodsAmount=" + goodsAmount +
        ", orderAmount=" + orderAmount +
        ", pdAmount=" + pdAmount +
        ", shippingFee=" + shippingFee +
        ", evaluationState=" + evaluationState +
        ", orderState=" + orderState +
        ", refundState=" + refundState +
        ", lockState=" + lockState +
        ", refundAmount=" + refundAmount +
        ", delayTime=" + delayTime +
        ", shippingCode=" + shippingCode +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}