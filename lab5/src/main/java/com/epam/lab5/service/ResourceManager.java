package com.epam.lab5.service;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
	INSTANCE;
	private ResourceBundle resourceBundle;
	private final String fileName = "property.text";
	
	private ResourceManager(){
		resourceBundle = ResourceBundle.getBundle(fileName, Locale.getDefault());
	}
	
	public void changeResource(Locale locale){
		resourceBundle = ResourceBundle.getBundle(fileName, locale);
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	public Enumeration<String> getSetKey(){
		return resourceBundle.getKeys();
	}
}
