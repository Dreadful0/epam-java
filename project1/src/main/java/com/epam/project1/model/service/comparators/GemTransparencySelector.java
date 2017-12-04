package com.epam.project1.model.service.comparators;

import com.epam.project1.model.entities.Gemstone;
import com.epam.project1.model.service.GemTransparency;

public class GemTransparencySelector implements IGemSelector {

	private final GemTransparency from;
	private final GemTransparency to;

	public GemTransparencySelector(GemTransparency from, GemTransparency to) {
		this.from = from;
		this.to = to;
	}

	public boolean select(Gemstone gem) {
		if (gem.getTransparency().ordinal() >= from.ordinal()
				&& gem.getTransparency().ordinal() <= to.ordinal()) {
			return true;
		} else
			return false;
	}

}
