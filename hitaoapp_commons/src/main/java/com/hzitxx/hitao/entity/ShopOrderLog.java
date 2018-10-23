package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 订单处理历史表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopOrderLog implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Integer logId;
    /**
     * 订单id
     */
    private Integer orderId;
    /**
     * 文字描述
     */
    private String logMsg;
    /**
     * 处理时间
     */
    private Date logTime;
    /**
     * 操作角色
     */
    private String logRole;
    /**
     * 操作人
     */
    private String logUser;
    /**
     * 订单状态：0(已取消)10:未付款;20:已付款;30:已发货;40:已收货;
     */
    private Integer logOrderstate;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }
 
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
 
    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }
 
    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
 
    public String getLogRole() {
        return logRole;
    }

    public void setLogRole(String logRole) {
        this.logRole = logRole;
    }
 
    public String getLogUser() {
        return logUser;
    }

    public void setLogUser(String logUser) {
        this.logUser = logUser;
    }
 
    public Integer getLogOrderstate() {
        return logOrderstate;
    }

    public void setLogOrderstate(Integer logOrderstate) {
        this.logOrderstate = logOrderstate;
    }
 


    @Override
    public String toString() {
        return "ShopOrderLog{" +
        "logId=" + logId +
        ", orderId=" + orderId +
        ", logMsg=" + logMsg +
        ", logTime=" + logTime +
        ", logRole=" + logRole +
        ", logUser=" + logUser +
        ", logOrderstate=" + logOrderstate +
        "}";
    }
}