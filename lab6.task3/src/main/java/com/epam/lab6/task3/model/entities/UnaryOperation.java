package com.epam.lab6.task3.model.entities;

public class UnaryOperation {

	private Double data;	
	
	public UnaryOperation() {
	}

	public UnaryOperation(Double data) {
		this.data = data;
	}

	public Double increment(){
		return ++data;
	}
	
	public Double decrement(){
		return --data;
	}
	
	public Double negation(){
		data = -data;
		return data;
	}
	
	public Double getData() {
		return data;
	}

	public void setData(Double data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "UnaryOperation [data=" + data + "]";
	}
	
}
