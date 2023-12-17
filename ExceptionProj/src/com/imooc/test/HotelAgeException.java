package com.imooc.test;

public class HotelAgeException extends Exception {
	public HotelAgeException() {
		super("Aged below 18, or up 80 check in with company");
	}
}
