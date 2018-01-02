package com.epam.lab8.task2.controllers;

import com.epam.lab8.task2.model.entities.IntegerContainer;

public class MainMenuController {

	private volatile boolean canGenerate = true;
	private volatile boolean canPrint = false;
	private IntegerContainer counter = new IntegerContainer();

	public void startMainMenu() {

		new Thread(() -> {
			synchronized (counter) {
				while (counter.getData() < 1_000) {
					while (!canGenerate) {
						try {
							counter.wait();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					counter.increment();
					canGenerate = false;
					canPrint = true;
					counter.notify();
				}
			}

		}).start();

		new Thread(() -> {
			synchronized (counter) {
				while (counter.getData() < 1_000) {
					while (!canPrint) {
						try {
							counter.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					System.out.println(counter.getData());
					canPrint = false;
					canGenerate = true;
					counter.notify();

				}
			}

		}).start();

	}

}
