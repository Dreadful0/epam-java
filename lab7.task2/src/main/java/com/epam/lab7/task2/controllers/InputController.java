package com.epam.lab7.task2.controllers;

import java.util.Scanner;

import com.epam.lab7.task2.model.entities.Translator;

import static com.epam.lab7.task2.view.IText.*;

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
	
	public void fillTestData(Translator translator){
		translator.addWord("hello", "привет");
		translator.addWord("world", "мир");
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
