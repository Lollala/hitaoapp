package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 系统设置表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopSetting implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 值
     */
    private String value;

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
 
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
 


    @Override
    public String toString() {
        return "ShopSetting{" +
        "id=" + id +
        ", name=" + name +
        ", value=" + value +
        "}";
    }
}