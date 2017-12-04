package com.epam.project1.controllers;

import java.util.Locale;

import org.apache.log4j.Logger;

import com.epam.project1.model.entities.Gemstone;
import com.epam.project1.model.entities.Necklace;
import com.epam.project1.model.service.GemTransparency;
import com.epam.project1.model.service.GemType;
import com.epam.project1.model.service.comparators.GemOneCtPriceComparator;
import com.epam.project1.model.service.comparators.GemTransparencySelector;
import com.epam.project1.service.ResourceManager;
import com.epam.project1.view.Output;

import static com.epam.project1.service.ISettings.*;
import static com.epam.project1.view.IText.*;

public class MainMenuController {
	
	static Logger logger = Logger.getLogger(MainMenuController.class);
	
	private static Output output = new Output();
	private static InputController input = new InputController();

	private Necklace necklace = new Necklace(55);
	private Integer choosen = null;
	
	public void startMainMenu(){

		do {
			prepareMainMenu();			
			switch (choosen) {
			case MAIN_MENU_ADD_GEM_NUMBER:
				addGem();
				break;
			case MAIN_MENU_GEMS_WEIGHT_NUMBER:
				gemsWeight();
				break;
			case MAIN_MENU_GEMS_PRICE_NUMBER:
				gemsPrice();
				break;
			case MAIN_MENU_SORT_GEMS_NUMBER:
				sortGems();
				break;
			case MAIN_MENU_SELECT_GEMS_NUMBER:
				selectGems();
				break;
			case MAIN_MENU_LOAD_FILE_NUMBER:
				loadFile();
				break;
			case MAIN_MENU_SAVE_FILE_NUMBER:
				saveFile();
				break;
			case MAIN_MENU_CHANGE_LANGUAGE_NUMBER:
				changeLanguage();
				break;
			default:
				break;
			}
		} while (choosen != MAIN_MENU_EXIT_NUMBER);
	}
	
	private void prepareMainMenu(){
		output.clearOut();
		output.printGems(necklace.getGems());
		output.printMainManu();
		choosen = input.getInteger();
	}
	
	private void saveFile() {
		output.printString(SAVE_MENU_SAVE_STRING);
		String filename = input.getString();
		if(FileController.saveFile(necklace, filename)){
			output.printString(SAVE_MENU_SAVE_SUCCESS_STRING);
		} else {
			output.printString(SAVE_MENU_SAVE_FAIL_STRING);
		}
		output.printSubMenu();
		choosen = input.getInteger();
	}

	private void loadFile() {
		output.printString(SAVE_MENU_LOAD_STRING);
		String filename = input.getString();
		Necklace loaded = FileController.readFile(filename);
		if(loaded != null){
			this.necklace = loaded;
			output.printString(SAVE_MENU_LOAD_SUCCESS_STRING);
		} else {
			output.printString(SAVE_MENU_LOAD_FAIL_STRING);
		}		
		output.printSubMenu();
		choosen = input.getInteger();
		
	}

	private void selectGems() {
		output.printString(GEMS_SELECT_MENU_GEMS_SELECT_STRING);
		
		output.printGemTransparencyChooseMenu();
		choosen = input.getInteger();
		GemTransparency from = GemTransparency.values()[choosen-1];
		
		output.printGemTransparencyChooseMenu();
		choosen = input.getInteger();
		GemTransparency to = GemTransparency.values()[choosen-1];
		
		output.printGems(necklace.getGems(new GemTransparencySelector(from, to)));
		output.printSubMenu();
		choosen = input.getInteger();
	}

	private void sortGems() {
		necklace.sortGems(new GemOneCtPriceComparator());
	}

	private void gemsPrice() {
		output.printGemsPrice(necklace.getGemsPrice());
		output.printSubMenu();
		choosen = input.getInteger();
	}
	
	private void addGem(){
		try {
			output.printString(ADD_GEM_MENU_TITLE);
			
			output.printGemTypeChooseMenu();
			choosen = input.getInteger();
			GemType type = GemType.values()[choosen-1];
			
			output.printString(ADD_GEM_MENU_GEM_WEIGHT_STRING);
			double weight = input.getDouble();
			
			output.printString(ADD_GEM_MENU_GEM_PRICE_STRING);
			double price = input.getDouble();
			
			output.printGemTransparencyChooseMenu();
			choosen = input.getInteger();
			GemTransparency trans = GemTransparency.values()[choosen-1];
			
			necklace.addGem(new Gemstone(type, weight, price, trans));
			output.printString(ADD_GEM_MENU_SUCCESS_STRING);
		} catch (Exception e) {
			logger.error("Adding new gemstone error", e);
			output.printString(ADD_GEM_MENU_FAIL_STRING);
		}		
		output.printSubMenu();
		choosen = input.getInteger();
	}
	
	private void gemsWeight(){
		output.printGemsWeight(necklace.getGemsWeight());
		output.printSubMenu();
		choosen = input.getInteger();
	}
	
	private void changeLanguage(){
		ResourceManager manager = ResourceManager.INSTANCE;
		output.printChangeLanguageMenu();
		choosen = input.getInteger();
		switch (choosen) {
		case CHANGE_LANGUAGE_MENU_ENGLISH_NUMBER:
			manager.changeResource(Locale.ENGLISH);
			break;
		case CHANGE_LANGUAGE_MENU_UKRAINIAN_NUMBER:
			manager.changeResource(new Locale("uk"));
			break;
		default:
			break;
		}
	}
}
