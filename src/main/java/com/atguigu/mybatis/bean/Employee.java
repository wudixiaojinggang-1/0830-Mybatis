package com.atguigu.mybatis.bean;

public class Employee {
	
	private Integer code;
	private String name;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + "]";
	}
	
	
	
	
	

}
