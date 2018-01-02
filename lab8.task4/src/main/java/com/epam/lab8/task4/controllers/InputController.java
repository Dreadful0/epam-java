package com.epam.lab8.task4.controllers;

import java.util.Random;

/**
 * @author Viacheslav Demianenko
 *
 */
public class InputController {
	
	public void fillData(int[] data){
		Random rn = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rn.nextInt(100);
		}
	}
	
}
