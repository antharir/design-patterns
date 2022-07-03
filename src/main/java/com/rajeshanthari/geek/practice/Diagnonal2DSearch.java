package com.rajeshanthari.geek.practice;

import java.util.ArrayList;
import java.util.List;

public class Diagnonal2DSearch {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 5, 2, 0, 7, 1 }, 
				{ 3, 4, 2, 9, 14 }, 
				{ 5, 1, 3, 5, 2 }, 
				{ 4, 2, 6, 2, 1 },
				{ 0, 6, 3, 5, 1 } };
		print2DArray(arr);
		sortDiagnonal2DArray(arr);
		print2DArray(arr);
	}
	
	public static void sortDiagnonal2DArray(int[][] data) {
		
		List<Integer> midValues = new ArrayList<>();
		for (int i = 0; i < data.length; i++) {
			midValues.add(data[i][i]);
		}
		// Sort logic
		midValues.sort(null);
		for (int i = 0; i < midValues.size(); i++) {
			data[i][i] = midValues.get(i);
		}
	}
	
	public static void print2DArray(int[][] data) {
		System.out.println("------------------------------");
		for (int[] array : data) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

}
