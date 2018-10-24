package com.hzitxx.hitao.service;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 会员表
 * 
 * @author Lenovo
 *
 */
public interface ShopMemberService {

	/**
	 * 添加
	 * 
	 * @param shopMember
	 * @return
	 */
	ServerResponse<Integer> addShopMember(ShopMember shopMember);

	/**
	 * 删除
	 * 
	 * @param memeberId
	 * @return
	 */
	ServerResponse<Integer> deleteShopMember(Integer memeberId);

	/**
	 * 修改
	 * 
	 * @param shopMember
	 * @return
	 */
	ServerResponse<Integer> updateShopMember(ShopMember shopMember);

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	ServerResponse<PageUtil<List<ShopMember>>> selectShopMember(
			Integer page,Integer limit,Map<String, Object> map);

	/**
	 * 查询一条
	 * 
	 * @param memberId
	 * @return
	 */
	ServerResponse<ShopMember> findone(Integer memberId);
	/**
	 * 登陆验证（用户名+密码）
	 * @param map
	 * @return
	 */
	ShopMember checkShopMember(Map<String,String> map);
}
