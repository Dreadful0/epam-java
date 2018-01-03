package com.epam.lab9.task2.controllers;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * @author Viacheslav Demianenko
 *
 */
public class InputController {
	
	static Logger logger = Logger.getLogger(InputController.class);
		
	public void fillTestData(Integer[] arr){
		Random rn = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(100);
		}
	}
	
	public void fillTestData(List<String> list){
		list.add("lorem");
		list.add("ipsum");
		list.add("dolor");
		list.add("sit");
		list.add("amet");
		list.add("consectetur");
		list.add("adipiscing");
		list.add("elit");
		list.add("sed");
		list.add("do");
		list.add("eiusmod");
		list.add("tempor");
		list.add("incididunt");
		list.add("ut");
		list.add("labore");
		list.add("et");
		list.add("dolore");
		list.add("magna");
		list.add("aliqua");
		list.add("Ut");
		list.add("enim");
		list.add("ad");
		list.add("minim");
		list.add("veniam");
		list.add("quis");
		list.add("nostrud");
		list.add("exercitation");
		list.add("ullamco");
		list.add("laboris");
		list.add("nisi");
		list.add("ut");
		list.add("aliquip");
		list.add("ex");	
		list.add("ea");
		list.add("commodo");
		list.add("consequat");
	}
	
	
	/*private Double readDouble() {
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
	}*/
	
}
