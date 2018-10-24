package com.hzitxx.hitao.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 买家地址信息表
 * @author WE1
 *
 */
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.service.ShopAddressService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
/**
 * 买家地址信息表
 * @author WE1
 *
 */
@Controller
public class ShopAddressController {
	@Autowired
	private ShopAddressService shopAddressService;
	private Map<String, Object> map = new HashMap<>();

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param limit
	 * @param memberName
	 * @return
	 */
	@GetMapping("/findShopAddress")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopAddress>> findShopAddress(@RequestParam("page") Integer page,
			@RequestParam("limit") Integer limit, String memberName) {
		map.put("memberName", memberName);
		return shopAddressService.findShopAddress(page, limit, map);
	}

	/**
	 * 添加买家地址信息
	 * 
	 * @param shopAddress
	 * @return
	 */
	@PostMapping("/addShopAddress")
	@ResponseBody
	public ServerResponse<?> addShopAddress(@RequestBody ShopAddress shopAddress) {
		return shopAddressService.addShopAddress(shopAddress);
	}

	/**
	 * 修改买家地址信息
	 * 
	 * @param shopAddress
	 * @return
	 */
	@PostMapping("/updateShopAddress")
	@ResponseBody
	public ServerResponse<?> updateShopAddress(@RequestBody ShopAddress shopAddress) {
		return shopAddressService.updateShopAddress(shopAddress);
	}

	/**
	 * 删除买家地址信息
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("/deleteShopAddress")
	@ResponseBody
	public ServerResponse<?> deleteShopAddress(Integer id) {
		return shopAddressService.deleteShopAddress(id);
	}
}
