package com.epam.labEnum;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class MyEnum {

	private final MyEnumNode[] data;

	public MyEnum(String... parameters) throws InvalidParameterException{
		data = new MyEnumNode[parameters.length];
		try {
			for (int i = 0; i < parameters.length; i++) {
				data[i] = new MyEnumNode((String) parameters[i], i, this);
			}
		} catch (Exception e) {
			throw new InvalidParameterException(e.getMessage());
		}
	}

	public MyEnumNode[] values(){
		return Arrays.copyOf(data, data.length);
	}
	
	public MyEnumNode valueOf(String name) throws IllegalArgumentException, NullPointerException{
		if (name == null)
			throw new NullPointerException("Name is null");
		for (MyEnumNode myEnumNode : data) {
			if (myEnumNode.name().equals(name)) return myEnumNode;
		}
		throw new IllegalArgumentException("No enum const " + name);
	}
}
