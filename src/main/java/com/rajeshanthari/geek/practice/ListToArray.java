package com.rajeshanthari.geek.practice;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
		Integer[] array = list.toArray(new Integer[] {});
		int[] array2 = list.stream().mapToInt(Integer::intValue).toArray();
	}
}
