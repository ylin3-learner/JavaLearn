package com.imooc;

import java.util.Scanner;
import java.lang.Math;

public class WeekDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please input number within 1 and 7 >");
//		
//		int n = sc.nextInt();
//		
//		switch(n % 7) {  switch(condition) {...}  --> condition 只能是整型(byte, int, short) 字符型char ; 新增了字符串型String
//			case 1:
//				System.out.print("Monday");
//				break;
//			case 2:
//				System.out.print("Tuesday");
//				break;
//			case 3:
//				System.out.print("Wednesday");
//				break;
//			case 4:
//				System.out.print("Thursday");
//				break;
//			case 5:
//				System.out.print("Friday");
//				break;
//			case 6:
//				System.out.print("Saturday");
//				break;
//			case 0:
//				System.out.print("Sunday");
//				break;
//		}
//		
//		System.out.print("\n");
//		
//		char index = 'a';
//		char index_2 = index;
//		while(index <= 'z') {
//			if (index - index_2 == 13) {
////				System.out.println();
//				System.out.print("\n");
//			}
//			
//			System.out.print( (index++) +" ");
//		}
//		
//		// Guessing Game: 1 - 10 numbers
//		int number = (int) (Math.random() * 10 + 1);
//		int guess;
//		System.out.println("Please input integers between 1 and 10!");
//		
//		do {
//			System.out.println("Please input your number>");
//			Scanner sc_guess = new Scanner(System.in);
//			guess = sc_guess.nextInt();
//			if (guess < number) {
//				System.out.println("Too small");
//			} else if (guess > number) {
//				System.out.println("Too big");
//			}
//		} while (guess != number);
//		
//		System.out.println("Correct! Correct answer is "+number);
//		
//		Scanner num_scanner = new Scanner(System.in);
//		int num_output;
//		while (true) {
//			System.out.println("Please input your echo>");
//			num_output = num_scanner.nextInt();
//			System.out.println(num_output);
//			
//			if (num_output == 10) {
//				System.out.println("Successfully exit echo()!");
//				break;
//			}
//		}
		
		int ge, shi, bai;
		//使用for循环
		for(int i=200; i <= 300; i++)
        {
			//取出百位数
		    bai = i / 100;
			//取出十位数
			shi = i / 10 % 10;
			//取出个位数
		    ge = i %10;
			//计算三个数字之积
            int multi = bai * shi * ge;
			//计算三个数字之和
			int sum = bai + shi + ge;
            //如果积等于42并且和为12，则将满足条件的数输出
            if (multi == 42 & sum == 12) {
                System.out.println(i);
            }
        }
		
		// 輸出10行10列的*
		int outer_index = 1;  // 外層循環的變量
		int inner_index = 1;  // 內層循環的變量
		
		System.out.println("Print out 10 * 10 's asteriks:");
		
		// control the number of rows of asterisk table
		while(outer_index <= 10) {
			
			// inner loop print out the number of asterisks of each rows
			inner_index = 1;  // initialize the inner_index to keep running inner_loop after first running (n == 5), jumping out of loop
			while(inner_index <= outer_index) {
				System.out.print('*');
				inner_index++;
			}
			System.out.println();
			++outer_index;
		}
		
		// 倒三角形星号从10到1
		for (int i = 10; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 求1! + 2! + 3! + ... + 10!
		// 1! = 1 * 1 ; 2! = 1 * 2;
		int s = 1, sum = 0;
		for (int i = 1; i <= 4; i++) {
			s = 1;  // reinitialize the value of s to prevent the previous result bringing to next result.
			for (int j = 1; j <= i; j++) {
				s = s * j; // s 存放階乘計算的結果
			}

			sum += s;
		}
		
		System.out.println("1! + 2! + 3! + 4! = "+sum);
		
		// 上底為3, 下底為11 的等腰梯形
		int row = 5;
		int width = 11;
		int midth = width / 2;
		for(int i=1; i <= row; i++) {
			for (int j=1; j <= width; j++) {
				if (j >= midth - i && j <= midth + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 1 + 3 + 5 + 7 + 9
		int sum_result = 0;
		for (int i=1; i <= 9; i++) {
			if (i %2 == 0) continue;
			// break -- 結束整個循環執行 ; continue -- 結束當前循環執行
			sum_result = sum_result + i;
		}
		System.out.println("sum_result="+sum_result);
		
//		// 求整型數組的累加和
//		int[] a = new int[5];
//		Scanner sc = new Scanner(System.in);
//		// 從鍵盤接收數據, 為數組元素賦值
//		for (int i=0; i < a.length; i++) {
//			System.out.println("Please input " + (i + 1) + " 個元素：");
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.println("數組元素的內容為：");
//		for (int i=0; i < a.length; i++) {
//			System.out.print(a[i] + "    ");
//		}
//		
//		// 求數組元素的累加和
//		int sumArray = 0;
//		for (int i=0; i < a.length; i++) {
//			sumArray += a[i];
//		}
//		
//		System.out.println("\n數組的累加和: "+sumArray);
		
		
		// 求數組元素的最大值
		int[] intArrayMax = {34, 23, 78, 6};
		int max = intArrayMax[0];
		
		for (int i=1; i < intArrayMax.length; i++) {
			if (max < intArrayMax[i] ) {
				max = intArrayMax[i];
			}
		}
		
		System.out.println("max="+max);
		
		// 增強型for循環 -- foreach loop ==> int arr[] = {1, 2, 3, 4, 5}; for(int n:arr) { System.out.println(n) } -> 遍歷arr, 放入n
		
		// bubbleSort - sort from small to large
		int[] bubbleSort = {34, 53, 12, 32, 56, 17};
		System.out.println("排序前的數組順序為:");
		for (int i:bubbleSort) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int temp;
		
		// outer_loop: 排序次數 -- (數組總數 - 1)
		for (int i=0; i < bubbleSort.length; i++) {
			// inner_loop: 控制每趟排序 => -i:  每趟排序都較上次少1, 並且第一次排序須排5次 ; - 1 最後一個元素已排序, 不需比較
			for (int j=0; j < bubbleSort.length - i - 1; j++) {
				if (bubbleSort[j] > bubbleSort[j+1]) {
					temp = bubbleSort[j];
					bubbleSort[j] = bubbleSort[j+1];
					bubbleSort[j+1] = temp;
				}
			}
		}
		
		System.out.println("從小到大排序後的結果為:");
		for(int n: bubbleSort) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		int[] SelectionSort = {1, 9, 7, 3, 5};
		for (int i = 0; i < SelectionSort.length; i++) {
			int min = i;

			for (int j = i + 1; j < SelectionSort.length; j++) {
				if (SelectionSort[j] < SelectionSort[min]) {
					min = j;
				}
			}
			
			if (i != min) {
				temp = SelectionSort[i];
				SelectionSort[i] = SelectionSort[min];
				SelectionSort[min] = temp;
			}
		}
	
		
		for(int n:SelectionSort) {
			System.out.print(n+" ");
		}
		
		// Declare 2-Dimensions array
		int[][] intArray;
		float floatArray[][];
		double[] doubleArray[];
		
		// create 3 rows * 3 cols of int arrays
		intArray = new int[3][3];
		System.out.println("\nthe second element of third row element:"+intArray[2][1]);
		
		floatArray = new float[3][];  // [3] 第一列
		// System.out.println(floatArray[0][0]);
		floatArray[0] = new float[3];
		System.out.println(floatArray[0][0]); 
		
		floatArray[1] = new float[4];
		floatArray[2] = new float[5];
		System.out.println(floatArray[0][0]); 
		
		int num[][] = {{1, 2, 3}, {4, 5}, {7, 8, 9, 10}};
		System.out.println("The second element in the first row: "+num[0][1]);
		System.out.println("num's cols: "+num.length);  
		System.out.println("num's rows: "+num[0].length);
		
		// print out the element of num
		for(int i=0; i < num.length; i++) {
			for(int j=0; j < num[i].length; j++) {
				System.out.print(num[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
