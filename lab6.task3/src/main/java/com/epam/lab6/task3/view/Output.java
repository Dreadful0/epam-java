package com.epam.lab6.task3.view;

import java.lang.reflect.Field;

import com.epam.lab6.task3.model.entities.UnaryOperation;

public class Output {

	public void printString(String str){
		System.out.println(str);
	}
	
	public void printUnaryOperationState(UnaryOperation obj){
		try {
			Field field = UnaryOperation.class.getDeclaredField("data");
			field.setAccessible(true);
			System.out.println(field.getName() +" = "+ (Double)field.get(obj));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}
