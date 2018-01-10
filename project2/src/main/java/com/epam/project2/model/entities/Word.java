package com.epam.project2.model.entities;

public class Word extends TextComponent{

	public Word() {
		super();
	}
	
	public Word(String str) {
		super(str);
	}
	
	public Character getFirstLetter(){
		if(this.getData().isEmpty()) return null;
		return this.getData().get(0).getData();
	}
	
}
