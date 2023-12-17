package com.begin.animal;

/**
 * 寵物貓類
 * @author user
 *
 */
public class Cat {
    // 成員屬性: 暱稱 null、年齡 0、體重 0.0、品種 null - 都有默認值
	
	// Encapsulation 封裝 - 1. 修改屬性為private -only visible in the current class
	private String name;
	private int age;
	private double weight;
	private String races;
	
	// static: 靜態屬性(類屬性) -1. 對象共用同一塊靜態記憶空間 2. 類加載時產生, 不再被使用時銷毀, 生命週期為整個類結束 3. 將被視為類的屬性, 訪問上可：1. 對象.成員 2. 類.成員
	// 推薦調用static 函數時, 使用：類.方法() -視為類方法
	// static + class --> 不存在 ; static + 方法內的局部變量 --> 不存在
	public static int price; // 售價 
	public int getAge() {
		return age;
	}
	
	{
		System.out.println("構造代碼塊!");
	} // 構造代碼塊 - 創建時調用、優先於構造方法執行，每次實例化都會執行一次
	
	static {
		System.out.println("構造代碼塊!");
	} // 靜態構造代碼塊 -類加載時調用、優先於構造代碼塊執行, 不論實例化多少個對象, 都只執行一次 
	
	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("輸入信息錯誤, 寵物貓的年齡必須大於0");
		} else {
			// this 代表當前對象的實例
			this.age = age;
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getRaces() {
		return races;
	}

	public void setRaces(String races) {
		this.races = races;
	}

	public Cat() {
		System.out.println("我是無參構造方法");
	}
	
	// 創建get/set 方法
	// 在get/set方法中添加對屬性的限定
	public void setName(String name) {
		// name = name; -- 為何不行? 因為Java 按照就近原則, 賦值給方法體參數, 在方法退出後name就會消失
		this.name = name;
	}
	
	public String getName() {
		return "我是一隻名叫" + this.name + "的寵物貓";
	}
	
	public Cat(int age) {
		// 構造方法 (construct method) 只能互相調用, 使用this()調用, 但只能放在方法體內第一行
		this();
		this.setAge(age);
		System.out.println("我是帶參構造方法");
	}
	

	// 方法: 跑、跳、叫、睡
	public  static void run() {
		// this.name = "小白";  // 靜態方法中不能使用this
		// sleep();  // 靜態方法中不能直接訪問同一個類中的非靜態成員, 只能直接調用同一個類中的靜態成員
		// 只能通過對象實例化後, 對象.方法() -> 訪問非靜態成員
		Cat temp = new Cat();
		temp.sleep();

		System.out.println("Kitty run");
	}
	
	// 在成員方法中, 可以直接訪問類中靜態成員
	public void sleep() {
		run();
		{
			System.out.println("我是代碼塊");
		}  // 普通代碼塊 -先出現先執行
		System.out.println("Kitty sleep");
	}
}
