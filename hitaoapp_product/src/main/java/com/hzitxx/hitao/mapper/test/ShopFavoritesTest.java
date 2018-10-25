package com.hzitxx.hitao.mapper.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.Product8096;
import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.mapper.ShopFavoritesMapper;
import com.hzitxx.hitao.utils.ServerResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Product8096.class)
public class ShopFavoritesTest {
  @Autowired
  private ShopFavoritesMapper mapper;
  
  @Test
  public void test1(){
	 ShopFavorites shopFavorites = mapper.findbyGoodsId(4);
	 System.out.println(shopFavorites);
  }
  @Test
  public void test2(){
	  Map<String, Object> map = new HashMap<>();
	  map.put("aa", 11);
	  map.put("list2", new ArrayList<>());
	  System.out.println(map);
	  System.out.println(new ArrayList<>());
	  System.out.println(ServerResponse.createBySuccess(map).getData());
  }
}
