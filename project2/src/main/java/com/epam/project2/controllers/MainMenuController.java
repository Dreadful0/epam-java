package com.epam.project2.controllers;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.epam.project2.model.entities.Sentence;
import com.epam.project2.model.entities.Text;
import com.epam.project2.model.entities.TextComponent;
import com.epam.project2.model.entities.Word;
import com.epam.project2.service.TextParser;
import com.epam.project2.view.Output;

public class MainMenuController {
	
	static Logger logger = Logger.getLogger(MainMenuController.class);
	
	private static InputController input = new InputController();
	private static Output output = new Output();

	public void startMainMenu() {
		output.printString("Please, input the text file path: ");
		String path = input.getFilePath();

		Text text = TextParser.parseText(FileController.getData(path).toLowerCase());
		output.printWords(sortWords(text));
	}
	
	private HashMap<Character, Sentence> sortWords(Text text){
		HashMap<Character, Sentence> result = new HashMap<Character, Sentence>();
		for (Sentence sentence : text.getData()) {
			for (TextComponent textComp : sentence.getData()) {
				if(textComp instanceof Word){
					Word word = (Word) textComp;
					if(!result.containsKey(word.getFirstLetter())){
						Sentence wordsContainer = new Sentence();
						wordsContainer.add(word);
						result.put(word.getFirstLetter(), wordsContainer);
					} else {
						result.get(word.getFirstLetter()).add(word);
					}
				}
			}
		}	
		return result;	
	}
}
