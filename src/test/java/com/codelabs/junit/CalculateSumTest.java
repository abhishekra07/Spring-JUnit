package com.codelabs.junit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalculateSumTest {

	@Autowired
	CalculateSum calculateSum;
	
	@Test
	public void testGetSumOfArray() {
		int[] numbers = new int[]{10,20,30};
		int sum = calculateSum.getSumOfArray(numbers);
		assertThat(sum).isEqualTo(60);
	}
	
	@Test
	public void testGetSumOfArrayWithNegativeValue() {
		int[] numbers = new int[]{-1,-2,-3};
		int sum = calculateSum.getSumOfArray(numbers);
		assertThat(sum).isEqualTo(-6);
	}
}
