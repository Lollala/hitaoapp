package com.hzitxx.hitao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hzitxx.hitao.entity.Goods1;
import com.hzitxx.hitao.entity.MiniGoods;
import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.service.ShopFavoritesService;
import com.hzitxx.hitao.service.ShopGoodsAttrService;
import com.hzitxx.hitao.service.ShopGoodsContentService;
import com.hzitxx.hitao.service.ShopGoodsServices;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品表
 * 
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/goods")
public class ShopGoodsController {
	@Autowired
	private ShopGoodsServices service;
	@Autowired
	private ShopGoodsAttrService service2;
	@Autowired
	private ShopGoodsContentService service3;
	@Autowired
	  private ShopFavoritesService service4;

	/**
	 * 查询所有
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	@GetMapping("/select")
	public ServerResponse<PageUtil<List<ShopGoods>>> sel(int page, int limit, Map<String, Object> map) {
		return service.select(page, limit, map);
	}

	/**
	 * 查询一条
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/findone")
	public ServerResponse<ShopGoods> findone(Integer goodsId) {
		return service.findone(goodsId);
	}
	@GetMapping("/check")
	public ServerResponse<String> check(int goodsId,int number){
		return service.check(goodsId,number);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("/delete")
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
	public ServerResponse<String> add(@RequestBody ShopGoods shopGoods) {
		service.add(shopGoods);
		return ServerResponse.createBySuccessMessage("添加成功");
	}

	/**
	 * 修改
	 * 
	 * @param shopMenu
	 * @return
	 */
	@PostMapping("/update")
	public ServerResponse<String> update(@RequestBody ShopGoods shopGoods) {
		service.update(shopGoods);
		return ServerResponse.createBySuccessMessage("更新成功");
	}
	@GetMapping("/count")
	public ServerResponse<Integer> findCount(){
		return service.count();
	}

	/**
	 * 小程序首页,获取商品列表信息
	 * 
	 * @return
	 */
	@GetMapping("/findGoods")
	public ServerResponse<List<MiniGoods>> findGoods() {
		return service.findGoods();
	}

	/**
	 * 商品详细信息
	 * 
	 * @return
	 */
	@GetMapping("/details")
	public ServerResponse<?> details(String goodsId,String memberId) {
		System.out.println(goodsId+"---"+memberId);
		ServerResponse<ShopGoods> g1 = service.findone(Integer.parseInt(goodsId));//商品基本信息
		ServerResponse<ShopGoodsAttr> g2 = service2.findone(Integer.parseInt(goodsId));//商品属性
		ServerResponse<ShopGoodsContent> g3 = service3.findOne(Integer.parseInt(goodsId));//商品内容
		ServerResponse<ShopFavorites> g4=service4.findByGoodsId(Integer.parseInt(goodsId));//是否是收藏商品
		List<Goods1> list = new ArrayList<>();
		list =JSON.parseArray(g2.getData().getAttrValue(),Goods1.class);
		Map<String, Object> map = new HashMap<>();
		map.put("shopGoods", g1.getData());
		map.put("goodsContent", g3.getData());
		map.put("goodsAttr",list);
		if (g4.getData()!=null) {
			map.put("isFavorites",1);// 收藏
		}else{
			map.put("isFavorites",0);// 不收藏
		}
		return ServerResponse.createBySuccess(map);
	}
}
