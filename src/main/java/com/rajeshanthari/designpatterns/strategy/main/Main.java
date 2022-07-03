package com.rajeshanthari.designpatterns.strategy.main;

import com.rajeshanthari.designpatterns.strategy.controller.ScoreBoard;
import com.rajeshanthari.designpatterns.strategy.model.Balloon;
import com.rajeshanthari.designpatterns.strategy.model.Clown;
import com.rajeshanthari.designpatterns.strategy.model.SquareBalloon;

public class Main {

	public static void main(String[] args) {
		ScoreBoard sb = new ScoreBoard();
		sb.setScoreBase(new Balloon());
		sb.showScore(10, 50);
		sb.setScoreBase(new Clown());
		sb.showScore(10, 50);
		sb.setScoreBase(new SquareBalloon());
		sb.showScore(10, 50);
	}

}
