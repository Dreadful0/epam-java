package com.epam.lab1.task2.back;

import java.util.Arrays;

public class Calculation {

	public Calculation() {
	}
	
	private int getSumOfDivisors(int number){
		int sum = 0;
		for (int i = 1; i <= number/2; i++) {
			if(number%i == 0){
				sum+=i;
			}
		}
		return sum;
	}
	
	public int[] getPerfectNumbers(int limit){
		int[] buffer = new int[limit/2];
		int amount = 0;
		for (int i = 0; i < limit; i+=2) {
			if(i == getSumOfDivisors(i)){
				buffer[amount] = i;
				amount++;
			}
		}
		return Arrays.copyOf(buffer, amount);
	}
}
