package com.epam.lab1.task1.front;

import java.util.Random;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Input {
	
	private Random rn;
	
	public Input(){
		rn = new Random();
	}
	
	public int generateDecimalNumber(int limit){
		return rn.nextInt(limit);
	}
}
