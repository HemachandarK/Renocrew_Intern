package com.springcore.collections;

import java.util.List;

public class Emp {
	private String name;
	private List<Integer> phno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhno() {
		return phno;
	}
	public void setPhno(List<Integer> phno) {
		this.phno = phno;
	}
	public Emp(String name, List<Integer> phno) {
		super();
		this.name = name;
		this.phno = phno;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
