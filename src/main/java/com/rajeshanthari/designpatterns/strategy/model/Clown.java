package com.rajeshanthari.designpatterns.strategy.model;

import com.rajeshanthari.designpatterns.strategy.controller.ScoreBoardBase;

public class Clown extends ScoreBoardBase {
	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier - 10);
	}

}
