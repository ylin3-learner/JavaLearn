package com.imooc.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {
		public static void main(String[] args) {
			// Insert English vocs into Hashset
			// Insert vocs
			Set set = new HashSet();
			set.add("blue");
			set.add("red");
			set.add("black");
			set.add("yellow");
			
			// Print out
			System.out.println("Elements in set: ");
			Iterator it = set.iterator();
			
			// Iterate iterator
			while(it.hasNext()) {
				System.out.print(it.next()+" ,");
			}
			
			set.add("yellow");
			System.out.println();
			System.out.println("插入重複性元素後: ");
			it = set.iterator();
			while (it.hasNext()) {
				System.out.print(it.next()+" ,");
			}
			
			// Set in Java is same in Math. -- Insert failed, but no error
		}
}
