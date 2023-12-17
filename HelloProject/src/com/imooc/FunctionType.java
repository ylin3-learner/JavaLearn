package com.imooc;

import java.util.Arrays;

public class FunctionType {
	// Τ把计: 癸莱ㄧ计场giver 跑て
	// Τ: 惠璶ㄧ计挡狦秈˙矪瞶
	// よ猭更: ㄧ计, 把计ぃ
	// 跑把计: varargs_list ﹚琌把计程, よ猭柑Τ跑把计

	// Sum
	public void sum(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		System.out.println("sum= " + sum);
	}
	
	// searchArray
	public void searchVarList(int n, int... a) {
//		boolean flag = false;
//		for(int i:a) {
//			flag = i == n ? true : flag;
//		}
//		if (flag) {
//			System.out.println("Τт "+n);
//		} else {
//			System.out.println("⊿т!");
//		}
		int index = Arrays.binarySearch(a, n);
	    if (index >= 0) {
	        System.out.println("Τт " + n);
	    } else {
	        System.out.println("⊿т!");
	    }
	}
	
	// Search the element of an array
	public boolean searchArray(int num, int[] array) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			flag = array[i] == num ? true : false;
		}
		return flag;
	}

	// Array as function parameter -print out its element
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// ―n! -> ―5!
	public int factorial(int n) {
		// Use recursion;
//		int res;

//		if (n <= 1) {
//			res = 1;
//		} else {
//			res = n * factorial(n - 1);
//		}

		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

	// ―ㄢfloat摸程 -Τ把, 礚
	public void floatCmp(float first, float second) {
		float max = first > second ? first : second;
		System.out.println("The bigger float is: " + max);
	}

	// ―よ縩よ猭 -礚把, Τ
	public double rectangleArea() {
		float length = 5;
		double width = 5.3;
		double getArea = length * width;
		return getArea; // return statement
	}

	// ゴ块琍腹よ猭 -- 礚把, 礚 (礚璸衡)
	// ! 猔種: よ猭璶摸ず场﹚竡
	public void printStar() {
		System.out.println("***********************");
	}

	public static void main(String[] args) {
		// Create a class called "FunctionType" and its object "myfunction"
		FunctionType myfunction = new FunctionType();

		// Use method by writing --> object.function()
		myfunction.printStar();
		System.out.println("舧ㄓJava!");
		myfunction.printStar();

		FunctionType myArea = new FunctionType();
		System.out.println("Rectangle's area: " + myArea.rectangleArea());

		FunctionType bigFloat = new FunctionType(); // create object of FunctionType
		bigFloat.floatCmp(10.51f, 10.5f);

		FunctionType myFactorial = new FunctionType();
		System.out.println("myFactorial: " + myFactorial.factorial(5));

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int fact = myFactorial.factorial(i);
			sum += fact;
		}
		System.out.println("Sum of myFactorial: " + sum);

		FunctionType myArray = new FunctionType();
		int[] array = { 1, 2, 3, 4 };
		myArray.printArray(array);

		FunctionType flag = new FunctionType();
		System.out.println("Τт盾? " + flag.searchArray(60, array));

		FunctionType mySum = new FunctionType();
		mySum.sum(1, 2, 3, 4, 5);
		FunctionType myVarList = new FunctionType();
		myVarList.searchVarList(4, array);
		myVarList.searchVarList(4, 1, 2, 3, 4, 5);
	}
}
