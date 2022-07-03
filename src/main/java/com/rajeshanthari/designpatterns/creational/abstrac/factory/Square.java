package com.rajeshanthari.designpatterns.creational.abstrac.factory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}