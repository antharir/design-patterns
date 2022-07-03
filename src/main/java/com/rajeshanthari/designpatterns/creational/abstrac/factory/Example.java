package com.rajeshanthari.designpatterns.creational.abstrac.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		// IntStream intStream = IntStream.of(52, 25, 98, 4, 98, 3, 15);
		// intStream.sorted().forEach(System.out::println);
		// intStream.distinct().sorted().forEach(System.out::println);
//		IntSummaryStatistics summaryStatistics = intStream.summaryStatistics();
//		System.out.println(summaryStatistics);
		// intStream.mapToObj(i -> new
		// Employee(i)).toList().forEach(System.out::println);

		// ExecutorService service = Executors.newScheduledThreadPool(2);
//		Runnable target = () -> {
//			System.out.println("In body waiting for " + Thread.currentThread().getName());
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("In body waiting for completed " + Thread.currentThread().getName());
//		};
//		Thread obj1 = new Thread(target, "Obj1");
//		Thread obj2 = new Thread(target, "Obj2");
//		Thread obj3 = new Thread(target, "Obj3");
//		service.submit(obj1);
//		service.submit(obj2);
//		service.submit(obj3);
//		
		
	}

}

class Employee {
	int num;

	public Employee(Integer number) {
		this.num = number;
	}
}
