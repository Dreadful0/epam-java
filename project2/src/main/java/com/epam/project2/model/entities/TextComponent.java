package com.epam.project2.model.entities;

import java.util.LinkedList;
import java.util.List;

public abstract class TextComponent {

	private List<Symbol> data;

	public TextComponent() {
		data = new LinkedList<Symbol>();
	}
	
	public TextComponent(String str) {
		data = new LinkedList<Symbol>();
		for (char ch : str.toCharArray()) {
			data.add(new Symbol(ch));
		}
	}
	
	public void add(Symbol symbol){
		data.add(symbol);
	}

	public List<Symbol> getData() {
		return data;
	}

	public void setData(List<Symbol> data) {
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
		TextComponent other = (TextComponent) obj;
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
		//builder.append("|");
		for (Symbol symbol : data) {
			builder.append(symbol.toString());
		}
		//builder.append("|");
		return builder.toString();
	}
	
}
