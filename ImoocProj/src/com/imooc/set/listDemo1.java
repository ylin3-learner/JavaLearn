package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
		// Use ArrayList to store names of programming language & print 
		public static void main(String[] args) {
			List list = new ArrayList();
			list.add("Java");
			list.add("C");
			list.add("C++");
			list.add("Go");
			list.add("Swift");
			// Print out the number of elements
			System.out.println("The number of elements in List: " + list.size());
			System.out.println("********************");
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+",");	
			}
			System.out.println();
			// Remove C++ from list
			list.remove("C++");
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+",");
			}
		}

		
}
