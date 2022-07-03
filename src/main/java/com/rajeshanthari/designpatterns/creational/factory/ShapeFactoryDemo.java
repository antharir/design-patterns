package com.rajeshanthari.designpatterns.creational.factory;

public class ShapeFactoryDemo {

	public static void main(String[] args) {

		ShapeFactory fact = new ShapeFactory();
		Shape shape = fact.getShape("CIRCLE");
		shape.draw();
		shape = fact.getShape("RECTANGLE");
		shape.draw();
		shape = fact.getShape("SQUARE");
		shape.draw();

	}
}
