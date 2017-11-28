package com.epam.lab5.view;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.epam.lab5.service.ResourceManager;

import static com.epam.lab5.view.IInfo.*;
/**
 * @author Viacheslav Demianenko
 *
 */
public class Input {
	
	ResourceManager manager = ResourceManager.INSTANCE;
		
	public Integer readNumber() {
		System.out.println(manager.getString(NUMBER_INPUT_STRING));
		Scanner in = new Scanner(System.in);
		Integer number = null;
		try {
			number = in.nextInt();
		} catch (Exception e) {
			//logging
			//System.err.println(manager.getString(INVALID_INPUT_STRING));
		}
		return number;
	}
	
	private String readString() {
		System.out.println(manager.getString(STRING_INPUT_STRING));
		Scanner in = new Scanner(System.in);
		String str = null;
		try {
			str = in.nextLine();
		} catch (Exception e) {
			//logging
			//System.err.println(manager.getString(INVALID_INPUT_STRING));
		}
		return str;
	}
	
	private boolean validate(String str, String regExp) {
        Pattern p = Pattern.compile(regExp);
        return p.matcher(str).find();
    }
	
	public String getString(String regExp){
		String str = readString();
		while (str == null || !validate(str, manager.getString(regExp))){
			System.out.println(manager.getString(INVALID_INPUT_STRING));
			str = readString();
		}
		return str;
	}
	
}
