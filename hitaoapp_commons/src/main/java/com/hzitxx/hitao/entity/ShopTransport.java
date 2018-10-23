package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 运费模板
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopTransport implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 运费模板ID
     */
    private Integer id;
    /**
     * 运费模板名称
     */
    private String title;
    /**
     * 发货地区模板ID
     */
    private Integer sendTplId;
    /**
     * 是否删除0:未删除;1:已删除
     */
    private Integer isDel;
    /**
     * 录入时间
     */
    private Date createdTime;
    /**
     * 修改时间
     */
    private Date updatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
 
    public Integer getSendTplId() {
        return sendTplId;
    }

    public void setSendTplId(Integer sendTplId) {
        this.sendTplId = sendTplId;
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
        return "ShopTransport{" +
        "id=" + id +
        ", title=" + title +
        ", sendTplId=" + sendTplId +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}