package com.epam.lab1.task2.front;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Output {

	public Output() {
	}
	
	public void printNumbers(int[] numbers){
		for (int i : numbers) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
