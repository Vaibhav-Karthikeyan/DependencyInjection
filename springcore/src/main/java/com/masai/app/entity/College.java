package com.masai.app.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	
	private String college_name;
	
	@Autowired
	private Student student;
	private String college_address;
	
	public College() {
		
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getCollege_address() {
		return college_address;
	}

	public void setCollege_address(String college_address) {
		this.college_address = college_address;
	}
	
	public void showDetails() {
		System.out.println("College Name is:"+college_name);
		System.out.println("College Address is:"+college_address);
		System.out.println("College Student is:"+student);
	}
}
