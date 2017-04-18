package com.dstar.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigSwinMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
	
	
		Coach theCoach = context.getBean("swinCoach",Coach.class);
	
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
	}

}
