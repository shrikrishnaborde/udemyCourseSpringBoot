package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
	}
	
	@PostConstruct
	public void doMyStartupstuff() {
		System.out.println("Intializing Database");
	}
	
	@PreDestroy
	public void doCloseUpStuff() {
		System.out.println("Closing Database");
	}
	
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "practice backhand";

	}
}
