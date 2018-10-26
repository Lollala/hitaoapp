package com.hzitxx.hitao.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.entity.ShopGoodsCart;
import com.hzitxx.hitao.mapper.ShopGoodsMapper;

/**
 * 购物车实现类
 * 
 * @author Lenovo
 *
 */
@Component
public class CarDaoImpl implements CartDao {
	@Autowired
	private  RedisTemplate redisTemplate;
	@Autowired
	private ShopGoodsMapper mapper;

	@Override
	public boolean addCart(int memberId, ShopGoodsCart shopGoodsCart) {
		HashOperations<String, String, ShopGoodsCart> hashOperations = redisTemplate.opsForHash();
		String carId="member"+memberId;
		String goodsId="goods"+shopGoodsCart.getGoodsId();
		//会员名为主键,商品id为子健,商品详细信息为子值
		hashOperations.put(carId, goodsId, shopGoodsCart);
		if (hashOperations.get(carId, goodsId)!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteCart(int memberId, Long[] goodsIds) {
		HashOperations<String, String, ShopGoodsCart> hashOperations = redisTemplate.opsForHash();
		String carId="member"+memberId;//主键
		Long b = 100L;
		Long a = 1L;
		for (Long long1 : goodsIds) {
			System.out.println(long1);
			b=hashOperations.delete(carId,"goods"+long1);//主键,子健
		}
		if (b.equals(a)) {
			return true;
		}
		return false;
	}

	@Override
	public List<ShopGoodsCart> cartList(int memberId) {
		HashOperations<String, String, ShopGoodsCart> hashOperations = redisTemplate.opsForHash();
		String carId="member"+memberId;//主键
		Set<String> set = hashOperations.keys(carId);//拿到子健
		List<ShopGoodsCart> list = new ArrayList<>();
		for (String string : set) {
			//遍历循环子健,拿到子值
			ShopGoodsCart shopGoodsCart = hashOperations.get(carId,string);
			list.add(shopGoodsCart);
		}
		return list;
	}

	@Override
	public boolean update(int memberId, ShopGoodsCart shopGoodsCart) {
		HashOperations<String, String, ShopGoodsCart> hashOperations = redisTemplate.opsForHash();
		String carId="member"+memberId;//主键
		String goodsId="goods"+shopGoodsCart.getGoodsId();
		hashOperations.put(carId, goodsId, shopGoodsCart);
		return true;
	}

	@Override
	public long cartCount(int memberId) {
		HashOperations<String, String, ShopGoodsCart> hashOperations = redisTemplate.opsForHash();
		String carId="member"+memberId;//主键
		long a = hashOperations.keys(carId).size();
		//System.out.println(a);
		return a;
	}

}
