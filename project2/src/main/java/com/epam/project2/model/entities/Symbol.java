package com.epam.project2.model.entities;

public class Symbol {

	private char data;	
	
	public Symbol(char data) {
		this.data = data;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symbol other = (Symbol) obj;
		if (data != other.data)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ""+data;
	}
	
}
