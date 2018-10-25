package com.hzitxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * 启动类:
 * @author Lenovo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy //启用网关
public class Gateway8099 {
 public static void main(String[] args) {
	SpringApplication.run(Gateway8099.class, args);
}
}
