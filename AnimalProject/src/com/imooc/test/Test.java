package com.imooc.test;
import com.imooc.animal.Dog;
import com.imooc.animal.Cat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog one = new Dog();
		one.setName("Ms.楊");
		one.setMonth(1);
		one.setSpecies("哈士奇");
		
		one.eat();
		one.sleep();
		System.out.println("==================");
		Cat two = new Cat();
		two.setName("花花");
		two.setSpecies("中華田園貓");
		
		two.eat();
		two.run();
	}

}
