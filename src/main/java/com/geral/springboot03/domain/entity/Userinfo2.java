package com.geral.springboot03.domain.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Userinfo2 implements Serializable{
	private static final long serialVersionUID = 1L;
	private  Long id;
	private String username;
	private String userpass;
	private String uid;
}
