package com.geral.springboot03.contral;


import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.geral.springboot03.domain.dao.UserInfoMapper;
import com.geral.springboot03.domain.entity.Userinfo2;


@RestController
public class Contral {

	//注解版本
//	@Autowired
//	private Userinfo2Mapper userinfo2Mapper;
	
	
	Logger logger=LoggerFactory.getLogger(Contral.class);
	@GetMapping("/log")
	public String getLog() 
	{
		//日志级别 现在就是级别等级显示
//		可以调整输出的日志级别。就显示相应的
		logger.trace("这是trace日志");
		logger.debug("这是debug日志");
		//springboot默认使用的是info级别，
		//指定级别在yml设置
//		logging:
//		  level:
//			    com: debug
		logger.info("这是info日志");
		logger.warn("这是warn日志");
		logger.error("这是error日志");
		return "日志的方法！";
	}
	
	//配置版本
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	
	
	@GetMapping("/user/{id}")
	public Object getin(@PathVariable Long id) 
	{
		logger.info("查询玩家数据。");
//		return userinfo2Mapper.findUserinfoById(id);
		return userInfoMapper.findUserinfoById(id);
	}
	
	@GetMapping("/user")
	public Object adduser(Userinfo2 userinfo2) 
	{
//		userinfo2Mapper.addUserinfo(userinfo2);
		userInfoMapper.addUserinfo(userinfo2);
		return userinfo2;
	}
	
	
	
}
