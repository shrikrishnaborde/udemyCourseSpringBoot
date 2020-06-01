package com.luv2code.springdemo;

public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you will have a bad day";
	}

}
