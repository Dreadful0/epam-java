package com.epam.lab9.task2.model.service;

import java.util.LinkedList;
import java.util.List;

public class ListProcessor {
	
	public interface IStrListSelector {
		public boolean select(String element);
	}
	
	public static List<String> select(List<String> list, IStrListSelector selector){
		List<String> result = new LinkedList<>();
		for (String string : list) {
			if(selector.select(string)) result.add(string);
		}
		return result;
	}
}
