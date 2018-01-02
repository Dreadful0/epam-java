package com.epam.lab8.task1.controllers;

public class MainMenuController {

	public void startMainMenu() {

		new Thread(() -> {

			for (int i = 10; i > 0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Boom!");

		}).start();

	}

}
