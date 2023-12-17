package com.imooc.test;

import com.imooc.animal.Animal;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal one = new Animal("花花", 2);
		Animal two = new Animal("花花", 2);
		
		/** equals 測試
		 *  1. equals 測試：繼承object中的equals方法時，比較的是兩個引用是否指向同一個對象
		 *  2. 子類可以通過重寫equals 方法的形式, 改變比較的內容
		 */
		boolean flag = one.equals(two);
		System.out.println("one 和 two 的比較：" + flag);
		System.out.println("one 和 two 的比較：" + (one == two));
		System.out.println("==============================");
		String str1 = new String("hello");
		String str2 = new String("hello");
		flag = str1.equals(str2);
		System.out.println("str1 和 str2 的比較：" + flag);
		System.out.println("str1 和 str2 的比較：" + (str1 == str2));
		System.out.println("==============================");
		
		/** toString 測試
		 *  1. 輸出對象名時, 默認會直接調用類中的toString
		 *  2. 繼承object中的toString時，輸出的是：類名信息 + @ + 地址信息
		 *  3. 子類可以通過重寫toString 方法的形式, 改變輸出的內容及表現型式
		 */
		System.out.println(one.toString());
		System.out.println(one);
		System.out.println("==============================");
		System.out.println(str1);
	}

}
