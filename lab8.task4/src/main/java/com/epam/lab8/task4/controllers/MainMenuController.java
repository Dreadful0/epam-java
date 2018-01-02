package com.epam.lab8.task4.controllers;

import com.epam.lab8.task4.model.entities.SumOfElementsFJ;

public class MainMenuController {
	
	private static InputController input = new InputController();

	public void startMainMenu() {
		int[] data = new int[1_000_000];
		input.fillData(data);
		System.out.println("Sum: "+new SumOfElementsFJ(data, 8).getSum());
	}

}
