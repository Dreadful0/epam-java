package com.epam.lab7.task1.controllers;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import static com.epam.lab7.task1.view.IText.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class InputController {
			
	public void fillList(List<Integer> list, int[] data){
		for (int i : data) {
			list.add(i);
		}
	}
	
	public void fillSet(Set<Integer> set, int[] data){
		for (int i : data) {
			set.add(i);
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
