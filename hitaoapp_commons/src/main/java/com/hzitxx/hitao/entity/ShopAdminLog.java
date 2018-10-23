package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 管理员操作日志
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopAdminLog implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer logId;
    /**
     * 操作内容
     */
    private String content;
    /**
     * 发生时间
     */
    private Integer createtime;
    /**
     * 管理员
     */
    private String adminName;
    /**
     * 管理员ID
     */
    private Integer adminId;
    /**
     * IP
     */
    private String ip;
    /**
     * 是否删除0:未删除;1:已删除
     */
    private Integer isDel;
    private Date createdTime;
    /**
     * 更新时间(自更新)
     */
    private Date updatedTime;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }
 
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
 
    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }
 
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
 
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
 
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
        return "ShopAdminLog{" +
        "logId=" + logId +
        ", content=" + content +
        ", createtime=" + createtime +
        ", adminName=" + adminName +
        ", adminId=" + adminId +
        ", ip=" + ip +
        ", isDel=" + isDel +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}