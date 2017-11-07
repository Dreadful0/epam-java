package com.epam.lab1.task3.front;

import java.util.Scanner;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Input {

	public Input() {
	}
	
	private Integer readNumber() {
		Scanner in = new Scanner(System.in);
		Integer number = null;
		try {
			number = in.nextInt();
		} catch (Exception e) {
			System.err.println("Invalid input");
		}
		return number;
	}
	
	private boolean validate(Integer number) {
		if(number > 0 && number <=9) {
			return true;
		}
		System.err.println("Invalid number");
		return false;
	}
	
	public int getNumber(){
		Integer number;
		System.out.println("Input the number:");
		do {
			number = readNumber();
		} while (number == null || !validate(number));
		return number;
	}
}
