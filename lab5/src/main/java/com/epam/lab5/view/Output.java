package com.epam.lab5.view;

public class Output {

	ResourceManager manager = ResourceManager.INSTANCE;
	
	public void printMainMenu(){
		System.out.println(manager.getString("mainMenuTitle"));
	}
	
}
