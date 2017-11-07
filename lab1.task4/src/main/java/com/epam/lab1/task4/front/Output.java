package com.epam.lab1.task4.front;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Output {

	public Output() {
	}
	
	public void printMatrix(int[][] matrix){
		System.out.println("---------------------------------------------");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d ",matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
}
