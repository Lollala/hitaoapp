package com.hzitxx.hitao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.service.ShopMemberService;
import com.hzitxx.hitao.utils.Md5Util;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;
/**
 * 会员 信息表
 * @author WE1
 *
 */
@RestController
public class ShopMemberController {
	@Autowired
	private ShopMemberService service;

	/**
	 * 分页查询所有数据
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	@GetMapping("/select")
	public ServerResponse<PageUtil<List<ShopMember>>> sel(Integer page, Integer limit, Map<String, Object> map) {
		return service.selectShopMember(page, limit, map);
	}

	/**
	 * 查询一条数据
	 * 
	 * @param memberId
	 * @return
	 */
	@GetMapping("/findone")
	public ServerResponse<ShopMember> findone(Integer memberId) {
		return service.findone(memberId);
	}

	/**
	 * 添加
	 * 
	 * @param shopMember
	 * @return
	 */
	@PostMapping("/register")
	public ServerResponse<Integer> add(@RequestBody ShopMember shopMember) {
		try {
			shopMember.setMemberPassword(Md5Util.getMD5(Md5Util.getMD5(shopMember.getMemberPassword())));
		} catch (Exception e) {
			return ServerResponse.createByErrorMessage("注册失败!");
		}
		return service.addShopMember(shopMember);
	}

	/**
	 * 修改
	 * 
	 * @param shopMember
	 * @return
	 */
	@PostMapping("/saveMemberInfo")
	public ServerResponse<Integer> update(@RequestBody ShopMember shopMember) {
		return service.updateShopMember(shopMember);
	}

	/**
	 * 删除
	 * 
	 * @param memberId
	 * @return
	 */
	@PostMapping("/delete")
	public ServerResponse<String> del(Integer memberId) {
		service.deleteShopMember(memberId);
		return ServerResponse.createBySuccessMessage("删除成功!");
	}

}
