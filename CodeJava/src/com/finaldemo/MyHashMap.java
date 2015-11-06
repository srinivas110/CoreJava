package com.finaldemo;

import java.util.HashMap;

public class MyHashMap<K, V> extends HashMap<K, V>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyHashMap(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		if(size()==2){
			throw new IllegalStateException("size exceds");
		}
		return super.put(key, value);
	}

}
