package com.company.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunCoach implements Coach {

	private FortuneService fortuneService;
	
	//Constructor
	@Autowired
	public RunCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
