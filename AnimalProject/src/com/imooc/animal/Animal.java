package com.imooc.animal;

public class Animal {
	// final: 在class 前設置final表示不允許有子類繼承, 方法被重寫(但可以被使用) - final public / public final
	/**
	 * final 加在變量前 
	 * final 只能約束 變量 這個參照不會被重新賦值 (reassign)
	 * 但是 變量 物件本身的行為不會受到 final 影響
	 * 加入/刪除元素等操作還是可以正常執行的, 這樣就不是 immutable 了. 
	 * 如果你真的希望達到 immutable 的效果, 則需要相應的類別也支持 immutable 行為才可以
	 * 
	 * 賦值位置：1. 定義直接初始化 2. 構造方法 3. 構造代碼塊
	 */
	
	/**
	 * private: 只允許在本類中進行訪問 - 實現類型當中的封裝, 達到數據安全性
	 * public: 允許在任意位置訪問
	 * protected: 允許在同類中、同包子類、跨包子類 ; 不允許在跨包非子類 (非親非故)
	 * 默認：允許在當前類內、同包(package)子類/ 非子類內 ; 不允許跨包調用
	 */
	
	private String name = "動物名"; // 暱稱
	private int month = 2; // 月份
	private String species = "動物品種"; // 品種
	public int temp = 15;
	private double weight;
	
	private static int st1 = 22;
	public static int st2 = 18;
	
	static {
		System.out.println("我是父類的靜態代碼塊~");
	}
	
	{
		System.out.println("我是父類的構造代碼塊~");
	}
	// construct method without vars
	// 父類的構造方法不允許被繼承、不允許被重寫 - 但是會影響子類的實例化過程
	public Animal() {
		System.out.println("我是父類的無參構造方法~");
	}
	
	public Animal(String name,  int month) {
		this.name = name;
		this.month = month;
		System.out.println("我是父類的有參構造方法~");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	// 吃東西
	public void eat() {
		System.out.println(this.getName() + "在吃東西");
	}
	
	// Override Object.equals
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Animal temp = (Animal) obj;
		//  if語句中，為什麼第一個表達式用到 equals 而第二個用到 == 呢？
		/*
		 * if語句中，實現的是分別針對name和month的值進行比較。
		 * 1. name屬性是String類型，因此推薦用equals比較兩個字元串的值是否相等
		 * 2. month屬性是 int 類型，更推薦用==比較兩個整數值是否
		 * 相等。
         */
		// 對於基本數據類型而言，沒有equals方法，因此不能兩處都用equals；
		if(this.getName().equals(temp.getName()) && (this.getMonth() == temp.getMonth()))
			return true;
		else
			return false;
	}
	
	/**
	 *  // 如果比較的是同一個對象，則直接返回true，因為相同對象肯定相等（即內存地址相同）
	 * if (this == obj) {
            return true;
        }
        
        // 如果比較的對象為null，或者兩個對象的類不同（即不是同一種類型），則返回false
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        // 將傳入的obj對象強制類型轉換為Fruits類，然後進行屬性的比較, 通過比較shape和taste屬性是否相等來判斷兩個Fruits對象是否相等
        Fruits fruits = (Fruits) obj;
        
        // 使用Objects類的equals方法比較shape和taste屬性是否相等，如果都相等則返回true，否則返回false
        return Objects.equals(shape, fruits.shape) && Objects.equals(taste, fruits.taste);
	 * @param obj
	 * @return boolean
	 */
	
	// Overload Animal.equals
	public boolean equals(Animal obj) {
		if (obj == null)
			return false;
		if(this.getName().equals(obj.getName()) && (this.getMonth() == obj.getMonth()))
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "NickName: " + this.getName() + ", Age: " + this.getMonth();
	}
}
