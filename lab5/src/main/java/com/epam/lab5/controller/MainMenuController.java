package com.epam.lab5.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.epam.lab5.model.StudentsDb;
import com.epam.lab5.model.entities.Student;
import com.epam.lab5.service.ResourceManager;
import com.epam.lab5.view.Input;
import com.epam.lab5.view.Output;

import static com.epam.lab5.view.IInfo.*;

public class MainMenuController {
	
	private static Output output = new Output();
	private static Input input = new Input();
	private StudentsDb students = new StudentsDb(30);
	private Integer choosen = null;
	
	public void startMainMenu(){

		do {
			output.clearOut();
			output.printMainManu();
			choosen = input.readNumber();
			if(choosen == null){
				choosen = Integer.MAX_VALUE;
				continue;
			}
			switch (choosen) {
			case MAIN_MENU_ADD_STUDENT:
				addStudent();
				break;
			case MAIN_MENU_SHOW_STUDENTS:
				showStudents();
				break;
			case MAIN_MENU_CHANGE_LANGUAGE:
				changeLanguage();
				break;
			default:
				break;
			}
		} while (choosen != MAIN_MENU_EXIT);
	}
	
	private void addStudent(){
		try {
			Student.StudentBuilder builder = new Student.StudentBuilder();
			
			output.printString(ADD_STUDENT_MENU_FIRST_NAME_STRING);
			builder.firstName(input.getString(ADD_STUDENT_MENU_FIRST_NAME_REG_EXP));
			
			output.printString(ADD_STUDENT_MENU_SECOND_NAME_STRING);
			builder.secondName(input.getString(ADD_STUDENT_MENU_SECOND_NAME_REG_EXP));
			
			output.printString(ADD_STUDENT_MENU_BIRTH_DAY_STRING);
			DateFormat format = new SimpleDateFormat(ADD_STUDENT_MENU_DATE_FORMAT, Locale.ENGLISH);
			builder.birthday(format.parse(input.getString(ADD_STUDENT_MENU_BIRTH_DAY_REG_EXP)));
			
			output.printString(ADD_STUDENT_MENU_PHONE_NUMBER_STRING);
			builder.phoneNumber(Integer.parseInt(input.getString(ADD_STUDENT_MENU_PHONE_NUMBER_REG_EXP)));
			
			output.printString(ADD_STUDENT_MENU_ADDRESS_STRING);
			builder.homeAddress(input.getString(ADD_STUDENT_MENU_ADDRESS_REG_EXP));
			
			students.addStudent(builder.build());
		} catch (Exception e) {
			//logging
			//e.printStackTrace();
			output.printString(ADD_STUDENT_MENU_FAIL);
		}
		output.printSubMenu();
		choosen = input.readNumber();
	}	
	
	private void showStudents(){
		output.printStudents(students.getStudents());
		output.printSubMenu();
		choosen = input.readNumber();
	}
	
	private void changeLanguage(){
		ResourceManager manager = ResourceManager.INSTANCE;
		output.printChangeLanguageMenu();
		choosen = input.readNumber();
		switch (choosen) {
		case CHANGE_LANGUAGE_MENU_ENGLISH_NUMBER:
			manager.changeResource(Locale.ENGLISH);
			break;
		case CHANGE_LANGUAGE_MENU_UKRAINIAN_NUMBER:
			manager.changeResource(new Locale("uk"));
			break;
		default:
			break;
		}
	}
}
