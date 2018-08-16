package com.company.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {

		//Read 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Retrieve
		Coach myCoach = context.getBean("runCoach", Coach.class);
		
		//Call
		System.out.println(myCoach.getWorkOut());
		System.out.println(myCoach.getDailyFortune());
		
		//Close
		context.close();
		
	}

}
