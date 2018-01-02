package com.epam.lab7.task3.controllers;

import com.epam.lab7.task3.model.entities.RedBlackTree;
import com.epam.lab7.task3.view.Output;

public class MainMenuController {
	
	private static Output output = new Output();
	
	public MainMenuController() {
	}

	public void startMainMenu(){	
		RedBlackTree<Integer> tree = new RedBlackTree<>();
		RedBlackTree<Integer>.TreeVisualizer visualizer = tree.new TreeVisualizer();
		
		for (int i = 0; i < 11; i++) {
			tree.put(i);
			
			System.out.print("step: "+i+" Elements: ");
			for (Integer integer : tree) {
				System.out.print(""+integer+" ");
			}
			System.out.println();
			
			output.printTree(visualizer);
		}
		
		System.out.println("step: delete 10");
		tree.delete(10);
		output.printTree(visualizer);
	}
	
}
