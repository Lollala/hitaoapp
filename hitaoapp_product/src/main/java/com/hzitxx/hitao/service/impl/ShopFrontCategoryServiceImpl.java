package com.hzitxx.hitao.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.ShopF0;
import com.hzitxx.hitao.entity.ShopF1;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.mapper.ShopFrontCategoryMapper;
import com.hzitxx.hitao.service.ShopFrontCategoryService;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopFrontCategoryServiceImpl implements ShopFrontCategoryService {
	@Autowired
	private ShopFrontCategoryMapper mapper;

	@Override
	public ServerResponse<List<ShopFrontCategory>> select(Map<String, Object> map) {
		List<ShopFrontCategory> list = mapper.searchShopFrontCategory(map);
		return ServerResponse.createBySuccess("商品三级目录数据", list);
	}

	@Override
	public ServerResponse<ShopF0> findSon(int pid) {
		List<ShopFrontCategory> list = mapper.ByparentId(pid);
		List<ShopF1> listson = new ArrayList<>();
		ShopF0 shopF0 = new ShopF0();
		for (ShopFrontCategory shopFrontCategory : list) {
			//0之下的1,3一代目,子集为第二代,遍历之后为第三代
			int id = shopFrontCategory.getFrontCatId();//坚果4,美女6
			ShopF1 shopF1 = new ShopF1();
			shopF1.setCatId(shopFrontCategory.getCatId());
			shopF1.setCatName(shopFrontCategory.getCatName());
			List<ShopFrontCategory> list2 = mapper.ByparentId(id);
			shopF1.setChildrens(list2);
			listson.add(shopF1);
		}
		shopF0.setCategory(list);
		shopF0.setCategoryContent(listson);
		return ServerResponse.createBySuccess("三级商品", shopF0);
	}

}
