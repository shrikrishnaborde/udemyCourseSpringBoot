package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach theAlphaCoach = context.getBean("tennisCoach",Coach.class);
		
		/*
		 * System.out.println(theAlphaCoach.getFortune());
		 * System.out.println(theCoach.getFortune());
		 */
		
		System.out.println((theAlphaCoach == theCoach));
		
		context.close();
	}

}
