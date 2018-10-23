package com.hzitxx.hitao.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 销量统计表
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-06
 */
public class ShopSalenum implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private Integer id;
    /**
     * 销售日期
     */
    private Integer date;
    /**
     * 销量
     */
    private Integer salenum;
    /**
     * 商品ID
     */
    private Integer goodsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }
 
    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }
 
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
 


    @Override
    public String toString() {
        return "ShopSalenum{" +
        "id=" + id +
        ", date=" + date +
        ", salenum=" + salenum +
        ", goodsId=" + goodsId +
        "}";
    }
}