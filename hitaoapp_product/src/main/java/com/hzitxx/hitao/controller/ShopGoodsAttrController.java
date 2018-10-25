package com.hzitxx.hitao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.service.ShopGoodsAttrService;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品属性表
 * 
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/goodsattr")
public class ShopGoodsAttrController {
	@Autowired
	private ShopGoodsAttrService service;

	 /**
		 * 查询所有
		 * 
		 * @param page
		 * @param limit
		 * @param map
		 * @return
		 */
		@GetMapping("/select")
		public ServerResponse<PageUtil<List<ShopGoodsAttr>>> sel(int page, int limit, Map<String, Object> map) {
			return service.select(page, limit, map);
		}

		/**
		 * 查询一条
		 * 
		 * @param id
		 * @return
		 */
		@GetMapping("/findone")
		public ServerResponse<ShopGoodsAttr> findone(Integer goodsId) {
			return service.findone(goodsId);
		}

		/**
		 * 删除
		 * 
		 * @param id
		 * @return
		 */
		@GetMapping("/delete")
		public ServerResponse<String> del(Integer goodsId) {
			service.delete(goodsId);
			return ServerResponse.createBySuccessMessage("删除成功");
		}

		/**
		 * 添加
		 * 
		 * @param shopMenu
		 * @return
		 */
		@PostMapping("/add")
		public ServerResponse<String> add(@RequestBody ShopGoodsAttr shopGoodsAttr) {
			service.add(shopGoodsAttr);
			return ServerResponse.createBySuccessMessage("添加成功");
		}

		/**
		 * 修改
		 * 
		 * @param shopMenu
		 * @return
		 */
		@PostMapping("/update")
		public ServerResponse<String> update(@RequestBody ShopGoodsAttr shopGoodsAttr) {
			service.update(shopGoodsAttr);
			return ServerResponse.createBySuccessMessage("更新成功");
		}
}
