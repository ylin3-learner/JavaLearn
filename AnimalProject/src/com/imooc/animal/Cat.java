package com.imooc.animal;

public class Cat extends Animal{
	private double weight; // 體重
	public static int st3 = 44;
	
	static {
		System.out.println("我是子類的靜態代碼塊~");
	}
	
	{
		System.out.println("我是子類的構造代碼塊~");
	}
	
	public Cat() {
		System.out.println("我是子類的無參構造方法~");
	}
	
	public Cat(String weight,  int month) {
		// 子類構造 - 默認調用父類的無參構造方法
		// 如果執意調用父類其他有參構造方法, 使用super()
		// super() 必須放在子類構造方法中有效代碼第一行
		super(weight, month);  // 注意：與this對比 - this 關鍵字 和 super 都不能在靜態方法中使用
		// this(); -- 優先執行同一個類的無參構造方法 ; 而且super, this只能擇一, 因為都必須是first element in valid codes
		System.out.println("我是子類的有參構造方法~");
	}

	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// 跑動的方法
	public void run() {
		System.out.println(this.getName() + "是一隻" + this.getSpecies() + "在快樂地奔跑~~");
	}
}
