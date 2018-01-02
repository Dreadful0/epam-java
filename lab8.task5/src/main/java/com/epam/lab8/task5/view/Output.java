package com.epam.lab8.task5.view;

import com.epam.lab8.task5.model.entities.TextFileData;

public class Output {

	public void printTextFileData(TextFileData fileData){
		System.out.println(fileData.getFile().getName());
		for (String line : fileData.getData()) {
			System.out.println(line);
		}
	}
	
	public void printString(String str){
		System.out.println(str);
	}
}
