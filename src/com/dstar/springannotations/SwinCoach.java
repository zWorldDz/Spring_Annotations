package com.dstar.springannotations;

import org.springframework.stereotype.Component;

@Component
public class SwinCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwinCoach(FortuneService theFortuneService){
		 fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swin 10000km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFotune();
	}

	@Override
	public String printTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printEmail() {
		// TODO Auto-generated method stub
		return null;
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
