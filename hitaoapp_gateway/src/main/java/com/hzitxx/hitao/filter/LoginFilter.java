package com.hzitxx.hitao.filter;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.interfaces.Claim;
import com.hzitxx.hitao.utils.JwtTokenUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Configuration //让ioc容器管理这个类
public class LoginFilter extends ZuulFilter{
    /**
     * 是否进行过滤
     */
	@Override
	public boolean shouldFilter() {
		RequestContext context=RequestContext.getCurrentContext();//获取当前请求对象的上下文对象
		HttpServletRequest req=context.getRequest();
		String uri=req.getRequestURI();//获取当前请求路径
		if(uri.contains("/login")) {
			return false;//放行登陆请求
		}
		return true;//拦截其他请求
	}

	@Override
	public Object run() {
		System.out.println("网关过滤...");
		RequestContext context=RequestContext.getCurrentContext();//获取当前访问对象的上下文对象
		HttpServletRequest req=context.getRequest();
		String token=req.getHeader("token"); //获取token信息
		//System.out.println(token);
		context.getResponse().setContentType("application/json;charset=utf-8");//设置返回数据的格式
		//判断token是否为空
		if(StringUtils.isEmpty(token)) {
			context.setSendZuulResponse(false);//不进行路由
			Map<String,Object> map=new HashMap<>();
			map.put("code", 1);
			map.put("msg", "token不能为空");
			map.put("success",false);
			map.put("data", null);
			context.setResponseBody(JSON.toJSONString(map));//设置被拦截后，返回的数据
		}
		//token若不为空,则应去解析,验证合法性
		try {
			Map<String,Claim> map=JwtTokenUtil.parseToken(token);
			//System.out.println(map);
			if(StringUtils.isEmpty(map)) {
				//解析失败,token不正确或者已经失效了
				context.setSendZuulResponse(false);
				Map<String,Object> map2=new HashMap<>();
				map2.put("code", 1);
				map2.put("msg", "登陆失效！请先登陆！");
				map2.put("success",false);
				map2.put("data", null);
				context.setResponseBody(JSON.toJSONString(map2));
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String filterType() {
		return FilterType.PRE; //在进行路由之前进行过滤操作
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
