package com.dstar.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		
		//read spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bring
		Coach theCoach = context.getBean("showProperties", Coach.class);
		Coach defaultCoach = context.getBean("defaultCoach", Coach.class);
		//Call Method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(defaultCoach.getDailyWorkout());
		
		theCoach.printEmail();
		theCoach.printTeam();
		//Close
		context.close();
	}

}
