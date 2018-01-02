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
		
		List<Integer> list = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		
		input.fillList(list, from, to, size);
		try {
			input.fillSet(set,from, to, size);
		} catch (Exception e) {
			System.out.println("invalid input");
		}
		
		output.printList(list);
		output.printSet(set);
	}
	
}
