package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student s1=context.getBean("f1",Student.class);
		//Student s1=context.getBean("getStudent",Student.class);
		Student s1=context.getBean("s3",Student.class);
		System.out.println(s1);
		s1.study();
		//context.close();
	}
	

}
