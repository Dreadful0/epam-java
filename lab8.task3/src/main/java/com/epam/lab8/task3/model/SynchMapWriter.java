package com.epam.lab8.task3.model;

import java.util.Map;

public class SynchMapWriter<K, V> extends MapWriter<K, V> {

	public SynchMapWriter(Map<K, V> map, V[] data, K[] keys) {
		super(map, data, keys);
	}

	@Override
	public void run() {
		for (int i = 0; i < data.length; i++) {
			synchronized (map) {
				map.put(keys[i], data[i]);
			}
		}
		
	}
}
