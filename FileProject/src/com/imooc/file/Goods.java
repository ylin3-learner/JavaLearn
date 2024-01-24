package com.imooc.file;

import java.io.Serializable;

public class Goods implements Comparable<Goods>, Serializable {

	@Override
	public int compareTo(Goods arg0) {
		// ���X�ӫ~����
		double price1 = this.getPrice();
		double price2 = arg0.getPrice();
		int n = new Double(price2-price1).intValue();
		return n;
	}
	
	private String id;  // �ӫ~�s��
	private String name;  // �ӫ~�W��
	private double price;  // �ӫ~����
	
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
		return "�ӫ~�s���G" + id + " ,�ӫ~�W�١G" + name + " ,�ӫ~����G" + price;
	}
}
