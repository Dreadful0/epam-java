package com.epam.project1.view;

import java.util.List;

import com.epam.project1.model.entities.Gemstone;
import com.epam.project1.model.service.GemTransparency;
import com.epam.project1.model.service.GemType;
import com.epam.project1.service.ResourceManager;

import static com.epam.project1.service.ISettings.*;
import static com.epam.project1.view.IText.*;

public class Output {

	ResourceManager manager = ResourceManager.INSTANCE;

	public void printMainManu() {
		System.out.println(manager.getString(MAIN_MENU_TITLE));
		System.out.println(MAIN_MENU_ADD_GEM_NUMBER + ")"
				+ manager.getString(MAIN_MENU_ADD_GEM_STRING));
		System.out.println(MAIN_MENU_GEMS_WEIGHT_NUMBER + ")"
				+ manager.getString(MAIN_MENU_GEMS_WEIGHT_STRING));
		System.out.println(MAIN_MENU_GEMS_PRICE_NUMBER + ")"
				+ manager.getString(MAIN_MENU_GEMS_PRICE_STRING));
		System.out.println(MAIN_MENU_SORT_GEMS_NUMBER + ")"
				+ manager.getString(MAIN_MENU_SORT_GEMS_STRING));
		System.out.println(MAIN_MENU_SELECT_GEMS_NUMBER + ")"
				+ manager.getString(MAIN_MENU_SELECT_GEMS_STRING));
		System.out.println(MAIN_MENU_LOAD_FILE_NUMBER + ")"
				+ manager.getString(MAIN_MENU_LOAD_FILE_STRING));
		System.out.println(MAIN_MENU_SAVE_FILE_NUMBER + ")"
				+ manager.getString(MAIN_MENU_SAVE_FILE_STRING));
		System.out.println(MAIN_MENU_CHANGE_LANGUAGE_NUMBER + ")"
				+ manager.getString(MAIN_MENU_CHANGE_LANGUAGE_STRING));
		System.out.println(MAIN_MENU_EXIT_NUMBER + ")"
				+ manager.getString(MAIN_MENU_EXIT_STRING));
	}

	public void printSubMenu() {
		System.out.println(manager.getString(SUB_MENU_TITLE));
		System.out.println(manager.getString(SUB_MENU_BACK_STRING));
		System.out.println(MAIN_MENU_EXIT_NUMBER + ")"
				+ manager.getString(MAIN_MENU_EXIT_STRING));
	}

	public void printChangeLanguageMenu() {
		System.out.println(manager.getString(CHANGE_LANGUAGE_MENU_TITLE));
		System.out.println(CHANGE_LANGUAGE_MENU_ENGLISH_NUMBER + ")"
				+ manager.getString(CHANGE_LANGUAGE_MENU_ENGLISH));
		System.out.println(CHANGE_LANGUAGE_MENU_UKRAINIAN_NUMBER + ")"
				+ manager.getString(CHANGE_LANGUAGE_MENU_UKRAINIAN));
	}

	public void printGemTypeChooseMenu() {
		System.out.println(manager.getString(ADD_GEM_MENU_GEM_TYPE_STRING));
		for (GemType gemType : GemType.values()) {
			System.out.println("" + (gemType.ordinal() + 1) + ") "
					+ gemType.name());
		}
	}

	public void printGemTransparencyChooseMenu() {
		System.out.println(manager
				.getString(ADD_GEM_MENU_GEM_TRANSPARENCY_STRING));
		for (GemTransparency gemTrans : GemTransparency.values()) {
			System.out.println("" + (gemTrans.ordinal() + 1) + ") "
					+ gemTrans.name());
		}
	}

	public void clearOut() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public void printGemsWeight(double weight) {
		System.out.println(manager
				.getString(GEMS_WEIGHT_MENU_GEMS_WEIGHT_STRING)
				+ " "
				+ String.format("%.2f", weight)
				+ " "
				+ manager.getString(GEMS_WEIGHT_MENU_MEASURE_STRING));
	}

	public void printGemsPrice(double price) {
		System.out.println(manager.getString(GEMS_PRICE_MENU_GEMS_PRICE_STRING)
				+ " "
				+ String.format("%.2f", (price * Double.parseDouble(manager
						.getString(GEMS_PRICE_MENU_MULTIPLIER_STRING)))) + " "
				+ manager.getString(GEMS_PRICE_MENU_MEASURE_STRING));
	}

	public void printGems(List<Gemstone> gems) {
		if (gems.isEmpty()) {
			System.out.println(manager.getString(PROGRAM_NO_DATA_STRING));
			return;
		}
		System.out.println(manager.getString(PROGRAM_DELIMETER));
		for (Gemstone gemstone : gems) {
			System.out.println(gemstone);
		}
		System.out.println(manager.getString(PROGRAM_DELIMETER));
	}

	public void printString(String str) {
		System.out.println(manager.getString(str));
	}
}
