package com.hzitxx.hitao.mapper.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.Product8096;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.mapper.ShopFrontCategoryMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Product8096.class)
public class ShopFrontCategoryTest {
	@Autowired
	private ShopFrontCategoryMapper mapper;
	
	@Test
	public void test1(){
		List<ShopFrontCategory> list = mapper.searchShopFrontCategory(null);
	    for (ShopFrontCategory shopFrontCategory : list) {
			System.out.println(shopFrontCategory);
		}
	}
	
	@Test
	public void test2(){
		List<ShopFrontCategory> list = mapper.ByparentId(0);
		for (ShopFrontCategory shopFrontCategory : list) {
			System.out.println(shopFrontCategory);
		}
	}

}
