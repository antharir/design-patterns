package com.rajeshanthari.designpatterns.strategy.model;

import com.rajeshanthari.designpatterns.strategy.controller.ScoreBoardBase;

public class Balloon extends ScoreBoardBase {
	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier - 20);
	}
}
