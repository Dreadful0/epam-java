package com.epam.lab8.task3.model;

import java.util.Map;

public class MapReader<K, V> implements Runnable{

	private Map<K, V> map;
	private int toRead;
	private static volatile int counter;
	
	public MapReader(Map<K, V> map, int toRead) {
		this.map = map;
		this.toRead = toRead;
	}

	public void run() {
		while (counter<toRead) {
			read();
		}	
	}
	
	public static void flushCounter(){
		counter = 0;
	}
	
	private void read(){
		synchronized (map) {
			if(map.keySet().iterator().hasNext()){
				K key = map.keySet().iterator().next();
				//System.out.println(Thread.currentThread().getName()+" "+ map.remove(key).toString());
				counter ++;
			}
		}
	}

}
