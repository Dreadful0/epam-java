package com.epam.lab1.task3.back;

import java.util.Arrays;

import com.epam.lab1.task3.front.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class App {

	private static Input input;
	private static Output output;
	private static Calculation calc;
	
	public App() {
		input = new Input();
		output = new Output();
		calc = new Calculation();
	}
	
	public void doWork(){		
		System.out.println("hello");
	}
}
