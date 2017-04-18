package com.dstar.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Qualifier("happyFortune")
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("Default Called");
	}
	
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("setter Called");
		this.fortuneService = fortuneService;
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "TennisCoachWorkOut";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFotune();
	}

	@Override
	public String printTeam() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String printEmail() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@PostConstruct
	public void printStartBean() {
System.out.println("Started");		
	}

	@PreDestroy 
	public void printEndBean() {
		System.out.println("End");		
		
	}

}
