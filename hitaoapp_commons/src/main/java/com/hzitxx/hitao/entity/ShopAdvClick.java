package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 广告点击率表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopAdvClick implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 广告id
     */
    private Integer advId;
    /**
     * 所属广告位id
     */
    private Integer apId;
    /**
     * 点击年份
     */
    private Integer clickYear;
    /**
     * 点击月份
     */
    private Integer clickMonth;
    /**
     * 点击率
     */
    private Integer clickNum;
    /**
     * 广告名称
     */
    private String advName;
    /**
     * 广告位名称
     */
    private String apName;

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
 
    public Integer getClickYear() {
        return clickYear;
    }

    public void setClickYear(Integer clickYear) {
        this.clickYear = clickYear;
    }
 
    public Integer getClickMonth() {
        return clickMonth;
    }

    public void setClickMonth(Integer clickMonth) {
        this.clickMonth = clickMonth;
    }
 
    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }
 
    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }
 
    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }
 


    @Override
    public String toString() {
        return "ShopAdvClick{" +
        "advId=" + advId +
        ", apId=" + apId +
        ", clickYear=" + clickYear +
        ", clickMonth=" + clickMonth +
        ", clickNum=" + clickNum +
        ", advName=" + advName +
        ", apName=" + apName +
        "}";
    }
}