package com.imooc.set;

public class Goods {
		private String id;  // 商品編號
		private String name;  // 商品名稱
		private double price;  // 商品價格
		
		public Goods(String id, String name, double price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
		
		// Getter, Setter
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		public String toString() {
			return "商品編號：" + id + " ,商品名稱：" + name + " ,商品價格：" + price;
		}
		
}
