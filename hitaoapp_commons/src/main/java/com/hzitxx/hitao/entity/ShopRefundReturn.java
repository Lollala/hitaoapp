package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * <p>
 * 退款退货表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopRefundReturn implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 记录ID
     */
    private Integer refundId;
    /**
     * 订单ID
     */
    private Integer orderId;
    /**
     * 申请编号
     */
    private String refundSn;
    /**
     * 买家ID
     */
    private Integer buyerId;
    /**
     * 买家会员名
     */
    private String buyerName;
    /**
     * 商品ID,全部退款是0
     */
    private Integer goodsId;
    /**
     * 订单商品ID,全部退款是0
     */
    private Integer orderGoodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品数量
     */
    private Integer goodsNum;
    /**
     * 退款金额
     */
    private BigDecimal refundAmount;
    /**
     * 商品图片
     */
    private String goodsImage;
    /**
     * 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
     */
    private Integer orderGoodsType;
    /**
     * 申请类型:1为退款,2为退货,默认为1
     */
    private Integer refundType;
    /**
     * 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
     */
    private Integer sellerState;
    /**
     * 申请状态:1为处理中,2为待管理员处理,3为已完成,默认为1
     */
    private Integer refundState;
    /**
     * 退货类型:1为不用退货,2为需要退货,默认为1
     */
    private Integer returnType;
    /**
     * 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
     */
    private Integer orderLock;
    /**
     * 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
     */
    private Integer goodsState;
    /**
     * 添加时间
     */
    private Date addTime;
    /**
     * 卖家处理时间
     */
    private Date sellerTime;
    /**
     * 管理员处理时间,默认为0
     */
    private Date adminTime;
    /**
     * 申请原因
     */
    private String buyerMessage;
    /**
     * 卖家备注
     */
    private String sellerMessage;
    /**
     * 管理员备注
     */
    private String adminMessage;
    /**
     * 物流公司编号
     */
    private Integer expressId;
    /**
     * 物流单号
     */
    private String invoiceNo;
    /**
     * 发货时间,默认为0
     */
    private Date shipTime;
    /**
     * 收货延迟时间,默认为0
     */
    private Integer delayTime;
    /**
     * 收货时间,默认为
     */
    private Integer receiveTime;
    /**
     * 收货备注
     */
    private String receiveMessage;
    /**
     * 佣金比例
     */
    private Integer commisRate;
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

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }
 
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
 
    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
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
 
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
 
    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }
 
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
 
    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
 
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }
 
    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }
 
    public Integer getOrderGoodsType() {
        return orderGoodsType;
    }

    public void setOrderGoodsType(Integer orderGoodsType) {
        this.orderGoodsType = orderGoodsType;
    }
 
    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }
 
    public Integer getSellerState() {
        return sellerState;
    }

    public void setSellerState(Integer sellerState) {
        this.sellerState = sellerState;
    }
 
    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }
 
    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }
 
    public Integer getOrderLock() {
        return orderLock;
    }

    public void setOrderLock(Integer orderLock) {
        this.orderLock = orderLock;
    }
 
    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }
 
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
 
    public Date getSellerTime() {
        return sellerTime;
    }

    public void setSellerTime(Date sellerTime) {
        this.sellerTime = sellerTime;
    }
 
    public Date getAdminTime() {
        return adminTime;
    }

    public void setAdminTime(Date adminTime) {
        this.adminTime = adminTime;
    }
 
    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }
 
    public String getSellerMessage() {
        return sellerMessage;
    }

    public void setSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage;
    }
 
    public String getAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(String adminMessage) {
        this.adminMessage = adminMessage;
    }
 
    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }
 
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
 
    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }
 
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }
 
    public Integer getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Integer receiveTime) {
        this.receiveTime = receiveTime;
    }
 
    public String getReceiveMessage() {
        return receiveMessage;
    }

    public void setReceiveMessage(String receiveMessage) {
        this.receiveMessage = receiveMessage;
    }
 
    public Integer getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(Integer commisRate) {
        this.commisRate = commisRate;
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
        return "ShopRefundReturn{" +
        "refundId=" + refundId +
        ", orderId=" + orderId +
        ", refundSn=" + refundSn +
        ", buyerId=" + buyerId +
        ", buyerName=" + buyerName +
        ", goodsId=" + goodsId +
        ", orderGoodsId=" + orderGoodsId +
        ", goodsName=" + goodsName +
        ", goodsNum=" + goodsNum +
        ", refundAmount=" + refundAmount +
        ", goodsImage=" + goodsImage +
        ", orderGoodsType=" + orderGoodsType +
        ", refundType=" + refundType +
        ", sellerState=" + sellerState +
        ", refundState=" + refundState +
        ", returnType=" + returnType +
        ", orderLock=" + orderLock +
        ", goodsState=" + goodsState +
        ", addTime=" + addTime +
        ", sellerTime=" + sellerTime +
        ", adminTime=" + adminTime +
        ", buyerMessage=" + buyerMessage +
        ", sellerMessage=" + sellerMessage +
        ", adminMessage=" + adminMessage +
        ", expressId=" + expressId +
        ", invoiceNo=" + invoiceNo +
        ", shipTime=" + shipTime +
        ", delayTime=" + delayTime +
        ", receiveTime=" + receiveTime +
        ", receiveMessage=" + receiveMessage +
        ", commisRate=" + commisRate +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}