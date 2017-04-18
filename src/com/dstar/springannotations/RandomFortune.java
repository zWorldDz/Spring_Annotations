package com.dstar.springannotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService {

	@Override
	public String getFotune() {
		return "RandomFortune";
	}

}
