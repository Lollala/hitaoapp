package com.hzitxx.hitao.mapper;

import com.hzitxx.hitao.entity.ShopFrontCategory;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xianyaoji
 * @since 2018-08-10
 */
public interface ShopFrontCategoryMapper{
	/**
	 * 根据父id查询子集
	 * @param parentId
	 * @return
	 */
	List<ShopFrontCategory> ByparentId(Integer parentId);

    int addShopFrontCategory(ShopFrontCategory obj);

    int addShopFrontCategorySelective(ShopFrontCategory obj);

    int deleteById(int frontCatId);
                                        
    int deleteByIds(String[] ids);

    int updateById(ShopFrontCategory shopFrontCategory);

    int updateSelectiveById(ShopFrontCategory shopFrontCategory);

    ShopFrontCategory findOne(Integer frontCatId);
                                        
    List<ShopFrontCategory> searchShopFrontCategory(@Param("map")Map<String,Object> map);
}