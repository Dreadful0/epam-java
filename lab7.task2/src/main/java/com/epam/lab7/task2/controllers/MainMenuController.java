package com.epam.lab7.task2.controllers;

import java.lang.reflect.Field;

import com.epam.lab7.task2.model.entities.Translator;
import com.epam.lab7.task2.view.Output;

import static com.epam.lab7.task2.view.IText.*;

public class MainMenuController {
	
	private static Output output = new Output();
	private static InputController input = new InputController();
	private Translator trans = new Translator();
	
	public MainMenuController() {
		input.fillTestData(trans);
	}


	public void startMainMenu(){	
		
		String inputStr = input.getString();
		output.printString(trans.translate(inputStr));
		
	}
	
}
