package com.epam.lab1.task4.back;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Calculation {

	public Calculation() {
	}

	public int[][] rotateMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = i; j < matrix.length - 1 - i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][matrix.length - 1 - i];
				matrix[j][matrix.length-1-i] = matrix[matrix.length-1-i][matrix.length-1-j];
				matrix[matrix.length-1-i][matrix.length-1-j] = matrix[matrix.length-1-j][i];
				matrix[matrix.length - 1 - j][i] = temp;
			}
		}
		return matrix;
	}
}
