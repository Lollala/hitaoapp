package com.hzitxx.hitao.controller;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.hzitxx.hitao.utils.ServerResponse;
/**
 * 
 * @author WE1
 *
 */
@RestController
public class UploadAvatarController {
	/**
	 * 获取oss配置信息
	 */
	@Value("${oss.endpoint}")
	private String endPoint;
	
	@Value("${oss.accessKeyId}")
	private String accessKeyId;
	
	@Value("${oss.accessKeySecret}")
	private String accessKeySecret;
	
	/**
	 * 上传用户头像
	 */
	@PostMapping("/uploadAvatar")
	public ServerResponse<String> uploadAvatar(@RequestParam("avatar")MultipartFile avatar){
			if(avatar==null) {
				return ServerResponse.createByErrorMessage("头像上传失败！");
			}
			String fileName=null;
			OSSClient ossClient=new OSSClient("http://"+endPoint,accessKeyId,accessKeySecret);
			fileName=UUID.randomUUID().toString()+avatar.getOriginalFilename();
			try {
				PutObjectResult result=ossClient.putObject("cjw-hitao","MemberAvatarImages/"+fileName, avatar.getInputStream());
				String url="https://bucketName.endPoint/MemberAvatarImages/fileName?x-oss-process=style/suofang100";
				url=url.replace("bucketName", "cjw-hitao");
				url=url.replace("endPoint",endPoint);
				url=url.replace("fileName", fileName);
				ossClient.shutdown();
				return ServerResponse.createBySuccess("头像上传成功!", url);
			} catch (IOException e) {
				return ServerResponse.createByErrorMessage("头像上传失败！");
			}
	}
}
