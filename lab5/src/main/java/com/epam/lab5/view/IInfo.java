package com.epam.lab5.view;

public interface IInfo {
	
	int MAIN_MENU_ADD_STUDENT = 1;
	int MAIN_MENU_SHOW_STUDENTS = 2;
	int MAIN_MENU_CHANGE_LANGUAGE = 3;
	int MAIN_MENU_EXIT = 0;
	String ADD_STUDENT_MENU_DATE_FORMAT = "dd/mm/yyyy";
	
	String MAIN_MENU_TITLE = "mainMenuTitle";
	String MAIN_MENU_ADD_STUDENT_STRING = "addNewStudent";
	String MAIN_MENU_SHOW_STUDENTS_STRING = "showStudents";
	String MAIN_MENU_CHANGE_LANGUAGE_STRING = "changeLanguage";
	String MAIN_MENU_EXIT_STRING = "exit";
	
	String NO_DATA_STRING = "noDataString";
	String DELIMETER = "delimeter";
	
	String NUMBER_INPUT_STRING = "numberInputString";
	String STRING_INPUT_STRING = "stringInputString";
	String INVALID_INPUT_STRING = "invalidInput";
	
	String SUB_MENU_TITLE = "subMenuTitle";
	String SUB_MENU_BACK_STRING = "backString";
	
	String ADD_STUDENT_MENU_FIRST_NAME_STRING = "addStudentMenuFirstName";
	String ADD_STUDENT_MENU_SECOND_NAME_STRING = "addStudentMenuSecondName";
	String ADD_STUDENT_MENU_BIRTH_DAY_STRING = "addStudentMenuBirthDay";
	String ADD_STUDENT_MENU_PHONE_NUMBER_STRING = "addStudentMenuPhoneNumber";
	String ADD_STUDENT_MENU_ADDRESS_STRING = "addStudentMenuAddress";
	String ADD_STUDENT_MENU_FAIL = "addStudentMenuFail";
	
	String ADD_STUDENT_MENU_FIRST_NAME_REG_EXP = "addStudentMenuFirstNameRegExp";
	String ADD_STUDENT_MENU_SECOND_NAME_REG_EXP = "addStudentMenuSecondNameRegExp";
	String ADD_STUDENT_MENU_BIRTH_DAY_REG_EXP = "addStudentMenuBirthDayRegExp";
	String ADD_STUDENT_MENU_PHONE_NUMBER_REG_EXP = "addStudentMenuPhoneNumberRegExp";
	String ADD_STUDENT_MENU_ADDRESS_REG_EXP = "addStudentMenuAddressRegExp";
	
	int CHANGE_LANGUAGE_MENU_ENGLISH_NUMBER = 1;
	int CHANGE_LANGUAGE_MENU_UKRAINIAN_NUMBER = 2;
	String CHANGE_LANGUAGE_MENU_TITLE = "changeLanguageMenuTitle";
	String CHANGE_LANGUAGE_MENU_ENGLISH = "changeLanguageMenuEnglish";
	String CHANGE_LANGUAGE_MENU_UKRAINIAN = "changeLanguageMenuUkrainian";
}
