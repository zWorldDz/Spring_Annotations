package com.dstar.springannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShowProperties implements Coach {

	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String printTeam()
	{
		System.out.println("TEAM: "+team);
		return email;
		
	}	
	public String printEmail()
	{
		System.out.println("eMAIL: "+email);
		return email;
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
