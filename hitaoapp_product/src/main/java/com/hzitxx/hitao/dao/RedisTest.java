package com.hzitxx.hitao.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.Product8096;
import com.hzitxx.hitao.entity.ShopGoodsCart;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Product8096.class)
public class RedisTest {

	@Autowired
	private CartDao dao;
	
	
	@Test
	public void test(){
		ShopGoodsCart shopGoodsCart = new ShopGoodsCart();
	       shopGoodsCart.setGoodsId(20);
	       shopGoodsCart.setGoodsJingle(null);
	       shopGoodsCart.setGoodsName(null);
	       shopGoodsCart.setGoodsPrice(null);
	       shopGoodsCart.setMainImage(null);
	       shopGoodsCart.setNumber(1);
	       shopGoodsCart.setTotalFee(null); 
		   boolean a = dao.addCart(11, shopGoodsCart);
		   System.out.println(a);
	}
	@Test
	public void test2(){
		List<ShopGoodsCart> list = dao.cartList(11);
	    System.out.println(list);
	}
	@Test
	public void test3(){
		dao.cartCount(11);
	}
	@Test
	public void test4(){
		Long long1=4L;
		Long[] goodsIds= new Long[]{long1};
		boolean a = dao.deleteCart(11,goodsIds);
		System.out.println(a);
	}
	@Test
	public void test5(){
		ShopGoodsCart shopGoodsCart = new ShopGoodsCart();
	       shopGoodsCart.setGoodsId(20);
	       shopGoodsCart.setGoodsJingle("我是一只高德伪2号");
	       shopGoodsCart.setGoodsName(null);
	       shopGoodsCart.setGoodsPrice(null);
	       shopGoodsCart.setMainImage(null);
	       shopGoodsCart.setNumber(1);
	       shopGoodsCart.setTotalFee(null); 
		boolean a= dao.update(11, shopGoodsCart);
		System.out.println(a);
	}
}
