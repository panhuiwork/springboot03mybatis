package com.geral.springboot03.domain.dao;

import org.apache.ibatis.annotations.Mapper;

import com.geral.springboot03.domain.entity.Userinfo2;
@Mapper
public interface UserInfoMapper {
	Userinfo2 findUserinfoById(Long id);
	boolean addUserinfo(Userinfo2 userinfo);
}
