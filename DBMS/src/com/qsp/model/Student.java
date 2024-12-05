package com.qsp.model;

public class Student {
	int id;
	String name;
	long mobno;
	String email;
	public Student(int id, String name, long mobno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student Id: " + id + ", Name : " + name + ", Mobno : " + mobno + ", Email : " + email;
	}
	

}