package com.epam.lab1.task4.back;

import com.epam.lab1.task4.front.*;

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
		int[][] matrix = input.fillMatrix(input.getNumber(), 50);
		output.printMatrix(matrix);
		calc.rotateMatrix(matrix);
		output.printMatrix(matrix);
	}
}
