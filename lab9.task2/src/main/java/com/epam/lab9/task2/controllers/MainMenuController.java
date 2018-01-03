package com.epam.lab9.task2.controllers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.StyleSheet.ListPainter;

import com.epam.lab9.task2.model.service.ArrayProcessor;
import com.epam.lab9.task2.model.service.ListProcessor;
import com.epam.lab9.task2.view.Output;

public class MainMenuController {

	private static InputController input = new InputController();
	private static Output output = new Output();
	private Integer[] intArr = new Integer[10];
	private List<String> strList = new LinkedList<>();

	public void startMainMenu() {

		input.fillTestData(strList);
		input.fillTestData(intArr);

		output.printString("	Before: ");
		output.printArr(intArr);
		output.printList(strList);

		/*Arrays.sort(intArr, (Integer a, Integer b) -> {
			return b - a;
		});
		Collections.sort(strList, (String a, String b) -> {
			return b.compareTo(a);
		});*/
		
		Integer[] selectedArr = ArrayProcessor.select(intArr, (x)->{
			if(x > 50) return true;
			else return false;
		});
		List<String> selectedList = ListProcessor.select(strList, (x)->{
			return x.startsWith("a");
		});
		
		ListProcessor.convert(selectedList, (x)->{
			return x.toUpperCase();
		});

		output.printString("	After: ");
		output.printArr(selectedArr);
		output.printList(selectedList);

	}

}
