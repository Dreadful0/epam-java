package com.epam.lab8.task5.controllers;

import com.epam.lab8.task5.model.entities.FSFJProcessor;
import com.epam.lab8.task5.view.Output;

public class MainMenuController {
	
	private static InputController input = new InputController();
	private static Output output = new Output();
	private static FileController fileCon = new FileController("C:\\Logs\\lab8task5Output.txt");

	public void startMainMenu() {
		output.printString("Please, input the directory path: ");
		String path = input.getDirPath();
		output.printString("Please, input the expected character: ");
		FSFJProcessor proc = new FSFJProcessor(fileCon, path, input.getCharacter());
		proc.process();
		output.printTextFileData(fileCon.getData(fileCon.getOutputFile()));
	}

}
