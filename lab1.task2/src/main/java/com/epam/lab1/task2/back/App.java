package com.epam.lab1.task2.back;

import com.epam.lab1.task2.front.*;

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
		System.out.println(input.getNumber());
	}
}