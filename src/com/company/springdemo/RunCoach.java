package com.company.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RunCoach implements Coach {

	@Override
	public String getWorkOut() {
		return "Run 5K";
	}

}
