package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopMember;

/**
 * 会员表
 * 
 * @author Lenovo
 *
 */
public interface ShopMemberMapper {
	/**
	 * 添加会员
	 * 
	 * @param shopMember
	 * @return
	 */
	int addShopMember(ShopMember shopMember);

	/**
	 * 更新会员
	 * 
	 * @param shopMember
	 * @return
	 */
	int updateShopMember(ShopMember shopMember);

	/**
	 * 删除会员
	 * 
	 * @param memberId
	 * @return
	 */
	int deleteShopMember(Integer memberId);

	/**
	 * 根据id查找会员
	 * 
	 * @param memberId
	 * @return
	 */
	ShopMember findone(Integer memberId);

	/**
	 * 查询所有会员
	 * 
	 * @return
	 */
	List<ShopMember> selectShopMember();
	
	/**
	 * 登陆验证（用户名+密码）
	 */
	ShopMember checkShopMember(Map<String,String> map);
}
