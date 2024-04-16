package com.springcore;

public class Student {
	private int rno;
	private String name;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
	return "Studend [studentId=" + rno + ", studentName=" + name 
	+ "]";
}

}
