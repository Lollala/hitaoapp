package com.hzitxx.hitao.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.service.ShopFavoritesService;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 买家收藏表
 * 
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/shopFavorites")
public class ShopFavoritesController {
	@Autowired
	private ShopFavoritesService service;

	/**
	 * 查询所有 根据memberId获取这个会员的所有收藏
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	@GetMapping("/list")
	public ServerResponse<PageUtil<List<ShopFavorites>>> sel(
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "10") Integer limit, Integer memberId) {
		Map<String, Object> map = new HashMap<>();
		map.put("memberId", memberId);
		return service.selectShopFavorites(page, limit, map);
	}

	/**
	 * 查询一条
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/findone")
	public ServerResponse<ShopFavorites> findone(Integer id) {
		return service.findone(id);
	}

	/**
	 * 删除收藏
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteShopFavorites")
	public ServerResponse<String> del(Integer favId) {
		Map<String,Object> map=new HashMap<>();
		map.put("favId", favId);
		service.deleteFavorites(map);
		return ServerResponse.createBySuccessMessage("删除成功");
	}

	/**
	 * 添加
	 * 
	 * @param shopMenu
	 * @return
	 */
	@PostMapping("/addOrDelete")
	public ServerResponse<Integer> addOrDelete(@RequestParam(value = "type", defaultValue = "0") Integer type,
			@RequestBody ShopFavorites shopFavorites) {
		if (type==0) {
			shopFavorites.setFavTime(new Date());
			return service.addShopFavorites(shopFavorites);
		}else {
			Map<String,Object> map=new HashMap<>();
			map.put("favType", shopFavorites.getFavType());
			map.put("goodsId", shopFavorites.getGoodsId());
			map.put("memberId", shopFavorites.getMemberId());
			return service.deleteFavorites(map);
		}
	}

	/**
	 * 修改
	 * 
	 * @param shopMenu
	 * @return
	 */
	@PostMapping("/update")
	public ServerResponse<String> update(ShopFavorites shopFavorites) {
		service.updateFavorites(shopFavorites);
		return ServerResponse.createBySuccessMessage("更新成功");
	}
}
