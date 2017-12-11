package com.epam.lab7.task3.view;

import com.epam.lab7.task3.model.entities.RedBlackTree;

public class Output {

	public void printString(String str){
		System.out.println(str);
	}
	
	public void printTree(RedBlackTree<?>.TreeVisualizer visualizer){
		System.out.println();
		visualizer.drawInConsole();
		System.out.println();
	}
	
}
