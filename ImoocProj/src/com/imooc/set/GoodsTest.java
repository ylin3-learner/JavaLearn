package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id - one and only -> String key
		Map <String, Goods> goodsMap = new HashMap <String, Goods>();
		System.out.println("Please input three goods info:");
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3) {
			System.out.println("Please input number " + (i+1) +" info");
			System.out.println("Please input goods id:");
			String goodsId = console.next();
			// Test if goodsId already exit
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("The input id has already existed !");
				continue;  // exit the current loop into next loop  -- break: exit all the loop
			}
			System.out.println("Please input goods name:");
			String goodsName = console.next();
			System.out.println("Please input goods price:");
			
			double goodsPrice = 0;
			try {
				goodsPrice = console.nextDouble();
			} catch(java.util.InputMismatchException e) {
				System.out.println("Unvalid Goods Price, please input numeral data !");
				console.next();
				continue;
			}
			
			Goods goods = new Goods(goodsId, goodsName, goodsPrice);
			// Add goods info into goodsMap
			goodsMap.put(goodsId, goods);
			i ++;
		}
		// Iterate Map and print out goods info
		System.out.println("All goods info: ");
		Iterator <Goods> iterator = goodsMap.values().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
