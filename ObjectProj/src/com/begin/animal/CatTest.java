package com.begin.animal; // 定義包 -必須放在第一行, 一個java文件只能有一個package語句
// 加載語句: import com.imooc.animal.*; -- 加載com.imooc.animal下所有類
// import com.imooc.animal.Cat 加載com.imooc.animal下的Cat類

// P.S: 如果類名相同, 則會無法辨識應加載哪個類. 這時在創建對象時, 就應該明確指定要創建的類. e.g. import com.imooc.mechanic.Cat
// com.imooc.mechanic.Cat cat = com.imooc.mechanic.Cat();

// import 包名.* 只能訪問指定包名下的類, 無法訪問子包下的類 (也就是說只能看到下一級的檔案, 但看不到下下級的.java文件在子包裡面)
public class CatTest {
	public static void main(String[] args) {
		// 對象實例化 = 聲明對象(Stack) Cat one + 實例化對象(heap) new Cat()
		// Basic type in stack: store literal value ; Derived type in stack: store address in heap point to heap
		// Cat one = new Cat(); Cat two = new Cat();  -- one, two 之間相互不影響
		// Cat one = new Cat(); Cat two = one;  -- one, two 指向同一地址
		
		// 直接加載 com.begin.animal.CatTest
		com.begin.animal.CatTest test = new com.begin.animal.CatTest();
		Cat one = new Cat();
		
		one.run();
		one.sleep();
		
		// 測試
		// one.name = "凡凡";
		one.setName("凡凡");
		one.setAge(-3);  // 年齡 - 應為正值, 但不加條件限制如-3 仍能輸出 --> Solution: Encapsulation 封裝
		//one.weight = 1200;
		// one.races = "中華田園貓";
		
		System.out.println("暱稱：" + one.getName());
//		System.out.println("年齡：" + one.getAge());
		if (one.getAge() == 0)
			return;
//		System.out.println("體重：" + one.weight);
//		System.out.println("品種：" + one.races);
	}
}
