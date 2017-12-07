package com.epam.lab6.task3.controllers;

import java.lang.reflect.InvocationTargetException;

import com.epam.lab6.task3.model.entities.UnaryOperation;
import com.epam.lab6.task3.view.Output;

import static com.epam.lab6.task3.view.IText.*;

public class MainMenuController {

	private static Output output = new Output();

	public void startMainMenu() {

		try {
			UnaryOperation operation = UnaryOperation.class.getConstructor(
					Double.class).newInstance(10.2);

			output.printString(MAIN_MENU_START_STRING);
			output.printUnaryOperationState(operation);
			UnaryOperation.class.getMethod("setData", Double.class).invoke(
					operation, 20.0);
			output.printString(MAIN_MENU_MODIFIED_STRING);
			output.printUnaryOperationState(operation);

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

}
