package com.hzitxx.hitao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.mapper.ShopAddressMapper;
import com.hzitxx.hitao.service.ShopAddressService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
/**
 * 买家地址信息表
 * @author WE1
 *
 */
@Service
public class ShopAddressServiceImpl implements ShopAddressService {
	@Autowired
	private ShopAddressMapper shopAddressMapper;
	
	@Override
	public ServerResponse<LayuiEntity<ShopAddress>> findShopAddress(Integer page, Integer limit,
			Map<String, Object> map) {
		PageHelper.startPage(page, limit);//Mybatis分页工具分页
		List<ShopAddress> addressList=shopAddressMapper.findShopAddress(map);
		PageInfo<ShopAddress> pageInfo=new PageInfo<>(addressList);//解析分页后的数据
		LayuiEntity<ShopAddress> layuiEntity=new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess(layuiEntity);
	}

	@Override
	public ServerResponse<?> addShopAddress(ShopAddress shopAddress) {
		int result=shopAddressMapper.addShopAddress(shopAddress);
		if(result!=1) {
			return ServerResponse.createByErrorMessage("添加失败！");
		}
		return ServerResponse.createBySuccessMessage("添加成功！");
	}

	@Override
	public ServerResponse<?> updateShopAddress(ShopAddress shopAddress) {
		int result=shopAddressMapper.updateShopAddress(shopAddress);
		if(result!=1) {
			return ServerResponse.createByErrorMessage("修改失败！");
		}
		return ServerResponse.createBySuccessMessage("修改成功！");
	}

	@Override
	public ServerResponse<?> deleteShopAddress(Integer id) {
		int result=shopAddressMapper.deleteShopAddress(id);
		if(result!=1) {
			return ServerResponse.createByErrorMessage("删除失败！");
		}
		return ServerResponse.createBySuccessMessage("删除成功！");
	}

}
