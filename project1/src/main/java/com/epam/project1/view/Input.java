package com.epam.project1.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.epam.project1.service.ResourceManager;

import static com.epam.project1.view.IText.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Input {
	
	static Logger logger = Logger.getLogger(Input.class);
	
	ResourceManager manager = ResourceManager.INSTANCE;
		
	private Double readDouble() {
		System.out.println(manager.getString(PROGRAM_DOUBLE_INPUT_STRING));
		Scanner in = new Scanner(System.in);
		Double number = null;
		try {
			number = in.nextDouble();
		} catch (Exception e) {
			logger.error("Invalid input", e);
		}
		return number;
	}
	
	private Integer readInteger() {
		System.out.println(manager.getString(PROGRAM_NUMBER_INPUT_STRING));
		Scanner in = new Scanner(System.in);
		Integer number = null;
		try {
			number = in.nextInt();
		} catch (Exception e) {
			logger.error("Invalid input", e);
		}
		return number;
	}
	
	
	private String readString() {
		System.out.println(manager.getString(PROGRAM_STRING_INPUT_STRING));
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
			System.out.println(manager.getString(PROGRAM_INVALID_INPUT_STRING));
			result = readString();
		}
		return result;
	}
	
	public int getInteger(){	
		Integer result = readInteger();
		while (result == null){
			System.out.println(manager.getString(PROGRAM_INVALID_INPUT_STRING));
			result = readInteger();
		}
		return result;
	}
	
	public double getDouble(){	
		Double result = readDouble();
		while (result == null){
			System.out.println(manager.getString(PROGRAM_INVALID_INPUT_STRING));
			result = readDouble();
		}
		return result;
	}
	
}
