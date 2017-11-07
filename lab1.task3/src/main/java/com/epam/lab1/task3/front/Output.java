package com.epam.lab1.task3.front;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Output {

	public Output() {
	}
	
	public void printTable(int[][] table){
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[table.length-1-i].length/2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}
}
