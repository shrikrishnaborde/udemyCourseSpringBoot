package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	 
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
		//return new SwimCoach(badFortuneService());
	}
	
	@Bean
	public Coach chessCoach() {
		return new ChessCoach(badFortuneService());
	}
	
	@Bean
	public FortuneService badFortuneService() {
		return new BadFortuneService();
	}
}
