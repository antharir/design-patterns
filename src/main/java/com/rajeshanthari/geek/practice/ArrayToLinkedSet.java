package com.rajeshanthari.geek.practice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToLinkedSet {

	public static void main(String[] args) {
		String[] names = {"rajesh", "ramesh","pavindar","menu's"};
		Set<String> nameSet = Stream.of(names).collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(nameSet);
		System.out.println(nameSet.getClass().getName());
	}
}
