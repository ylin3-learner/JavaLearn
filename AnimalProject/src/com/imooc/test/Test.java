package com.imooc.test;
import com.imooc.animal.Dog;
import com.imooc.animal.Cat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog one = new Dog();
		one.setName("Ms.��");
		one.setMonth(1);
		one.setSpecies("���h�_");
		
		one.eat();
		one.sleep();
		System.out.println("==================");
		Cat two = new Cat();
		two.setName("���");
		two.setSpecies("���إж��");
		
		two.eat();
		two.run();
	}

}
