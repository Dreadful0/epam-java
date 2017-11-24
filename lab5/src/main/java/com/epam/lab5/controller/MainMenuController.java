package com.epam.lab5.controller;

import com.epam.lab5.view.Output;

public class MainMenuController {
	
	private static Output output = new Output();
	
	public void startMainMenu(){
		output.printMainMenu();
	}
}
