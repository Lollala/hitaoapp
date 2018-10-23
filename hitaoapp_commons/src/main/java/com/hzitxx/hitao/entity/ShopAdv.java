package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 广告表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopAdv implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 广告自增标识编号
     */
    private Integer advId;
    /**
     * 广告位id
     */
    private Integer apId;
    /**
     * 广告内容描述
     */
    private String advTitle;
    /**
     * 广告内容
     */
    private String advContent;
    /**
     * 广告开始时间
     */
    private Date advStartDate;
    /**
     * 广告结束时间
     */
    private Date advEndDate;
    /**
     * 幻灯片排序
     */
    private Integer slideSort;
    /**
     * 会员ID
     */
    private Integer memberId;
    /**
     * 会员用户名
     */
    private String memberName;
    /**
     * 广告点击率
     */
    private Integer clickNum;
    /**
     * 会员购买的广告是否通过审核0未审核1审核已通过2审核未通过
     */
    private Integer isAllow;
    /**
     * 购买方式
     */
    private String buyStyle;
    /**
     * 购买所支付的金币
     */
    private Integer goldpay;

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }
 
    public Integer getApId() {
        return apId;
    }

    public void setApId(Integer apId) {
        this.apId = apId;
    }
 
    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle;
    }
 
    public String getAdvContent() {
        return advContent;
    }

    public void setAdvContent(String advContent) {
        this.advContent = advContent;
    }
 
    public Date getAdvStartDate() {
        return advStartDate;
    }

    public void setAdvStartDate(Date advStartDate) {
        this.advStartDate = advStartDate;
    }
 
    public Date getAdvEndDate() {
        return advEndDate;
    }

    public void setAdvEndDate(Date advEndDate) {
        this.advEndDate = advEndDate;
    }
 
    public Integer getSlideSort() {
        return slideSort;
    }

    public void setSlideSort(Integer slideSort) {
        this.slideSort = slideSort;
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
 
    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }
 
    public Integer getIsAllow() {
        return isAllow;
    }

    public void setIsAllow(Integer isAllow) {
        this.isAllow = isAllow;
    }
 
    public String getBuyStyle() {
        return buyStyle;
    }

    public void setBuyStyle(String buyStyle) {
        this.buyStyle = buyStyle;
    }
 
    public Integer getGoldpay() {
        return goldpay;
    }

    public void setGoldpay(Integer goldpay) {
        this.goldpay = goldpay;
    }
 


    @Override
    public String toString() {
        return "ShopAdv{" +
        "advId=" + advId +
        ", apId=" + apId +
        ", advTitle=" + advTitle +
        ", advContent=" + advContent +
        ", advStartDate=" + advStartDate +
        ", advEndDate=" + advEndDate +
        ", slideSort=" + slideSort +
        ", memberId=" + memberId +
        ", memberName=" + memberName +
        ", clickNum=" + clickNum +
        ", isAllow=" + isAllow +
        ", buyStyle=" + buyStyle +
        ", goldpay=" + goldpay +
        "}";
    }
}