package com.imooc.test;

public class TryDemoThree {
	
	public static void main(String[] args) {
		try {
			testThree();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testOne() throws HotelAgeException{
		throw new HotelAgeException();
	}
	
	public static void testTwo() throws Exception {
		try {
			testOne();
		} catch (HotelAgeException e) {
			throw new Exception("New Exception 1", e);
		}
	}
	
	public static void testThree() throws Exception {
		try {
			testTwo();
		} catch (HotelAgeException e) {
			Exception e1 = new Exception("New Exception 2");
			e1.initCause(e);
			throw e1;
//			throw new Exception("New Exception 2");
		}
	}
}
