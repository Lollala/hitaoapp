package com.hzitxx.hitao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.mapper.ShopMemberMapper;
import com.hzitxx.hitao.service.ShopMemberService;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopMemberServiceImpl implements ShopMemberService {
	@Autowired
	private ShopMemberMapper mapper;

	/**
	 * 添加
	 */
	@Override
	public ServerResponse<Integer> addShopMember(ShopMember shopMember) {
		int result = mapper.addShopMember(shopMember);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("注册失败!");
		}
		return ServerResponse.createBySuccessMessage("注册成功!");
	}

	/**
	 * 删除
	 */
	@Override
	public ServerResponse<Integer> deleteShopMember(Integer memberId) {
		int result = mapper.deleteShopMember(memberId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败");
		}
		return ServerResponse.createBySuccessMessage("删除成功");
	}

	/**
	 * 修改
	 */
	@Override
	public ServerResponse<Integer> updateShopMember(ShopMember shopMember) {
		int result = mapper.updateShopMember(shopMember);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("更新失败");
		}
		return ServerResponse.createBySuccessMessage("更新成功");
	}

	/**
	 * 分页查询所有数据
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopMember>>> selectShopMember(Integer page, Integer limit,
			Map<String, Object> map) {
		PageHelper.offsetPage((page - 1) * limit, limit); // 分页
		List<ShopMember> list = mapper.selectShopMember();
		PageInfo<ShopMember> pageInfo = new PageInfo<>(list); // 解析
		PageUtil<List<ShopMember>> pageUtil = new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("会员表数据");
		return ServerResponse.createBySuccess("会员表数据", pageUtil);
	}

	/**
	 * 查询一条数据
	 */
	@Override
	public ServerResponse<ShopMember> findone(Integer memberId) {
		ShopMember shopMember = mapper.findone(memberId);
		if (shopMember == null) {
			return ServerResponse.createByErrorMessage("查询失败");
		}
		// 查询成功,返回这条数据信息
		return ServerResponse.createBySuccess("查询成功", shopMember);
	}
	/**
	 * 登陆验证（用户名+密码）
	 */
	@Override
	public ShopMember checkShopMember(Map<String, String> map) {
		return mapper.checkShopMember(map);
	}

}
