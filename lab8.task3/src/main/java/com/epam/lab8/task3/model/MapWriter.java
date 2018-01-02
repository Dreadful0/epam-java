package com.epam.lab8.task3.model;

import java.util.Map;

public class MapWriter<K, V> implements Runnable {

	protected Map<K, V> map;
	protected K[] keys;
	protected V[] data;
	
	public MapWriter(Map<K, V> map, V[] data, K[] keys) {
		this.map = map;
		this.data = data;
		this.keys = keys;
	}

	public void run() {
		for (int i = 0; i < data.length; i++) {
			map.put(keys[i], data[i]);
		}
		
	}

}
