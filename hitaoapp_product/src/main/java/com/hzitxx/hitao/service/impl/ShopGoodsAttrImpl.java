package com.hzitxx.hitao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.mapper.ShopGoodsAttrMapper;
import com.hzitxx.hitao.service.ShopGoodsAttrService;
import com.hzitxx.hitao.utils.PageUtil;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopGoodsAttrImpl implements ShopGoodsAttrService {
	@Autowired
	private ShopGoodsAttrMapper mapper;

	@Override
	public ServerResponse<Integer> add(ShopGoodsAttr shopGoodsAttr) {
		int result = mapper.addShopGoodsAttr(shopGoodsAttr);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败");
		}
		return ServerResponse.createBySuccessMessage("添加成功");
	}

	@Override
	public ServerResponse<Integer> delete(Integer goodsId) {
		int result = mapper.deleteShopGoodsAttr(goodsId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败");
		}
		return ServerResponse.createBySuccessMessage("删除成功");
	}

	@Override
	public ServerResponse<Integer> update(ShopGoodsAttr shopGoodsAttr) {
		int result = mapper.updateShopGoodsAttr(shopGoodsAttr);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("更新失败");
		}
		return ServerResponse.createBySuccessMessage("更新成功");
	}

	@Override
	public ServerResponse<PageUtil<List<ShopGoodsAttr>>> select(int page, int limit, Map<String, Object> map) {
		PageHelper.offsetPage((page-1)*limit, limit);
		List<ShopGoodsAttr> list = mapper.selectShopGoodsAttr();
		//解析这些数据
		PageInfo<ShopGoodsAttr> pageInfo = new PageInfo<>(list);
		PageUtil<List<ShopGoodsAttr>> pageUtil = new PageUtil<>();
		pageUtil.setCode(0);
		pageUtil.setCount(pageInfo.getTotal());
		pageUtil.setData(pageInfo.getList());
		pageUtil.setMsg("商品表数据");
		return ServerResponse.createBySuccess("商品表数据", pageUtil);
	}

	@Override
	public ServerResponse<ShopGoodsAttr> findone(Integer goodsId) {
		ShopGoodsAttr shopGoodsAttr = mapper.findone(goodsId);
		if (shopGoodsAttr == null) {
			return ServerResponse.createByErrorMessage("查询失败");
		}
		// 查询成功,返回这条数据信息
		return ServerResponse.createBySuccess("查询成功", shopGoodsAttr);
	}

}
