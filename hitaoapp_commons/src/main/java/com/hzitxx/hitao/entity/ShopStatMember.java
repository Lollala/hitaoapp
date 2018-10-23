package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * <p>
 * 会员相关数据统计
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopStatMember implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增ID
     */
    private Integer statmId;
    /**
     * 会员ID
     */
    private Integer statmMemberid;
    /**
     * 会员名称
     */
    private String statmMembername;
    /**
     * 统计时间，当前按照最小时间单位为天
     */
    private Integer statmTime;
    /**
     * 下单量
     */
    private Integer statmOrdernum;
    /**
     * 下单金额
     */
    private BigDecimal statmOrderamount;
    /**
     * 下单商品件数
     */
    private Integer statmGoodsnum;
    /**
     * 预存款增加额
     */
    private BigDecimal statmPredincrease;
    /**
     * 预存款减少额
     */
    private BigDecimal statmPredreduce;
    /**
     * 积分增加额
     */
    private Integer statmPointsincrease;
    /**
     * 积分减少额
     */
    private Integer statmPointsreduce;
    /**
     * 记录更新时间
     */
    private Integer statmUpdatetime;

    public Integer getStatmId() {
        return statmId;
    }

    public void setStatmId(Integer statmId) {
        this.statmId = statmId;
    }
 
    public Integer getStatmMemberid() {
        return statmMemberid;
    }

    public void setStatmMemberid(Integer statmMemberid) {
        this.statmMemberid = statmMemberid;
    }
 
    public String getStatmMembername() {
        return statmMembername;
    }

    public void setStatmMembername(String statmMembername) {
        this.statmMembername = statmMembername;
    }
 
    public Integer getStatmTime() {
        return statmTime;
    }

    public void setStatmTime(Integer statmTime) {
        this.statmTime = statmTime;
    }
 
    public Integer getStatmOrdernum() {
        return statmOrdernum;
    }

    public void setStatmOrdernum(Integer statmOrdernum) {
        this.statmOrdernum = statmOrdernum;
    }
 
    public BigDecimal getStatmOrderamount() {
        return statmOrderamount;
    }

    public void setStatmOrderamount(BigDecimal statmOrderamount) {
        this.statmOrderamount = statmOrderamount;
    }
 
    public Integer getStatmGoodsnum() {
        return statmGoodsnum;
    }

    public void setStatmGoodsnum(Integer statmGoodsnum) {
        this.statmGoodsnum = statmGoodsnum;
    }
 
    public BigDecimal getStatmPredincrease() {
        return statmPredincrease;
    }

    public void setStatmPredincrease(BigDecimal statmPredincrease) {
        this.statmPredincrease = statmPredincrease;
    }
 
    public BigDecimal getStatmPredreduce() {
        return statmPredreduce;
    }

    public void setStatmPredreduce(BigDecimal statmPredreduce) {
        this.statmPredreduce = statmPredreduce;
    }
 
    public Integer getStatmPointsincrease() {
        return statmPointsincrease;
    }

    public void setStatmPointsincrease(Integer statmPointsincrease) {
        this.statmPointsincrease = statmPointsincrease;
    }
 
    public Integer getStatmPointsreduce() {
        return statmPointsreduce;
    }

    public void setStatmPointsreduce(Integer statmPointsreduce) {
        this.statmPointsreduce = statmPointsreduce;
    }
 
    public Integer getStatmUpdatetime() {
        return statmUpdatetime;
    }

    public void setStatmUpdatetime(Integer statmUpdatetime) {
        this.statmUpdatetime = statmUpdatetime;
    }
 


    @Override
    public String toString() {
        return "ShopStatMember{" +
        "statmId=" + statmId +
        ", statmMemberid=" + statmMemberid +
        ", statmMembername=" + statmMembername +
        ", statmTime=" + statmTime +
        ", statmOrdernum=" + statmOrdernum +
        ", statmOrderamount=" + statmOrderamount +
        ", statmGoodsnum=" + statmGoodsnum +
        ", statmPredincrease=" + statmPredincrease +
        ", statmPredreduce=" + statmPredreduce +
        ", statmPointsincrease=" + statmPointsincrease +
        ", statmPointsreduce=" + statmPointsreduce +
        ", statmUpdatetime=" + statmUpdatetime +
        "}";
    }
}