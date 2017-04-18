package com.dstar.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.dstar.springannotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//Define Bean for fortune
	@Bean
	public FortuneService SadFotune()
	{
		return new SadFotune();
	}
	
	
	//Define Bean for Coach
	@Bean
	public Coach swinCoach()
	{
		return new SwinCoach(SadFotune());
		
	}
	
}
