package com.hzitxx.hitao.mapper;

import com.hzitxx.hitao.entity.ShopGoodsCategory;
import com.hzitxx.hitao.entity.ShopTree;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 商品分类表
 * @author Lenovo
 *
 */
public interface ShopGoodsCategoryMapper{
    
    int addShopGoodsCategory(ShopGoodsCategory obj);

    int addShopGoodsCategorySelective(ShopGoodsCategory obj);

    int deleteById(int catId);
                                            
    int deleteByIds(String[] ids);

    int updateById(ShopGoodsCategory shopGoodsCategory);

    int updateSelectiveById(ShopGoodsCategory shopGoodsCategory);

    ShopGoodsCategory findOne(Integer catId);
                                            
    List<ShopGoodsCategory> searchShopGoodsCategory(@Param("map")Map<String,Object> map);
    /**
     * 根据id找到自己
     */
    ShopTree selectById(Integer catId);
    /**
     * 根据父id找到子集信息
     */
    List<ShopTree> selectByPid(Integer pId);
    /**
     * 根据父id找下一级
     */
    List<ShopGoodsCategory> findBypId(Integer pId);
}