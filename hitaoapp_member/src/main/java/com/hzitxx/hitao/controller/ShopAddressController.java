package com.hzitxx.hitao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/shopAddress")
public class ShopAddressController {
	@Autowired
	private ShopAddressService shopAddressService;


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
		Map<String, Object> map = new HashMap<>();
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
	@DeleteMapping("/delete")
	@ResponseBody
	public ServerResponse<?> deleteShopAddress(@RequestParam("id")Integer id) {
		return shopAddressService.deleteShopAddress(id);
	}
	/**
	 * 获取默认收获地址
	 * @param memberId
	 * @return
	 */
	@GetMapping("/getDefaultAddress")
	@ResponseBody
	public ServerResponse<ShopAddress> getDefaultAddress(@RequestParam("memberId")Integer memberId){
		Map<String,Object> isDefaultMap=new HashMap<>();//用于查询会员默认地址
		isDefaultMap.put("memberId", memberId);
		isDefaultMap.put("isDefault", 1);
		return shopAddressService.getOneAddress(isDefaultMap);//查询会员默认地址
	}
	/**
	 * 获取所有地址信息
	 * @param memberId
	 * @return
	 */
	@GetMapping("/list")
	@ResponseBody
	public ServerResponse<List<ShopAddress>> list(@RequestParam("memberId")Integer memberId){
		Map<String,Object> map=new HashMap<>();
		map.put("memberId", memberId);
		return shopAddressService.getAddressList(map);
	}
	/**
	 * 根据Id获取地址信息
	 * @param id
	 * @return
	 */
	@GetMapping("/detail")
	@ResponseBody
	public ServerResponse<ShopAddress> detail(@RequestParam("id")Integer id){
		Map<String,Object> map=new HashMap<>();
		map.put("id", id);
		return shopAddressService.getOneAddress(map);
	}
}
