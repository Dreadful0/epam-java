package com.epam.lab7.task2.model.entities;

import java.util.HashMap;

public class Translator {

	private HashMap<String, String> dictionary = new HashMap<>();

	public Translator() {
	}

	public void addWord(String word, String translation) {
		dictionary.put(word, translation);
	}

	public String translate(String text) {
		text = text.toLowerCase();
		String[] words = text.split("\\W+");
		StringBuilder builder = new StringBuilder(text);
		for (String string : words) {
			if (dictionary.containsKey(string)) {
				builder.replace(builder.indexOf(string),
						builder.indexOf(string) + string.length(),
						dictionary.get(string));
			} else {
				builder.replace(builder.indexOf(string),
						builder.indexOf(string) + string.length(),
						"???");
			}
		}
		return builder.toString();
	}
}
