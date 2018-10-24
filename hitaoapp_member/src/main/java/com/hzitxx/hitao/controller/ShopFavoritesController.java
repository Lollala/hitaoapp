package com.hzitxx.hitao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.entity.ShopMenu;
import com.hzitxx.hitao.service.ShopFavoritesService;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 买家收藏表
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/favorites")
public class ShopFavoritesController {
  @Autowired
  private ShopFavoritesService service;
  
  /**
	 * 查询所有
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	@GetMapping("/select")
	public ServerResponse<PageUtil<List<ShopFavorites>>> sel(int page, int limit, Map<String, Object> map) {
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
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("/delete")
	public ServerResponse<String> del(Integer favId) {
		service.deleteFavorites(favId);
		return ServerResponse.createBySuccessMessage("删除成功");
	}

	/**
	 * 添加
	 * 
	 * @param shopMenu
	 * @return
	 */
	@PostMapping("/add")
	public ServerResponse<String> add(ShopFavorites shopFavorites) {
		service.addShopFavorites(shopFavorites);
		return ServerResponse.createBySuccessMessage("添加成功");
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
