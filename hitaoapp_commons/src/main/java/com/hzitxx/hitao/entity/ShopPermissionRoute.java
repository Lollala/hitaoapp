package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopPermissionRoute implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 路由编号
     */
    private Integer routeId;
    /**
     * 父级编号
     */
    private Integer parentId;
    /**
     * 路径
     */
    private String path;
    /**
     * 组件
     */
    private String component;
    /**
     * 命名路由
     */
    private String name;
    /**
     * 重定向
     */
    private String redirect;
    /**
     * 元数据
     */
    private String meta;

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }
 
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
 
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
 
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }
 
    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
 


    @Override
    public String toString() {
        return "ShopPermissionRoute{" +
        "routeId=" + routeId +
        ", parentId=" + parentId +
        ", path=" + path +
        ", component=" + component +
        ", name=" + name +
        ", redirect=" + redirect +
        ", meta=" + meta +
        "}";
    }
}