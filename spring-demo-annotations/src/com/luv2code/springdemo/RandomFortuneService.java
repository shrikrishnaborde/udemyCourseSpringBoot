package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] fortuneList = new String[3];
	
	public RandomFortuneService() {
		
	}
	
	@PostConstruct
	public void doSomeStartupStuff() {
		try {
			File myObjFile = new File("fortunes.txt");
			int index = 0;
			Scanner myReadScanner = new Scanner(myObjFile);
			while (myReadScanner.hasNextLine()) {
				String dataString = myReadScanner.nextLine();
				System.out.println(dataString);
				fortuneList[index++]=dataString;
			}
			myReadScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		Random random = new Random(); 
		int index = random.nextInt(fortuneList.length);
		return fortuneList[index];
	}

}
