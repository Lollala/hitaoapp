package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 订单公共信息

 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopOrderCommon implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer orderId;
    /**
     * 配送时间
     */
    private Date shippingTime;
    /**
     * 配送公司ID
     */
    private Integer shippingExpressId;
    /**
     * 评价时间
     */
    private Date evaluationTime;
    /**
     * 卖家是否已评价买家
     */
    private Integer evalsellerState;
    /**
     * 卖家评价买家的时间
     */
    private Date evalsellerTime;
    private String orderMessage;
    private Integer orderPointscount;
    /**
     * 代金券面额
     */
    private Integer voucherPrice;
    /**
     * 代金券编码
     */
    private String voucherCode;
    /**
     * 发货备注
     */
    private String deliverExplain;
    /**
     * 发货备注
     */
    private Integer daddressId;
    /**
     * 收货人姓名
     */
    private String reciverName;
    /**
     * 收货人其它信息
     */
    private String reciverInfo;
    /**
     * 收货人省级ID
     */
    private Integer reciverProvinceId;
    /**
     * 发票信息
     */
    private String invoiceInfo;
    /**
     * 促销信息备注
     */
    private String promotionInfo;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
 
    public Date getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }
 
    public Integer getShippingExpressId() {
        return shippingExpressId;
    }

    public void setShippingExpressId(Integer shippingExpressId) {
        this.shippingExpressId = shippingExpressId;
    }
 
    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }
 
    public Integer getEvalsellerState() {
        return evalsellerState;
    }

    public void setEvalsellerState(Integer evalsellerState) {
        this.evalsellerState = evalsellerState;
    }
 
    public Date getEvalsellerTime() {
        return evalsellerTime;
    }

    public void setEvalsellerTime(Date evalsellerTime) {
        this.evalsellerTime = evalsellerTime;
    }
 
    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }
 
    public Integer getOrderPointscount() {
        return orderPointscount;
    }

    public void setOrderPointscount(Integer orderPointscount) {
        this.orderPointscount = orderPointscount;
    }
 
    public Integer getVoucherPrice() {
        return voucherPrice;
    }

    public void setVoucherPrice(Integer voucherPrice) {
        this.voucherPrice = voucherPrice;
    }
 
    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }
 
    public String getDeliverExplain() {
        return deliverExplain;
    }

    public void setDeliverExplain(String deliverExplain) {
        this.deliverExplain = deliverExplain;
    }
 
    public Integer getDaddressId() {
        return daddressId;
    }

    public void setDaddressId(Integer daddressId) {
        this.daddressId = daddressId;
    }
 
    public String getReciverName() {
        return reciverName;
    }

    public void setReciverName(String reciverName) {
        this.reciverName = reciverName;
    }
 
    public String getReciverInfo() {
        return reciverInfo;
    }

    public void setReciverInfo(String reciverInfo) {
        this.reciverInfo = reciverInfo;
    }
 
    public Integer getReciverProvinceId() {
        return reciverProvinceId;
    }

    public void setReciverProvinceId(Integer reciverProvinceId) {
        this.reciverProvinceId = reciverProvinceId;
    }
 
    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }
 
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }
 


    @Override
    public String toString() {
        return "ShopOrderCommon{" +
        "orderId=" + orderId +
        ", shippingTime=" + shippingTime +
        ", shippingExpressId=" + shippingExpressId +
        ", evaluationTime=" + evaluationTime +
        ", evalsellerState=" + evalsellerState +
        ", evalsellerTime=" + evalsellerTime +
        ", orderMessage=" + orderMessage +
        ", orderPointscount=" + orderPointscount +
        ", voucherPrice=" + voucherPrice +
        ", voucherCode=" + voucherCode +
        ", deliverExplain=" + deliverExplain +
        ", daddressId=" + daddressId +
        ", reciverName=" + reciverName +
        ", reciverInfo=" + reciverInfo +
        ", reciverProvinceId=" + reciverProvinceId +
        ", invoiceInfo=" + invoiceInfo +
        ", promotionInfo=" + promotionInfo +
        "}";
    }
}