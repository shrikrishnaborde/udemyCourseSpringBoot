package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneservice implements FortuneService {

	@Override
	public String getFortune() {
		return "you have a lucky day!";
	}

}
