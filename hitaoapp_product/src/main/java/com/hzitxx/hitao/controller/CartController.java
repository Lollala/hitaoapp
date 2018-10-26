package com.hzitxx.hitao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.entity.ShopGoodsCart;
import com.hzitxx.hitao.mapper.ShopGoodsMapper;
import com.hzitxx.hitao.service.CartService;
import com.hzitxx.hitao.service.ShopGoodsServices;
import com.hzitxx.hitao.utils.ServerResponse;

@RestController
@RequestMapping("/cart")
public class CartController {
   @Autowired
   private CartService service;
   @Autowired
   private ShopGoodsMapper mapper;
   
   @GetMapping("/cartList")
   public ServerResponse<List<ShopGoodsCart>> sel(Integer memberId){
	   return service.cartList(memberId);
   }
   
   @GetMapping("/delete")
   public ServerResponse<String> del(String goodsIds,int memberId){
	   String[] goods = goodsIds.split(",");
	   Long[] longs = new Long[goods.length];
	   Long aLong = 1L;
	   for (int i = 0; i < goods.length; i++) {
	       longs[i]=Long.parseLong(goods[i]);
	   }
	   //Long goodsid = Long.parseLong(goodsIds);
	   return service.deleteCart(memberId, longs);
   }
   
   @PostMapping("/add")
   public ServerResponse<Long> add(int memberId,int goodsId,int number){
	    ShopGoods shopGoods = mapper.findone(goodsId);
	    ShopGoodsCart shopGoodsCart = new ShopGoodsCart();
	    shopGoodsCart.setGoodsId(goodsId);
	    shopGoodsCart.setGoodsJingle(shopGoods.getGoodsJingle());
	    shopGoodsCart.setGoodsName(shopGoods.getGoodsName());
	    shopGoodsCart.setGoodsPrice(shopGoods.getGoodsPrice());
	    shopGoodsCart.setMainImage(shopGoods.getMainImage());
	    shopGoodsCart.setNumber(number);
	    shopGoodsCart.setTotalFee(null);
	    ServerResponse<Long> aResponse =service.addCart(memberId, shopGoodsCart);
	    return ServerResponse.createBySuccess("添加成功",aResponse.getData());
   }
   @PostMapping("/update")
   public ServerResponse<String> update(int memberId,int goodsId,int number){
	   ShopGoods shopGoods = mapper.findone(goodsId);
	    ShopGoodsCart shopGoodsCart = new ShopGoodsCart();
	    shopGoodsCart.setGoodsId(goodsId);
	    shopGoodsCart.setGoodsJingle(shopGoods.getGoodsJingle());
	    shopGoodsCart.setGoodsName(shopGoods.getGoodsName());
	    shopGoodsCart.setGoodsPrice(shopGoods.getGoodsPrice());
	    shopGoodsCart.setMainImage(shopGoods.getMainImage());
	    shopGoodsCart.setNumber(number);
	    shopGoodsCart.setTotalFee(null);
	    return service.update(memberId, shopGoodsCart);
   }
}
