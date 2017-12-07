package com.epam.lab6.task2.controllers;

import java.util.Scanner;

import static com.epam.lab6.task2.view.IText.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class InputController {
			
	private String readString() {
		System.out.println(PROGRAM_STRING_INPUT_STRING);
		Scanner in = new Scanner(System.in);
		String str = null;
		try {
			str = in.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public String getString(){	
		String result = readString();
		while (result == null){
			System.out.println(PROGRAM_INVALID_INPUT_STRING);
			result = readString();
		}
		return result;
	}
	
}
