package com.hzitxx.hitao.controller;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.hzitxx.hitao.utils.MsgUtil;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 发送、检查手机验证码
 * 
 * @author WE1
 *
 */
@RestController
public class MobileCodeController {
	@Resource(name="redisTemplate")
	private RedisTemplate<String,String> redisTemplate;
	
	//private ValueOperations<String,String> valueOperation=redisTemplate.opsForValue();//获取到操作redis的对象
	
	/**
	 * 发送验证码
	 * @param memberMobile
	 * @param session
	 * @return
	 */
	@GetMapping("/sendIdentifyingCode")
	public ServerResponse<String> sendIdentifyingCode(@RequestParam("memberMobile") String memberMobile) {
		ValueOperations<String,String> valueOperation=redisTemplate.opsForValue();
		int valueCode = 10000 + (int) (Math.random() * 10000);// 生成随机验证码
		try {
			SendSmsResponse resp = MsgUtil.sendMsg(memberMobile, valueCode);// 发送验证码
			if ("OK".equalsIgnoreCase(resp.getCode())) {// 发送成功
				valueOperation.set(memberMobile, ""+valueCode, 5,TimeUnit.MINUTES);//往redis中存入验证码，键是手机号，值是验证码，设置5分钟为过期时间
				return ServerResponse.createBySuccessMessage("短信验证码发送成功!");
			}
		} catch (Exception e) {
			return ServerResponse.createByErrorMessage("短信验证码发送失败！");
		}
		return ServerResponse.createByErrorMessage("短信验证码发送失败！");
	}
	/**
	 * 检查验证码是否正确
	 * @param memberMobile
	 * @param code
	 * @param session
	 * @return
	 */
	@GetMapping("/checkIdentifyingCode")
	public ServerResponse<String> checkIdentifyingCode(@RequestParam("memberMobile")String memberMobile,@RequestParam("code")Integer code){
		ValueOperations<String,String> valueOperation=redisTemplate.opsForValue();
		String resp=valueOperation.get(memberMobile);//获取之前设置的验证码值
		if(StringUtils.isEmpty(resp)) {
			return ServerResponse.createByErrorMessage("短信验证验证码失效！");
		}else if(resp.equals(""+code)) {
			return ServerResponse.createBySuccessMessage("短信验证验证通过!");
		}
		return ServerResponse.createByErrorMessage("短信验证验证失败！");
	}
}
