package com.hzitxx.hitao.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.mapper.ShopAddressMapper;
import com.hzitxx.hitao.service.ShopFavoritesService;
import com.hzitxx.hitao.service.ShopMemberService;
import com.hzitxx.hitao.utils.JwtTokenUtil;
import com.hzitxx.hitao.utils.Md5Util;
import com.hzitxx.hitao.utils.ServerResponse;
/**
 * 登陆功能
 * @author WE1
 *
 */
@RequestMapping("/member")
@RestController
public class LogInOutController {
	@Autowired
	private ShopMemberService shopMemberService;
	@Autowired
	private ShopAddressMapper shopAddressMapper;
	
	
	/**
	 * 登陆
	 * @param shopMember
	 * @return
	 */
	@PostMapping("/login")
	public ServerResponse<?> login(@RequestBody ShopMember shopMember) {
		Map<String, String> map = new HashMap<>();//传递用户名和密码
		map.put("memberName", shopMember.getMemberName());
		try {
			map.put("memberPassword", Md5Util.getMD5(Md5Util.getMD5(shopMember.getMemberPassword())));//对输入的密码进行MD5加密
		} catch (Exception e1) {
			return ServerResponse.createByErrorMessage("登陆失败！用户名或密码错误！请重新登陆！");
		}
		ShopMember memberResult = shopMemberService.checkShopMember(map);//根据用户名和密码查询是否存在
		if (StringUtils.isEmpty(memberResult)) {
			return ServerResponse.createByErrorMessage("登陆失败！用户名或密码错误！请重新登陆！");
		} else {
			try {
				String token = JwtTokenUtil.createToken(shopMember.getMemberName(),//根据用户名和用户ID创建token
						memberResult.getMemberId().toString());
				Map<String, Object> resultMap = new HashMap<>();//返回用户信息的map
				
				resultMap.put("cartCount", 2);//购物车的商品总数
				resultMap.put("token", token);
				resultMap.put("shopMember", memberResult);//会员用户信息
				Map<String,Object> isDefaultMap=new HashMap<>();//用于查询会员默认地址
				isDefaultMap.put("memberId", memberResult.getMemberId());
				isDefaultMap.put("isDefault", 1);
				resultMap.put("defaultAddress", shopAddressMapper.findShopAddress(isDefaultMap));//查询会员默认地址
				return ServerResponse.createBySuccess("登陆成功！", resultMap);
			} catch (UnsupportedEncodingException e) {
				return ServerResponse.createByErrorMessage("登陆失败！用户名或密码错误！请重新登陆！");
			}
		}
	}
}
