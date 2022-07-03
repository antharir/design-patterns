package com.rajeshanthari.udemy.practice;

public class TreeDemo {
	public static void main(String[] args) {
		Tree tObj = new Tree();
		tObj.insert(25);
		tObj.insert(20);
		tObj.insert(15);
		tObj.insert(27);
		tObj.insert(30);
		tObj.insert(29);
		tObj.insert(26);
		tObj.insert(22);
		tObj.insert(32);
		tObj.insert(17);
		tObj.traversInOrder();
		System.out.println();
//		System.out.println(tObj.get(20));
//		System.out.println(tObj.get(30));
//		System.out.println(tObj.get(45));
//		System.out.println("Min = " + tObj.min() );
//		System.out.println("Max = " + tObj.max() );
		//tObj.delete(888);
//		tObj.delete(27);
//		tObj.delete(25);
		tObj.traversPreOrder();
		System.out.println();
		tObj.traversPostOrder();
		System.out.println();
	}
}
