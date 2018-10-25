package com.hzitxx.hitao.service;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopF0;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopFrontCategoryService {
	/**
	 * 查询所有数据
	 * @param map
	 * @return
	 */
  ServerResponse<List<ShopFrontCategory>> select(Map<String, Object> map);
  /**
   * 找子集
   * @return
   */
  ServerResponse<ShopF0> findSon(int pid);
}
