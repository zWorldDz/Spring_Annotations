package com.dstar.springannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getFotune() {
		return "Today is Lucky Day";
	}

}
