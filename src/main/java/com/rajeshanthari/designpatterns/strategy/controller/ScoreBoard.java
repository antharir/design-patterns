package com.rajeshanthari.designpatterns.strategy.controller;

import lombok.Setter;

@Setter
public class ScoreBoard {
	ScoreBoardBase scoreBase;

	public void showScore(int taps, int multiplier) {
		System.out.println(scoreBase.calculateScore(taps, multiplier));
	}

}
