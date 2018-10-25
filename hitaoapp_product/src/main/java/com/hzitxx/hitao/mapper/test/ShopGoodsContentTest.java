package com.hzitxx.hitao.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.Product8096;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.mapper.ShopGoodsContentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Product8096.class)
public class ShopGoodsContentTest {
	@Autowired
	private ShopGoodsContentMapper mapper;
   @Test
   public void test1(){
	  List<ShopGoodsContent> list =  mapper.searchGoodsContent(null);
	  for (ShopGoodsContent shopGoodsContent : list) {
		System.out.println(shopGoodsContent);
	}
	   //System.out.println(mapper);
   }
}
