package com.hzitxx.hitao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopF0;
import com.hzitxx.hitao.entity.ShopF1;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.service.ShopFrontCategoryService;
import com.hzitxx.hitao.utils.ServerResponse;

@RestController
@RequestMapping("/front")
public class ShopFrontgategoryController {
	@Autowired
	private ShopFrontCategoryService service;
   
	@GetMapping("/select")
	public ServerResponse<List<ShopFrontCategory>> sel(){
		Map<String, Object> map = new HashMap<>();
		map.put("parentId", 0);
		return service.select(map);
	}
	@GetMapping("/findson")
	public ServerResponse<ShopF0> find1(){
		ShopF0 shopF0 = new ShopF0();
		  shopF0.setCategory(service.findSon(0).getData().getCategory());
		  shopF0.setCategoryContent(service.findSon(1).getData().getCategoryContent());
		 return ServerResponse.createBySuccess(shopF0);
	}
	@GetMapping("/findson2")
	public ServerResponse<List<ShopF1>> find2(int frontCatId){
		 return ServerResponse.createBySuccess(service.findSon(frontCatId).getData().getCategoryContent());
		 
	}
}
