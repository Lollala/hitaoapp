package com.hzitxx.hitao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.Member8095;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Member8095.class)
public class RedisTest {
	@Resource(name="redisTemplate")
	private RedisTemplate<String, Object> redisTemplate;
	
	@Test
	public void test() {
		ValueOperations<String, Object> valueOperations= redisTemplate.opsForValue();
		valueOperations.set("name", "jack");
		System.out.println(valueOperations.get("name"));
	}
}
