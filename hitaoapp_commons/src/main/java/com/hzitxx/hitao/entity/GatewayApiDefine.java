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
public class GatewayApiDefine implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Integer id;
    /**
     * 请求匹配路径
     */
    private String path;
    /**
     * 注册服务的名称
     */
    private String serviceId;
    /**
     * 代理服务地址
     */
    private String url;
    /**
     * 是否可以重试
     */
    private Integer retryable;
    /**
     * 是否启用,0:启用 1:不启用 默认为0
     */
    private Integer enabled;
    /**
     * 是否忽略访问前缀
     */
    private Integer stripPrefix;
    /**
     * api名称
     */
    private String apiName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
 
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
 
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
 
    public Integer getRetryable() {
        return retryable;
    }

    public void setRetryable(Integer retryable) {
        this.retryable = retryable;
    }
 
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
 
    public Integer getStripPrefix() {
        return stripPrefix;
    }

    public void setStripPrefix(Integer stripPrefix) {
        this.stripPrefix = stripPrefix;
    }
 
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
 


    @Override
    public String toString() {
        return "GatewayApiDefine{" +
        "id=" + id +
        ", path=" + path +
        ", serviceId=" + serviceId +
        ", url=" + url +
        ", retryable=" + retryable +
        ", enabled=" + enabled +
        ", stripPrefix=" + stripPrefix +
        ", apiName=" + apiName +
        "}";
    }
}