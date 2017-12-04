package com.epam.project1.model.entities;

import java.io.Serializable;

import com.epam.project1.model.service.GemTransparency;
import com.epam.project1.model.service.GemType;

public class Gemstone implements Serializable{
	
	private static final long serialVersionUID = 248665598909035682L;
	
	private GemType type;
	private double weight;
	private double oneCtPrice;
	private GemTransparency transparency;
	
	public Gemstone() {
	}

	public Gemstone(GemType type, double weight, double oneCtPrice,
			GemTransparency transparency) {
		this.type = type;
		this.weight = weight;
		this.oneCtPrice = oneCtPrice;
		this.transparency = transparency;
	}

	public GemType getType() {
		return type;
	}

	public void setType(GemType type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getOneCtPrice() {
		return oneCtPrice;
	}

	public void setOneCtPrice(double oneCtPrice) {
		this.oneCtPrice = oneCtPrice;
	}

	public GemTransparency getTransparency() {
		return transparency;
	}

	public void setTransparency(GemTransparency transparency) {
		this.transparency = transparency;
	}
	
	public double getGemPrice(){
		return oneCtPrice*weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(oneCtPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((transparency == null) ? 0 : transparency.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Gemstone other = (Gemstone) obj;
		if (Double.doubleToLongBits(oneCtPrice) != Double
				.doubleToLongBits(other.oneCtPrice))
			return false;
		if (transparency != other.transparency)
			return false;
		if (type != other.type)
			return false;
		if (Double.doubleToLongBits(weight) != Double
				.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gemstone [type=" + type + ", weight=" + weight
				+ ", oneCtPrice=" + oneCtPrice + ", transparency="
				+ transparency + "]";
	}
	
}
