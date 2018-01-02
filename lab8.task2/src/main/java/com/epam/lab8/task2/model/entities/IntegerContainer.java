package com.epam.lab8.task2.model.entities;

public class IntegerContainer {

	private volatile int data = 0;
	
	public synchronized int getData(){
		return data;
	}
	
	public synchronized void increment(){
		data++;
	}
}
