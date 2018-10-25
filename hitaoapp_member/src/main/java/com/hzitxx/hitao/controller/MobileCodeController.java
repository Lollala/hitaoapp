package com.hzitxx.hitao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	/**
	 * 发送验证码
	 * @param memberMobile
	 * @param session
	 * @return
	 */
	@GetMapping("/sendIdentifyingCode")
	public ServerResponse<String> sendIdentifyingCode(@RequestParam("memberMobile") String memberMobile,HttpSession session) {
		int valueCode = 10000 + (int) (Math.random() * 10000);// 生成随机验证码
		try {
			SendSmsResponse resp = MsgUtil.sendMsg(memberMobile, valueCode);// 发送验证码
			if ("OK".equalsIgnoreCase(resp.getCode())) {// 发送成功
				session.setAttribute(""+memberMobile, valueCode);//将验证码存入session中
				//session.setAttribute("startTime", System.currentTimeMillis());//记录发送验证码的时间
				session.setMaxInactiveInterval(60*10);//设置session的超时时间
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
	public ServerResponse<String> checkIdentifyingCode(@RequestParam("memberMobile")String memberMobile,@RequestParam("code")Integer code,HttpSession session){
		Object obj=session.getAttribute(""+memberMobile);//获取之前设置的验证码值
		if(obj==null) {
			return ServerResponse.createByErrorMessage("短信验证验证码失效！");
		}else if(obj.equals(code)) {
			session.invalidate();//验证成功使session失效
			return ServerResponse.createBySuccessMessage("短信验证验证通过!");
		}
		return ServerResponse.createByErrorMessage("短信验证验证失败！");
	}
}
