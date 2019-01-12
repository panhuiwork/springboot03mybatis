package com.geral.springboot03.domain.dao;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.geral.springboot03.domain.entity.Userinfo2;
//@Mapper 开发配置文档版就不要了
//@CacheNamespace
public interface Userinfo2Mapper {

	@Select("select * from userinfo2 where id=#{id}")
	Userinfo2 findUserinfoById(Long id);
	
	@Options(useGeneratedKeys=true,keyProperty="id")
	@Insert("insert into userinfo2 values (null,#{username},#{userpass},#{uid})")
	boolean addUserinfo(Userinfo2 userinfo);
}
