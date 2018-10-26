package com.hzitxx.hitao.filter;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HyperLogLogOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.utils.ServerResponse;

@RestController
public class HyperLogLogController {
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, String> redisTemplate;
	private HyperLogLogOperations<String, String> hyperLogLogOperations = redisTemplate.opsForHyperLogLog();//获取操作基数对象
	
	/**
	 * 获取浏览IP总数 
	 * @return
	 */
	@GetMapping("/getVisitorNum")
	public ServerResponse<Long> getVisitorNum() {
		return ServerResponse.createBySuccess("访问ip总数", hyperLogLogOperations.size("visitorIp"));
	}
	
	/**
	 * 获取注册IP地址
	 * @return
	 */
	@GetMapping("/getRegisterNum")
	public ServerResponse<Long> getRegisterNum() {
		return ServerResponse.createBySuccess("注册ip总数", hyperLogLogOperations.size("registerIp"));
	}
}
