package com.epam.lab1.task1.back;

import java.util.Arrays;

/**
 * @author Viacheslav Demianenko
 *
 */
public class MyNumber {

	private byte[] data;
	private int notation;
	private int decimalNumber;

	public MyNumber() {
	}

	public MyNumber(int decimalNumber) {
		this.decimalNumber = decimalNumber;
		notation = 10;
	}

	public byte[] getData() {
		return data;
	}

	public void setDecimalNumber(int decimalNumber) {
		this.decimalNumber = decimalNumber;
		data = null;
		notation = 10;
	}

	public int getNotation() {
		return notation;
	}
	
	public int getDecimalNumber() {
		return decimalNumber;
	}

	public MyNumber transform(int notation) {
		this.notation = notation;
		byte[] buffer = new byte[100];
		int numberOfBits;
		int tempDecimalNumber = decimalNumber;
		for (numberOfBits = 0; tempDecimalNumber != 0; numberOfBits++) {
			int temp = tempDecimalNumber % notation;
			buffer[numberOfBits] = (byte)temp;
			tempDecimalNumber /= notation;
		}
		data = Arrays.copyOf(buffer, numberOfBits);
		return this;
	}
}
