package com.epam.lab7.task1.view;

import java.util.List;
import java.util.Set;

public class Output {

	public void printString(String str){
		System.out.println(str);
	}
	
	public void printList(List<?> list){
		System.out.println("List: "+list.toString());
	}
	
	public void printSet(Set<?> set){
		System.out.println("Set: "+set.toString());
	}
	
}
