package com.epam.labEnum;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MyEnumNode implements Comparable, Serializable {

	private final String name;
	private final int ordinal;
	private final MyEnum container;

	MyEnumNode(String name, int ordinal, MyEnum container) {
		this.name = name;
		this.ordinal = ordinal;
		this.container = container;
	}

	public MyEnumNode[] values(){
		return container.values();
	}
	
	public MyEnumNode valueOf(String name) {
		return container.valueOf(name);
	}
	
	public String name() {
		return name;
	}

	public int ordinal() {
		return ordinal;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ordinal;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MyEnumNode other = (MyEnumNode) obj;
		if (ordinal != other.ordinal)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Object arg0) throws ClassCastException{
		if (this.getClass() != arg0.getClass())
			throw new ClassCastException();
		MyEnumNode other = (MyEnumNode) arg0;
		return this.ordinal - other.ordinal;
	}

	public final Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	private void readObject(ObjectInputStream in) throws InvalidObjectException {
		throw new InvalidObjectException("can't deserialize enum");
	}

	private void readObjectNoData() throws InvalidObjectException {
		throw new InvalidObjectException("can't deserialize enum");
	}
}
