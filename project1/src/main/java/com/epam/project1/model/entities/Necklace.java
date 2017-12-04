package com.epam.project1.model.entities;

public class Necklace extends Jewelry {

	private static final long serialVersionUID = -8095892903542226969L;

	private int length;

	public Necklace(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
