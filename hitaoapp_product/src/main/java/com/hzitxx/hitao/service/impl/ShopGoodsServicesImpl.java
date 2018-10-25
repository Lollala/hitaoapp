package com.hzitxx.hitao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.MiniGoods;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.mapper.ShopGoodsMapper;
import com.hzitxx.hitao.service.ShopGoodsServices;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopGoodsServicesImpl implements ShopGoodsServices{
     @Autowired
     private ShopGoodsMapper mapper;
	@Override
	public ServerResponse<Integer> add(ShopGoods shopGoods) {
		int result = mapper.addShopGoods(shopGoods);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败");
		}
		return ServerResponse.createBySuccessMessage("添加成功");
	}
	

	@Override
	public ServerResponse<Integer> delete(Integer goodsId) {
		int result = mapper.deleteShopGoods(goodsId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败");
		}
		return ServerResponse.createBySuccessMessage("删除成功");
	}

	@Override
	public ServerResponse<Integer> update(ShopGoods shopGoods) {
		int result = mapper.updateShopGoods(shopGoods);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("更新失败");
		}
		return ServerResponse.createBySuccessMessage("更新成功");
	}

	@Override
	public ServerResponse<PageUtil<List<ShopGoods>>> select(int page, int limit, Map<String, Object> map) {
		PageHelper.offsetPage((page-1)*limit, limit);
		List<ShopGoods> list = mapper.selectShopGoods(map);
		//解析这些数据
		PageInfo<ShopGoods> pageInfo = new PageInfo<>(list);
		PageUtil<List<ShopGoods>> pageUtil = new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("商品表数据");
		return ServerResponse.createBySuccess("商品表数据", pageUtil);
	}

	@Override
	public ServerResponse<ShopGoods> findone(Integer goodsId) {
		ShopGoods shopGoods = mapper.findone(goodsId);
		if (shopGoods == null) {
			return ServerResponse.createByErrorMessage("查询失败");
		}
		// 查询成功,返回这条数据信息
		return ServerResponse.createBySuccess("查询成功", shopGoods);
	}


	@Override
	public ServerResponse<List<MiniGoods>> findGoods() {
		List<MiniGoods> list = mapper.findGoods();
		if (list == null) {
			return ServerResponse.createByErrorMessage("查询失败");
		}
		// 查询成功,返回这条数据信息
		return ServerResponse.createBySuccess("查询成功", list);
	}


	@Override
	public ServerResponse<Integer> count() {
		int count = mapper.count();
		System.out.println(count);
		if (count <=0) {
			return ServerResponse.createByErrorMessage("查询总数失败");
		}
		return ServerResponse.createBySuccess("商品总数", count);
	}


	@Override
	public ServerResponse<String> check(int goodsId, int number) {
		ShopGoods shopGoods = mapper.findone(goodsId);
		if (number<=shopGoods.getGoodsStorage()) {
			//存货够
			return ServerResponse.createBySuccessMessage("存货足够");
		}
		return ServerResponse.createByErrorMessage("存货不够");
	}

}
