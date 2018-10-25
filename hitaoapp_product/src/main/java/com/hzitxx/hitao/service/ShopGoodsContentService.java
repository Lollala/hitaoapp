package com.hzitxx.hitao.service;

import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.utils.LayuiEntity;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品内容表 服务类
 * </p>
 *
 * @author WE1
 * @since 2018-10-17
 */

public interface ShopGoodsContentService  {
    ServerResponse<?> addGoodsContent(ShopGoodsContent goodsContent);

    ServerResponse<?> addGoodsContentSelective(ShopGoodsContent obj);

    ServerResponse<?> deleteById(int goodsId);

    ServerResponse<?> deleteByIds(String[] ids);

    ServerResponse<?> updateById(ShopGoodsContent goodsContent);

    ServerResponse<?> updateSelectiveById(ShopGoodsContent goodsContent);

    ServerResponse<List<ShopGoodsContent>> searchGoodsContent(Map<String,Object> map);

    /**
     * 数据查询分页
     * @param page
     * @param limit
     * @param map
     * @return
     */
    ServerResponse<LayuiEntity<ShopGoodsContent>> page(int page, int limit, Map<String,Object> map);

    /**
     * 根据编号查询数据
     *
     */
    ServerResponse<ShopGoodsContent> findOne(Integer goodsId);

}
