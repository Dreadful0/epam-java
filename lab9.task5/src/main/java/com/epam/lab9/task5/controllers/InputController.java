package com.epam.lab9.task5.controllers;

import java.util.List;

import com.epam.lab9.task5.model.entities.Person;
import com.epam.lab9.task5.model.entities.Person.Gender;

/**
 * @author Viacheslav Demianenko
 *
 */
public class InputController {
	
	public void fillTestData(List<Person> list){
		list.add(new Person("Joe", 25, Gender.MALE));
		list.add(new Person("Mike", 10, Gender.MALE));
		list.add(new Person("John", 24, Gender.MALE));
		list.add(new Person("Karl", 23, Gender.MALE));
		list.add(new Person("Mary", 18, Gender.FEMALE));
		list.add(new Person("Kate", 22, Gender.FEMALE));
	}
	
}
