package com.geral.springboot03.domain.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Dept implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long deptno;
	private String dname;
	private String db_source;
}
