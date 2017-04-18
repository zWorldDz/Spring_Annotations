package com.dstar.springannotations;

import org.springframework.stereotype.Component;

@Component
public class DefaultCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "DefaultCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public void printStartBean() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printEndBean() {
		// TODO Auto-generated method stub
		
	}

}
