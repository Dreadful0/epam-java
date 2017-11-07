package com.epam.lab1.task1.front;

import java.util.Arrays;
import com.epam.lab1.task1.back.MyNumber;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Output {

	final static char[] dictionary = { '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public Output() {
	}

	public void print(MyNumber number) {
		if (number.getData() == null)
			System.out.println(number.getDecimalNumber() + "(10)");
		else {
			for (int i = number.getData().length - 1; i >= 0; i--) {
				System.out.print(dictionary[number.getData()[i]]);
			}
			System.out.println("(" + number.getNotation() + ")");
		}

	}
}
