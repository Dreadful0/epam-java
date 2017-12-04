package com.epam.project1.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.epam.project1.model.service.comparators.IGemSelector;

public abstract class Jewelry implements Serializable{
	
	private static final long serialVersionUID = -3329222273724511392L;
	
	private List<Gemstone> gems;

	public Jewelry() {
		gems = new ArrayList<Gemstone>();
	}

	public List<Gemstone> getGems() {
		return gems;
	}

	public void setGems(List<Gemstone> gems) {
		this.gems = gems;
	}
	
	public boolean addGem(Gemstone gem){
		return gems.add(gem);
	}
	
	public double getGemsWeight(){
		double weight = 0;
		for (Gemstone gemstone : gems) {
			weight += gemstone.getWeight();
		}
		return weight;
	}
	
	public double getGemsPrice(){
		double price = 0;
		for (Gemstone gemstone : gems) {
			price += gemstone.getGemPrice();
		}
		return price;
	}
	
	public void sortGems(Comparator<Gemstone> comparator){
		gems.sort(comparator);
	}
	
	public List<Gemstone> getGems(IGemSelector selector){
		List<Gemstone> result = new ArrayList<Gemstone>();
		for (Gemstone gemstone : gems) {
			if(selector.select(gemstone)){
				result.add(gemstone);
			}
		}
		return result;
	}
}
