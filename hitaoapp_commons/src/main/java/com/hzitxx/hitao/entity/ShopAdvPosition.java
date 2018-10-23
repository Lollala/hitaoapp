package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 广告位表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopAdvPosition implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 广告位置id
     */
    private Integer apId;
    /**
     * 广告位置名
     */
    private String apName;
    /**
     * 广告位简介
     */
    private String apIntro;
    /**
     * 广告类别：0图片1文字2幻灯3Flash
     */
    private Integer apClass;
    /**
     * 广告展示方式：0幻灯片1多广告展示2单广告展示
     */
    private Integer apDisplay;
    /**
     * 广告位是否启用：0不启用1启用
     */
    private Integer isUse;
    /**
     * 广告位宽度
     */
    private Integer apWidth;
    /**
     * 广告位高度
     */
    private Integer apHeight;
    /**
     * 广告位单价
     */
    private Integer apPrice;
    /**
     * 拥有的广告数
     */
    private Integer advNum;
    /**
     * 广告位点击率
     */
    private Integer clickNum;
    /**
     * 广告位默认内容
     */
    private String defaultContent;

    public Integer getApId() {
        return apId;
    }

    public void setApId(Integer apId) {
        this.apId = apId;
    }
 
    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }
 
    public String getApIntro() {
        return apIntro;
    }

    public void setApIntro(String apIntro) {
        this.apIntro = apIntro;
    }
 
    public Integer getApClass() {
        return apClass;
    }

    public void setApClass(Integer apClass) {
        this.apClass = apClass;
    }
 
    public Integer getApDisplay() {
        return apDisplay;
    }

    public void setApDisplay(Integer apDisplay) {
        this.apDisplay = apDisplay;
    }
 
    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }
 
    public Integer getApWidth() {
        return apWidth;
    }

    public void setApWidth(Integer apWidth) {
        this.apWidth = apWidth;
    }
 
    public Integer getApHeight() {
        return apHeight;
    }

    public void setApHeight(Integer apHeight) {
        this.apHeight = apHeight;
    }
 
    public Integer getApPrice() {
        return apPrice;
    }

    public void setApPrice(Integer apPrice) {
        this.apPrice = apPrice;
    }
 
    public Integer getAdvNum() {
        return advNum;
    }

    public void setAdvNum(Integer advNum) {
        this.advNum = advNum;
    }
 
    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }
 
    public String getDefaultContent() {
        return defaultContent;
    }

    public void setDefaultContent(String defaultContent) {
        this.defaultContent = defaultContent;
    }
 


    @Override
    public String toString() {
        return "ShopAdvPosition{" +
        "apId=" + apId +
        ", apName=" + apName +
        ", apIntro=" + apIntro +
        ", apClass=" + apClass +
        ", apDisplay=" + apDisplay +
        ", isUse=" + isUse +
        ", apWidth=" + apWidth +
        ", apHeight=" + apHeight +
        ", apPrice=" + apPrice +
        ", advNum=" + advNum +
        ", clickNum=" + clickNum +
        ", defaultContent=" + defaultContent +
        "}";
    }
}