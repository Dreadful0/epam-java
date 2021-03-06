package com.epam.lab1.task1.back;

import com.epam.lab1.task1.front.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class App {

	private static Input input;
	private static Output output;
	
	public App() {
		input = new Input();
		output = new Output();
	}
	
	public void doWork(){
		MyNumber number = new MyNumber(input.getNumber());
		output.print(number);
		output.print(number.transform(2));
		output.print(number.transform(8));
		output.print(number.transform(16));
	}
}
