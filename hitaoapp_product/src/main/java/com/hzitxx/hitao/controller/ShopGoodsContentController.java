package com.hzitxx.hitao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.MiniGoods;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.service.ShopGoodsContentService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品内容表
 * @author Lenovo
 *
 */

@RestController
@RequestMapping("/goodscontent")
public class ShopGoodsContentController {
   @Autowired
   private ShopGoodsContentService service;
   
   /**
	 * 查询所有
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	@GetMapping("/select")
	public ServerResponse<LayuiEntity<ShopGoodsContent>> sel(int page, int limit, Map<String, Object> map) {
		return service.page(page,limit,map);
	}

	/**
	 * 查询一条
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/findone")
	public ServerResponse<ShopGoodsContent> findone(Integer goodsId) {
		return service.findOne(goodsId);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/delete")
	public ServerResponse<String> del(Integer goodsId) {
		service.deleteById(goodsId);
		return ServerResponse.createBySuccessMessage("删除成功");
	}

	/**
	 * 添加
	 * 
	 * @param shopMenu
	 * @return
	 */
	@PostMapping("/add")
	public ServerResponse<String> add(@RequestBody ShopGoodsContent goodsContent) {
		service.addGoodsContent(goodsContent);
		return ServerResponse.createBySuccessMessage("添加成功");
	}

	/**
	 * 修改
	 * 
	 * @param shopMenu
	 * @return
	 */
	@PostMapping("/update")
	public ServerResponse<String> update(@RequestBody ShopGoodsContent goodsContent) {
		service.updateSelectiveById(goodsContent);
		return ServerResponse.createBySuccessMessage("更新成功");
	}
	
}
