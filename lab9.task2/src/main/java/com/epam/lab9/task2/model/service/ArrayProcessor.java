package com.epam.lab9.task2.model.service;

import java.util.Arrays;

public class ArrayProcessor {

	public interface IIntArrSelector {
		public boolean select(Integer element);
	}
	
	public static Integer[] select(Integer[] arr, IIntArrSelector selector){
		Integer[] temp = new Integer[arr.length];
		int counter = 0;
		for (Integer integer : arr) {
			if(selector.select(integer)){
				temp[counter++]=integer;
			}
		}
		return Arrays.copyOfRange(temp, 0, counter);
	}
}
