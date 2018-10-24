package com.hzitxx.hitao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.mapper.ShopFavoritesMapper;
import com.hzitxx.hitao.service.ShopFavoritesService;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopFavoritesServicesImpl implements ShopFavoritesService {
	@Autowired
	private ShopFavoritesMapper mapper;

	/**
	 * 添加
	 */
	@Override
	public ServerResponse<Integer> addShopFavorites(ShopFavorites shopFavorites) {
		int result = mapper.addShopFavorites(shopFavorites);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败");
		}
		return ServerResponse.createBySuccessMessage("添加成功");
	}

	/**
	 * 删除
	 */
	@Override
	public ServerResponse<Integer> deleteFavorites(Integer favId) {
		int result = mapper.deleteShopFavorites(favId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败");
		}
		return ServerResponse.createBySuccessMessage("删除成功");
	}

	/**
	 * 修改
	 */
	@Override
	public ServerResponse<Integer> updateFavorites(ShopFavorites shopFavorites) {
		int result = mapper.updateShopFavorites(shopFavorites);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("更新失败");
		}
		return ServerResponse.createBySuccessMessage("更新成功");
	}

	/**
	 * 查询一条数据
	 */
	@Override
	public ServerResponse<ShopFavorites> findone(Integer favId) {
		ShopFavorites shopFavorites = mapper.findone(favId);
		if (shopFavorites == null) {
			return ServerResponse.createByErrorMessage("查询失败");
		}
		return ServerResponse.createBySuccess("查询成功", shopFavorites);
	}

	/**
	 * 分页查询所有
	 */
	@Override
	public ServerResponse<PageUtil<List<ShopFavorites>>> selectShopFavorites(int page, int limit,
			Map<String, Object> map) {
		PageHelper.offsetPage((page - 1) * limit, limit);
		List<ShopFavorites> list = mapper.selectShopFavorites(map);
		// 解析数据
		PageInfo<ShopFavorites> pageInfo = new PageInfo<>(list);
		PageUtil<List<ShopFavorites>> pageUtil = new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("买家收藏表数据");
		return ServerResponse.createBySuccess("买家收藏表数据", pageUtil);
	}
	/**
	 * 获得用户收藏总数
	 */
	@Override
	public Integer getTotalByMemberId(Integer memberId) {
		return mapper.getTotalByMemberId(memberId);
	}

}
