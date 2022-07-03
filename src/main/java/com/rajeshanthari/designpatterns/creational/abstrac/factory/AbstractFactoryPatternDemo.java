package com.rajeshanthari.designpatterns.creational.abstrac.factory;

import java.util.HashMap;

public class AbstractFactoryPatternDemo {

	{
		System.out.println("Instance block");
	}

	static {
		System.out.println("Static top");
	}
	static {
		System.out.println("Static middle");
	}

	public static void main(String[] args) {
		AbstractFactory rounded = FactoryProducer.getFactory(true);
		rounded.getShape("RECTANGLE").draw();
		rounded.getShape("SQUARE").draw();
		AbstractFactory shapeFact = FactoryProducer.getFactory(false);
		shapeFact.getShape("RECTANGLE").draw();
		shapeFact.getShape("SQUARE").draw();
		new AbstractFactoryPatternDemo();
	}

	static {
		System.out.println("Static last");
	}

	{
		System.out.println("Instance block1");
	}

}

abstract class Animal {
	public Animal() {

	}
}