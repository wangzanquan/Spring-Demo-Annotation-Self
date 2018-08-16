package com.company.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunCoach implements Coach {

	private FortuneService fortuneService;
	/*
	 
	//Constructor Injection
	@Autowired
	public RunCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	//define a default constructor
	public RunCoach() {
		System.out.println("RunCoach: inside default constructor");
	}
	
	//define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("RunCoach: inside setFortuneService");

		this.fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getWorkOut() {
		return "Run 5K";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
