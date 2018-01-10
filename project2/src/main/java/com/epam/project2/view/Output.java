package com.epam.project2.view;

import java.util.HashMap;

import com.epam.project2.model.entities.Sentence;

public class Output {
	
	public void printString(String str){
		System.out.println(str);
	}
	
	public void printWords(HashMap<Character, Sentence> container){
		for (Sentence sentence : container.values()) {
			System.out.println(sentence);
		}
	}
}
