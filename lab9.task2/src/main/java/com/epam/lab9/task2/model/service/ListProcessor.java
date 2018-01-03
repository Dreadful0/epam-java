package com.epam.lab9.task2.model.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListProcessor {

	public interface IStrListSelector {
		public boolean select(String element);
	}

	public static List<String> select(List<String> list,
			IStrListSelector selector) {
		List<String> result = new LinkedList<>();
		for (String string : list) {
			if (selector.select(string))
				result.add(string);
		}
		return result;
	}

	@FunctionalInterface
	public interface IStrConvert {
		
		public String convert(String element);

		public static boolean isExist(String element) {
			return (element == null) ? false : true;
		}
	}
	
	public static void convert(List<String> list, IStrConvert converter) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if(IStrConvert.isExist(str))list.set(i, converter.convert(str));
		}
	}
}
