package com.hzitxx.hitao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopArea;
import com.hzitxx.hitao.service.ShopAreaService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@Controller
@RequestMapping("/shopArea")
public class ShopAreaController {
	@Autowired
	private ShopAreaService shopAreaService;

	
	@GetMapping("/findShoparea")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopArea>> findShopArea(@RequestParam("page") Integer page,
			@RequestParam("limit") Integer limit,String shopArea) {
		Map<String, Object>map=new HashMap<>();
		if (StringUtils.isEmpty(shopArea)) {//判断筛选条件是否存在
			map.put("ShopArea", shopArea);
		}
		return shopAreaService.findShopArea(page, limit, map);
	}
	/**
	 * 添加区域信息
	 * @param shoparea
	 * @return
	 */
	@PostMapping("/addShopArea")
	@ResponseBody
	public ServerResponse<?> addShopArea(ShopArea shoparea) {
		return shopAreaService.addShopArea(shoparea);
	}
	/**
	 * 修改区域信息
	 * @param shoparea
	 * @return
	 */
	@PostMapping("/updateShopArea")
	@ResponseBody
	public ServerResponse<?> updateShopArea(ShopArea shoparea){
		return shopAreaService.updateShopArea(shoparea);
	}
	/**
	 * 删除区域信息
	 * @param areaId
	 * @return
	 */
	@PostMapping("/deleteShopArea")
	@ResponseBody
	public ServerResponse<?> deleteShopArea(Integer areaId) {
		return shopAreaService.deleteShopArea(areaId);
	}
	@GetMapping("/getShopArea")
	@ResponseBody
	public ServerResponse<List<ShopArea>> getShopArea(@RequestParam("parentId")Integer parentId){
		Map<String, Object>map=new HashMap<>();
		map.put("parentId", parentId);
		return shopAreaService.littleFindShopArea(map);
	}
}

