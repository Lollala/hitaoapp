package com.hzitxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 图片服务器
 * @author WE1
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Images8097 {
	public static void main(String[] args) {
		SpringApplication.run(Images8097.class, args);
	}
}
