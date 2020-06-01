package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(SportConfig.class);
		
		ChessCoach theCoach = context.getBean("chessCoach",ChessCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		/*
		 * System.out.println(theCoach.getEmail());
		 * System.out.println(theCoach.getTeam());
		 */
		context.close();
	}
}
