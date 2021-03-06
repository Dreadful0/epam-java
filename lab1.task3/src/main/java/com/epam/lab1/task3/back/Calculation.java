package com.epam.lab1.task3.back;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Calculation {

	public Calculation() {
	}
	
	private int[] createRow(int rowNumber){
		rowNumber++;
		int[] row = new int[rowNumber*2-1];
		for (int i = 0; i < row.length; i++) {
			if(i<rowNumber){
				row[i] = i+1;
			}
			else {
				row[i] = row.length-i;
			}
		}
		return row;
	}
	
	public int[][] createTable(int rowsNumber){
		int[][] table = new int[rowsNumber][];
		for (int i = 0; i < rowsNumber; i++) {
			table[i] = createRow(i);
		}
		return table;
	}
}
