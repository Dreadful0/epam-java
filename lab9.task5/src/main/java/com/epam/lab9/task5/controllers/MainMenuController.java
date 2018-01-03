package com.epam.lab9.task5.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.epam.lab9.task5.model.entities.Person;
import com.epam.lab9.task5.model.entities.Person.Gender;

public class MainMenuController {

	private static InputController input = new InputController();

	public void startMainMenu() {

		List<Integer> list = Stream.iterate(10, n -> n + 10).limit(10)
				.map((x) -> x / 2).collect(Collectors.toList());
		System.out.println(list);

		List<Person> personList = new LinkedList<>();
		input.fillTestData(personList);

		System.out.println("Ooh-y-o-u you are in army now: ");
		personList
				.stream()
				.filter((x) -> x.getAge() > 18 && x.getAge() < 27
						&& x.getGender() == Gender.MALE)
				.forEach(System.out::println);
		
		System.out.println("Average female age: ");
		System.out.println(personList.stream()
				.filter((x) -> x.getGender() == Gender.FEMALE)
				.mapToDouble((x) -> {
					return (double) x.getAge();
				}).average().getAsDouble());
	}

}
