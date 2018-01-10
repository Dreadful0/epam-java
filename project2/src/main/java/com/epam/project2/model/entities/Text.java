package com.epam.project2.model.entities;

import java.util.LinkedList;
import java.util.List;

public class Text {

	private List<Sentence> data;

	public Text() {
		data = new LinkedList<Sentence>();
	}
	
	public void add(Sentence component){
		data.add(component);
	}

	public List<Sentence> getData() {
		return data;
	}

	public void setData(List<Sentence> data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		Text other = (Text) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Sentence sentence : data) {
			builder.append(sentence.toString()+" ");
		}
		return builder.toString().trim();
	}
}
