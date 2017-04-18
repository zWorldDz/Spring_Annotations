package com.dstar.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach subCoach = context.getBean("tennisCoach",Coach.class);
	
		boolean result = (theCoach==subCoach);
		
		System.out.println(result);
		System.out.println("theCoach"+theCoach);
		System.out.println("subCoach"+subCoach);
		
		theCoach.printStartBean();
		theCoach.printEndBean();
	}

}
