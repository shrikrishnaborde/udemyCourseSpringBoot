package com.luv2code.springdemo;

public class ChessCoach implements Coach {

	private FortuneService fortuneService;
	
	public ChessCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice blindfold chess";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
