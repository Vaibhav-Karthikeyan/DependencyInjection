package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.app.config.Config;
import com.masai.app.entity.College;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
		College clg=ctx.getBean(College.class);
		clg.showDetails();
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
