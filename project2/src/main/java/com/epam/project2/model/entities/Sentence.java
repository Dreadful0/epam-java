package com.epam.project2.model.entities;

import java.util.LinkedList;
import java.util.List;

public class Sentence {
	
	private List<TextComponent> data;

	public Sentence() {
		data = new LinkedList<TextComponent>();
	}
	
	public void add(TextComponent component){
		data.add(component);
	}

	public List<TextComponent> getData() {
		return data;
	}

	public void setData(List<TextComponent> data) {
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
		Sentence other = (Sentence) obj;
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
		for (TextComponent textComponent : data) {
			if(!(textComponent instanceof Punctuation))builder.append(" ");
			builder.append(textComponent.toString());
		}
		return builder.toString().trim();
	}

}
