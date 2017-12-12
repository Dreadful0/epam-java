package com.epam.lab7.task1.controllers;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import static com.epam.lab7.task1.view.IText.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class InputController {
	
	Random rn = new Random();
			
	public void fillList(List<Integer> list, int from, int to, int size){
		for (int i = 0; i < size; i++) {
			list.add(rn.nextInt(to-from)+from);
		}
	}
	
	public void fillSet(Set<Integer> set, int from, int to, int size){
		if(to-from < size)throw new InvalidParameterException();
		while(set.size()<size){
			set.add(rn.nextInt(to-from)+from);
		}
	}
	
	private Integer readInteger() {
		System.out.println(PROGRAM_INTEGER_INPUT_STRING);
		Scanner in = new Scanner(System.in);
		Integer number = null;
		try {
			number = in.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return number;
	}
	
	public int getInteger(){	
		Integer result = readInteger();
		while (result == null){
			System.out.println(PROGRAM_INVALID_INPUT_STRING);
			result = readInteger();
		}
		return result;
	}
	
}
