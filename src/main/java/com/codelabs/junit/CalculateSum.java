package com.codelabs.junit;

import org.springframework.stereotype.Component;

@Component
public class CalculateSum {

	public static int a =10;
	
	public int getSumOfArray(int[] numbers) {
		int sum=0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
}
