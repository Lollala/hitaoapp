package com.hzitxx.hitao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopArea;
import com.hzitxx.hitao.mapper.ShopAreaMapper;
import com.hzitxx.hitao.service.ShopAreaService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopAreaServiceImpl implements ShopAreaService {

	@Autowired
	private ShopAreaMapper shopAreaMapperr;
	@Override
	public ServerResponse<LayuiEntity<ShopArea>> findShopArea(Integer page, Integer limit, Map<String, Object> map) {
		PageHelper.startPage(page, limit);//分页工具分页
		List<ShopArea> ShopAreaList=shopAreaMapperr.findShopArea(map);//获取数据
		PageInfo<ShopArea> pageInfo=new PageInfo<>(ShopAreaList);//解析分页处理后的数据
		LayuiEntity<ShopArea> layuiEntity=new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess(layuiEntity);
	}

	@Override
	public ServerResponse<?> addShopArea(ShopArea shoparea) {
		int result=this.shopAreaMapperr.addShopArea(shoparea);
		if(result!=1) {
			return ServerResponse.createBySuccessMessage("添加失败！");
		}
		return ServerResponse.createByErrorMessage("添加成功！");
	}

	@Override
	public ServerResponse<?> updateShopArea(ShopArea shoparea) {
		int result=this.shopAreaMapperr.updateShopArea(shoparea);
		if(result!=1) {
			return ServerResponse.createByErrorMessage("添加失败！");
		}
		return ServerResponse.createBySuccessMessage("添加成功");
	}

	@Override
	public ServerResponse<?> deleteShopArea(Integer areaId) {
		int result=this.shopAreaMapperr.deletShopArea(areaId);
		if(result!=1) {
			return ServerResponse.createByErrorMessage("添加失败！");
		}
		return ServerResponse.createBySuccessMessage("添加成功 ！");
	}

	@Override
	public ServerResponse<List<ShopArea>> getShopArea(Map<String, Object> map) {
		return ServerResponse.createBySuccess("查询成功", shopAreaMapperr.findShopArea(map));
	}

	@Override
	public ServerResponse<List<ShopArea>> littleFindShopArea(Map<String, Object> map) {
		return ServerResponse.createBySuccess("查询成功", shopAreaMapperr.littleFindShopArea(map));
	}

}
