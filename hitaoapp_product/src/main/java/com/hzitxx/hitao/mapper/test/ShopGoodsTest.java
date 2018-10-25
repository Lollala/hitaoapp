package com.hzitxx.hitao.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.Product8096;
import com.hzitxx.hitao.entity.MiniGoods;
import com.hzitxx.hitao.mapper.ShopGoodsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Product8096.class)
public class ShopGoodsTest {
	@Autowired
	private ShopGoodsMapper mapper;
	
	@Test
	public void test1(){
		List<MiniGoods> list = mapper.findGoods();
		for (MiniGoods miniGoods : list) {
			System.out.println(miniGoods);
		}
	}
	@Test
	public void test2(){
		int count = mapper.count();
		System.out.println(count);
	}

}
