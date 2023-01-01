package com.masai.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.masai.app.entity.College;
import com.masai.app.entity.Student;

@Configuration
@ComponentScan(basePackages="com.masai")
public class Config {
	@Bean("s1")
	public Student newStudent() {
		Student stu=new Student(1,"100",100);
		return stu;
	}
	@Bean("c1")
	public College newCollege() {
		College clg=new College();
		clg.setCollege_address("Vellore");
		clg.setCollege_name("Vit");
		return clg;
	}
	

}
