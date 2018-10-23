package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 短消息
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 消息索引id
     */
    private Integer messageId;
    /**
     * 回复短消息message_id
     */
    private Integer messageParentId;
    /**
     * 消息发送人
     */
    private Integer fromMemberId;
    /**
     * 发信息人用户名
     */
    private String fromMemberName;
    /**
     * 消息接收人
     */
    private String toMemberId;
    /**
     * 接收人用户名
     */
    private String toMemberName;
    /**
     * 消息标题
     */
    private String messageTitle;
    /**
     * 消息内容
     */
    private String messageBody;
    /**
     * 消息发送时间
     */
    private String messageTime;
    /**
     * 消息回复更新时间
     */
    private String messageUpdateTime;
    /**
     * 消息打开状态
     */
    private Integer messageOpen;
    /**
     * 消息状态，0为正常状态，1为发送人删除状态，2为接收人删除状态
     */
    private Integer messageState;
    /**
     * 0为私信、1为系统消息、2为留言
     */
    private Integer messageType;
    /**
     * 已经读过该消息的会员id
     */
    private String readMemberId;
    /**
     * 已经删除该消息的会员id
     */
    private String delMemberId;
    /**
     * 站内信是否为一条发给多个用户 0为否 1为多条
     */
    private Integer messageIsmore;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }
 
    public Integer getMessageParentId() {
        return messageParentId;
    }

    public void setMessageParentId(Integer messageParentId) {
        this.messageParentId = messageParentId;
    }
 
    public Integer getFromMemberId() {
        return fromMemberId;
    }

    public void setFromMemberId(Integer fromMemberId) {
        this.fromMemberId = fromMemberId;
    }
 
    public String getFromMemberName() {
        return fromMemberName;
    }

    public void setFromMemberName(String fromMemberName) {
        this.fromMemberName = fromMemberName;
    }
 
    public String getToMemberId() {
        return toMemberId;
    }

    public void setToMemberId(String toMemberId) {
        this.toMemberId = toMemberId;
    }
 
    public String getToMemberName() {
        return toMemberName;
    }

    public void setToMemberName(String toMemberName) {
        this.toMemberName = toMemberName;
    }
 
    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }
 
    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
 
    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }
 
    public String getMessageUpdateTime() {
        return messageUpdateTime;
    }

    public void setMessageUpdateTime(String messageUpdateTime) {
        this.messageUpdateTime = messageUpdateTime;
    }
 
    public Integer getMessageOpen() {
        return messageOpen;
    }

    public void setMessageOpen(Integer messageOpen) {
        this.messageOpen = messageOpen;
    }
 
    public Integer getMessageState() {
        return messageState;
    }

    public void setMessageState(Integer messageState) {
        this.messageState = messageState;
    }
 
    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }
 
    public String getReadMemberId() {
        return readMemberId;
    }

    public void setReadMemberId(String readMemberId) {
        this.readMemberId = readMemberId;
    }
 
    public String getDelMemberId() {
        return delMemberId;
    }

    public void setDelMemberId(String delMemberId) {
        this.delMemberId = delMemberId;
    }
 
    public Integer getMessageIsmore() {
        return messageIsmore;
    }

    public void setMessageIsmore(Integer messageIsmore) {
        this.messageIsmore = messageIsmore;
    }
 


    @Override
    public String toString() {
        return "ShopMessage{" +
        "messageId=" + messageId +
        ", messageParentId=" + messageParentId +
        ", fromMemberId=" + fromMemberId +
        ", fromMemberName=" + fromMemberName +
        ", toMemberId=" + toMemberId +
        ", toMemberName=" + toMemberName +
        ", messageTitle=" + messageTitle +
        ", messageBody=" + messageBody +
        ", messageTime=" + messageTime +
        ", messageUpdateTime=" + messageUpdateTime +
        ", messageOpen=" + messageOpen +
        ", messageState=" + messageState +
        ", messageType=" + messageType +
        ", readMemberId=" + readMemberId +
        ", delMemberId=" + delMemberId +
        ", messageIsmore=" + messageIsmore +
        "}";
    }
}