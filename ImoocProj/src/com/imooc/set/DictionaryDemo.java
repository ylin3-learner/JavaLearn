package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {

	public static void main(String[] args) {
		Map <String, String> animal = new HashMap <String, String>();
		System.out.println("Please input three vocabularies' notations inside the HashMap");
		Scanner console = new Scanner(System.in);
		// Insert Info
		int i = 0;
		while(i < 3) {
			System.out.println("Please input key (Voc):");
			String key = console.next();
			System.out.println("Please input key (Notation):");
			String value = console.next();
			animal.put(key, value);
			i++;
		}
		// Print out value
		System.out.println("****************");
		System.out.println("Use Iterator to print out: ");
		Iterator <String> it = animal.values().iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("****************");
		// Print out key, value -- <key, value> -> entry -> entrySet()
		System.out.println("Use entry set to get key - value");
		Set<Entry<String, String>> entrySet = animal.entrySet();
		for (Entry<String, String> entry: entrySet) {
			System.out.print(entry.getKey()+'-');
			System.out.println(entry.getValue());
		}
		
		// Use vocs to search set entry and print out -- keySet()
		System.out.println("****************");
		System.out.println("Please input the voc you wanna search: ");
		String strSearch = console.next();
		// Get keySet()
		Set <String> keySet = animal.keySet();
		// Iterate keySet
		for(String key:keySet) {
			if (strSearch.equals(key)) {
				System.out.println("KeySet: " + key + '-' + animal.get(key));
			}
		}
	}

}
