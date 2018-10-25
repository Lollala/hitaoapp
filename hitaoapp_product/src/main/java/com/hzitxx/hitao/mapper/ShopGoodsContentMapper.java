package com.hzitxx.hitao.mapper;



import com.hzitxx.hitao.entity.ShopGoodsContent;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品内容表 Mapper 接口
 * </p>
 *
 * @author WE1
 * @since 2018-10-17
 */
public interface ShopGoodsContentMapper{

    int addGoodsContent(ShopGoodsContent obj);

    int addGoodsContentSelective(ShopGoodsContent obj);

    int deleteById(int goodsId);
                
    int deleteByIds(String[] ids);

    int updateById(ShopGoodsContent goodsContent);

    int updateSelectiveById(ShopGoodsContent goodsContent);

    ShopGoodsContent findOne(Integer goodsId);
                
    List<ShopGoodsContent> searchGoodsContent(Map<String,Object> map);
}