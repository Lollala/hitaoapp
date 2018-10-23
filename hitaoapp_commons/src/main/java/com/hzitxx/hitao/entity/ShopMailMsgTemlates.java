package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 邮件模板表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopMailMsgTemlates implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 模板名称
     */
    private String name;
    /**
     * 模板标题
     */
    private String title;
    /**
     * 模板调用代码
     */
    private String code;
    /**
     * 模板内容
     */
    private String content;
    /**
     * 模板类别，0为邮件，1为短信息，默认为0
     */
    private Integer type;
    /**
     * 是否开启
     */
    private Integer mailSwitch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
 
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
 
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
 
    public Integer getMailSwitch() {
        return mailSwitch;
    }

    public void setMailSwitch(Integer mailSwitch) {
        this.mailSwitch = mailSwitch;
    }
 


    @Override
    public String toString() {
        return "ShopMailMsgTemlates{" +
        "id=" + id +
        ", name=" + name +
        ", title=" + title +
        ", code=" + code +
        ", content=" + content +
        ", type=" + type +
        ", mailSwitch=" + mailSwitch +
        "}";
    }
}