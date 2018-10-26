package com.hzitxx.hitao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.dao.CartDao;
import com.hzitxx.hitao.entity.ShopGoodsCart;
import com.hzitxx.hitao.service.CartService;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDao dao;

	@Override
	public ServerResponse<Long> addCart(int memberId, ShopGoodsCart shopGoodsCart) {
		boolean a = dao.addCart(memberId, shopGoodsCart);
		Long data= dao.cartCount(memberId);
		if (a) {
			//添加购物车成功
			return ServerResponse.createBySuccess("添加购物车成功",data);
		}
		return ServerResponse.createByErrorMessage("添加失败");//添加失败
	}

	@Override
	public ServerResponse<String> deleteCart(int memberId, Long[] goodsIds) {
		boolean a = dao.deleteCart(memberId, goodsIds);
		if (a) {
			//删除购物车成功
			return ServerResponse.createBySuccessMessage("删除购物车成功");
		}
		return ServerResponse.createByErrorMessage("删除购物车失败");
	}

	@Override
	public ServerResponse<List<ShopGoodsCart>> cartList(int memberId) {
		List<ShopGoodsCart> list = dao.cartList(memberId);
		if (list!=null) {
			return ServerResponse.createBySuccess("查询购物车成功", list);
		}
		return ServerResponse.createByErrorMessage("查询购物车失败");
	}

	@Override
	public ServerResponse<String> update(int memberId, ShopGoodsCart shopGoodsCart) {
		boolean a = dao.update(memberId, shopGoodsCart);
		if (a) {
			//删除购物车成功
			return ServerResponse.createBySuccessMessage("更新购物车成功");
		}
		return ServerResponse.createByErrorMessage("更新购物车失败");
	}

	@Override
	public ServerResponse<String> cartCount(int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

}
