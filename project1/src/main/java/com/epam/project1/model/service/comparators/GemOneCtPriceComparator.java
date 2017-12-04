package com.epam.project1.model.service.comparators;

import java.util.Comparator;

import com.epam.project1.model.entities.Gemstone;

import static com.epam.project1.service.ISettings.*;

public class GemOneCtPriceComparator implements Comparator<Gemstone> {

	public int compare(Gemstone arg0, Gemstone arg1) {
		double compare = arg0.getOneCtPrice() - arg1.getOneCtPrice();
		if(compare <= -PRICE_COMPARATION_E) return 1;
		if(compare >= PRICE_COMPARATION_E) return -1;
		return 0;
	}

}
