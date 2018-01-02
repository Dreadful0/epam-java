package com.epam.lab8.task5.controllers;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * @author Viacheslav Demianenko
 *
 */
public class InputController {
	
	static Logger logger = Logger.getLogger(InputController.class);	
	
	private String readString() {
		System.out.println("Please, input the string: ");
		Scanner in = new Scanner(System.in);
		String str = null;
		try {
			str = in.nextLine();
		} catch (Exception e) {
			logger.error("Invalid input", e);
		}
		return str;
	}
	
	public String getString(){	
		String result = readString();
		while (result == null){
			System.out.println("Invalid input, please try again");
			result = readString();
		}
		return result;
	}
	
	public String getDirPath(){	
		String result = readString();
		File file = new File(result);
		while (result == null || !file.isDirectory()){
			System.out.println("This is not a directory path, please try again");
			result = readString();
			file = new File(result);
		}
		return result;
	}
	
	public char getCharacter(){	
		String result = readString();
		while (result == null || result.length()>1){
			System.out.println("This is not a character, please try again");
			result = readString();
		}
		return result.toCharArray()[0];
	}
	
}
