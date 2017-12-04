package com.epam.project1.model.service;

import static com.epam.project1.model.service.GemDistinction.*;

public enum GemType {
	DIAMOND(PRECIOUS),
	RUBY(PRECIOUS),
	SAPPHIRE(PRECIOUS),
	EMERALD(PRECIOUS),
	QUARTZ(SEMI_PRECIOUS),
	MALACHITE(SEMI_PRECIOUS),
	AMETHYST(SEMI_PRECIOUS),
	LAPIS_LAZULI(SEMI_PRECIOUS);
	
	private GemDistinction distinction;

	private GemType(GemDistinction distinction) {
		this.distinction = distinction;
	}

	public GemDistinction getDistinction() {
		return distinction;
	}
	
}
