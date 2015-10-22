package com.string;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "vasu";
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
			if (entry.getValue() == 1) {
               System.out.println("First Non repeted "+entry.getKey());
               break;
			}

		}

	}
}
