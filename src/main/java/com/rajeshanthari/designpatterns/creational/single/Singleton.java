package com.rajeshanthari.designpatterns.creational.single;

public class Singleton {

	private final static Singleton instance = new Singleton();

	private Singleton() {
		if (instance != null) {
			System.out.println("Can not create singleton object");
		}
	}

	public static Singleton getInstance() {
		return instance;
	}

}
