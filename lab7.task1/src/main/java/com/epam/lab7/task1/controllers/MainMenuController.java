package com.epam.lab7.task1.controllers;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.epam.lab7.task1.view.Output;

import static com.epam.lab7.task1.view.IText.*;

public class MainMenuController {
	
	private static Output output = new Output();
	private static InputController input = new InputController();
	
	public void startMainMenu(){

		output.printString(MAIN_MENU_COLLECTION_SIZE);
		int size = input.getInteger();
		output.printString(MAIN_MENU_NUMBER_BOUNDS);
		int from = input.getInteger();
		int to = input.getInteger();
		
		Random rn = new Random();
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(to-from)+from;
		}
		
		List<Integer> list = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		
		input.fillList(list, arr);
		input.fillSet(set, arr);
		
		output.printList(list);
		output.printSet(set);
	}
	
}
