package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 快递公司
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopExpress implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 索引ID
     */
    private Integer id;
    /**
     * 公司名称
     */
    private String eName;
    /**
     * 状态
     */
    private Integer eState;
    /**
     * 编号
     */
    private String eCode;
    /**
     * 首字母
     */
    private String eLetter;
    /**
     * 1常用0不常用
     */
    private Integer eOrder;
    /**
     * 公司网址
     */
    private String eUrl;
    /**
     * 删除标记
     */
    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
 
    public Integer geteState() {
        return eState;
    }

    public void seteState(Integer eState) {
        this.eState = eState;
    }
 
    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
    }
 
    public String geteLetter() {
        return eLetter;
    }

    public void seteLetter(String eLetter) {
        this.eLetter = eLetter;
    }
 
    public Integer geteOrder() {
        return eOrder;
    }

    public void seteOrder(Integer eOrder) {
        this.eOrder = eOrder;
    }
 
    public String geteUrl() {
        return eUrl;
    }

    public void seteUrl(String eUrl) {
        this.eUrl = eUrl;
    }
 
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
 


    @Override
    public String toString() {
        return "ShopExpress{" +
        "id=" + id +
        ", eName=" + eName +
        ", eState=" + eState +
        ", eCode=" + eCode +
        ", eLetter=" + eLetter +
        ", eOrder=" + eOrder +
        ", eUrl=" + eUrl +
        ", isDel=" + isDel +
        "}";
    }
}