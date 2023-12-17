package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PetCatTest {

	public static void main(String[] args) {
		// Define PetCat Object
		PetCat huahua = new PetCat("花花", 12, "英國短毛貓");
		PetCat fanfan = new PetCat("凡凡", 10, "中華田園貓");
		
		// Put PetCat into HashSet
		Set<PetCat> set = new HashSet<PetCat>();
		set.add(huahua);
		set.add(fanfan);
		
		Iterator<PetCat> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 再添加一個與花花屬性相同的貓
		PetCat huahua01 = new PetCat("花花", 12, "英國短毛貓");
		set.add(huahua01);
		System.out.println("************************");
		System.out.println("Insert the repeated info: ");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 之前相同的數據不允許添加到集合阿?
		// 如果是自定義類, 則必須要重寫hashCode() 和 equals()
		
		// 重新插入一個新的info
		PetCat huahua02 = new PetCat("花花二代", 12, "英國短毛貓");
		set.add(huahua02);
		System.out.println("Insert the new info: ");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Search huahua info and print out
		System.out.println("***************");
		if (set.contains(huahua01)) {
			System.out.println("花花找到了");
			System.out.println(huahua01);
		} else {
			System.out.println("花花沒找到");
		}
		
		// Search huahua's name
		boolean flag = false;
		PetCat c = null;
		System.out.println("通過名字查找花花");
		while(it.hasNext()) {
			c = (PetCat) it.next();
			if (c.getName().equals("花花")) {
				flag = true; // 找到了
				break;		
			}
		}
		if (flag) {
			System.out.println("花花找到了!");
			System.out.println(c);
		} else {
			System.out.println("花花沒找到!");
		}
		
		// 刪除花花二代的信息並重新輸出  -- ConcurrentModificationException
		/**
		 * ConcurrentModificationException異常通常出現在使用增強for循環遍歷集合的同時，對集合中的元素進行了刪除導致的。
		 * for(PetCat cat: set) {
			if ("花花二代".equals(cat.getName()))	{
				set.remove(cat);
			}
		}
		 */
		
		/** 解決辦法：
		 *  聲明一個同類型的空集合，將滿足條件的元素添加到新集合中，然後將新集合覆蓋到原集合的變量中。
		 *  	變相的完成了篩選刪除的操作，並且不會觸發任何異常或者錯誤。
		 */
		HashSet<PetCat> temp = new HashSet<PetCat>();
		for(PetCat cat: set) {
			if ("花花二代" != cat.getName()) {
				temp.add(cat);
			}
		}
		
		set = temp;
		
		System.out.println("刪除花花二代後的數據：");
		for(PetCat cat: set) {
			System.out.println(cat);
		}
		
		// 刪除集合中所有寵物貓信息
		System.out.println("************************");
		boolean flag1 = set.removeAll(set);
		if(flag1) {
			System.out.println("貓都不見了!");
		} else
			System.out.println("貓還在!");
	}
			


}
