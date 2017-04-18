package com.dstar.springannotations;

public class SadFotune implements FortuneService {

	@Override
	public String getFotune() {
		return "SadFortune";
	}

}
