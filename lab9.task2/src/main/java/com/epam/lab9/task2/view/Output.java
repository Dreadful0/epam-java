package com.epam.lab9.task2.view;

import static com.epam.lab9.task2.view.IText.*;

import java.util.List;

public class Output {

	public void printString(String str) {
		System.out.println(str);
	}
	
	public void printArr(Integer[] arr){
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public void printList(List<?> list){
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
