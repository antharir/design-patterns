package com.rajeshanthari.designpatterns.creational.single;

public class SingleTonTest {
	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();

		System.out.println("Obj1 -> " + obj1.hashCode());
		System.out.println("Obj2 -> " + obj2.hashCode());
		System.out.println("Obj3 -> " + obj3.hashCode());
	}
}
