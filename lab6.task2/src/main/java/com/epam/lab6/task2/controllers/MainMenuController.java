package com.epam.lab6.task2.controllers;

import java.lang.reflect.Field;

import com.epam.lab6.task2.view.Output;
import static com.epam.lab6.task2.view.IText.*;

public class MainMenuController {
	
	private static Output output = new Output();
	private static InputController input = new InputController();
	
	public void startMainMenu(){

		String literalStr = "test literal string";
		String newStr = "modified string";
		String inputStr = input.getString();
		
		output.printString(MAIN_MENU_START_STRING);
		output.printString(literalStr);
		output.printString(inputStr);
		try {
			Field field= String.class.getDeclaredField("value");
			field.setAccessible(true);
			field.set(literalStr, newStr.toCharArray());
			field.set(inputStr, newStr.toCharArray());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		output.printString(MAIN_MENU_MODIFIED_STRING);
		output.printString(literalStr);
		output.printString(inputStr);
	}
	
}
