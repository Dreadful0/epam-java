package com.epam.lab5.view;

import com.epam.lab5.model.entities.Student;
import com.epam.lab5.service.ResourceManager;

import static com.epam.lab5.view.IInfo.*;

public class Output {

	ResourceManager manager = ResourceManager.INSTANCE;
	
	public void printMainManu(){
		System.out.println(manager.getString(MAIN_MENU_TITLE));
		System.out.println(MAIN_MENU_ADD_STUDENT +")"+ manager.getString(MAIN_MENU_ADD_STUDENT_STRING));
		System.out.println(MAIN_MENU_SHOW_STUDENTS+")"+manager.getString(MAIN_MENU_SHOW_STUDENTS_STRING));
		System.out.println(MAIN_MENU_CHANGE_LANGUAGE+")"+manager.getString(MAIN_MENU_CHANGE_LANGUAGE_STRING));
		System.out.println(MAIN_MENU_EXIT+")"+manager.getString(MAIN_MENU_EXIT_STRING));
	}
	
	public void printSubMenu(){
		System.out.println(manager.getString(SUB_MENU_TITLE));
		System.out.println(manager.getString(SUB_MENU_BACK_STRING));
		System.out.println(MAIN_MENU_EXIT+")"+manager.getString(MAIN_MENU_EXIT_STRING));
	}
	
	public void printChangeLanguageMenu(){
		System.out.println(manager.getString(CHANGE_LANGUAGE_MENU_TITLE));
		System.out.println(CHANGE_LANGUAGE_MENU_ENGLISH_NUMBER +")"+ manager.getString(CHANGE_LANGUAGE_MENU_ENGLISH));
		System.out.println(CHANGE_LANGUAGE_MENU_UKRAINIAN_NUMBER+")"+manager.getString(CHANGE_LANGUAGE_MENU_UKRAINIAN));
	}
	
	public void clearOut(){
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}
	
	public void printStudents(Student[] students){
		if(students.length == 0){
			System.out.println(manager.getString(NO_DATA_STRING));
			return;
		}
		System.out.println(manager.getString(DELIMETER));
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println(manager.getString(DELIMETER));
	}
	
	public void printString(String str){
		System.out.println(manager.getString(str));
	}
}
