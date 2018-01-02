package com.epam.lab8.task3.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.epam.lab8.task3.model.MapReader;
import com.epam.lab8.task3.model.MapWriter;
import com.epam.lab8.task3.model.SynchMapWriter;

public class MainMenuController {

	private String[] values = new String[100];
	private Integer[] keys = new Integer[100];
	private Map<Integer, String> concMap = new ConcurrentHashMap<>();
	private Map<Integer, String> hashMap = new HashMap<>();

	public void startMainMenu() {
		for (int i = 0; i < values.length; i++) {
			keys[i] = i;
			values[i] = "" + i;
		}
		Thread[] writers = new Thread[5];
		Thread[] readers = new Thread[5];
		
		long timeStart = System.nanoTime();
		
		for (int i = 0; i < 5; i++) {
			writers[i] = new Thread(new MapWriter<Integer, String>(concMap,
					Arrays.copyOfRange(values, i * values.length / 5, (i + 1)* values.length / 5),
					Arrays.copyOfRange(keys, i * keys.length / 5, (i + 1) * keys.length / 5)));
			writers[i].start();
		}
		
		for (int i = 0; i < 5; i++) {
			readers[i] = new Thread(new MapReader<Integer, String>(concMap, 100));
			readers[i].start();
		}
		
		try {
			for (Thread thread : writers) {
				thread.join();
			}
			for (Thread thread : readers) {
				thread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long timeEnd = System.nanoTime();
		
		System.out.println("ConcurrentHashMap: "+(timeEnd-timeStart));
		MapReader.flushCounter();
		
		timeStart = System.nanoTime();
		
		for (int i = 0; i < 5; i++) {
			writers[i] = new Thread(new SynchMapWriter<Integer, String>(hashMap,
					Arrays.copyOfRange(values, i * values.length / 5, (i + 1)* values.length / 5),
					Arrays.copyOfRange(keys, i * keys.length / 5, (i + 1) * keys.length / 5)));
			writers[i].start();
		}
		
		for (int i = 0; i < 5; i++) {
			readers[i] = new Thread(new MapReader<Integer, String>(hashMap, 100));
			readers[i].start();
		}
		
		try {
			for (Thread thread : writers) {
				thread.join();
			}
			for (Thread thread : readers) {
				thread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		timeEnd = System.nanoTime();
		
		System.out.println("HashMap: "+(timeEnd-timeStart));
	}

}
