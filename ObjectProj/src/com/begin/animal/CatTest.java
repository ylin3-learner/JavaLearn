package com.begin.animal; // �w�q�] -������b�Ĥ@��, �@��java���u�঳�@��package�y�y
// �[���y�y: import com.imooc.animal.*; -- �[��com.imooc.animal�U�Ҧ���
// import com.imooc.animal.Cat �[��com.imooc.animal�U��Cat��

// P.S: �p�G���W�ۦP, �h�|�L�k�������[��������. �o�ɦb�Ыع�H��, �N���ө��T���w�n�Ыت���. e.g. import com.imooc.mechanic.Cat
// com.imooc.mechanic.Cat cat = com.imooc.mechanic.Cat();

// import �]�W.* �u��X�ݫ��w�]�W�U����, �L�k�X�ݤl�]�U���� (�]�N�O���u��ݨ�U�@�Ū��ɮ�, ���ݤ���U�U�Ū�.java���b�l�]�̭�)
public class CatTest {
	public static void main(String[] args) {
		// ��H��Ҥ� = �n����H(Stack) Cat one + ��Ҥƹ�H(heap) new Cat()
		// Basic type in stack: store literal value ; Derived type in stack: store address in heap point to heap
		// Cat one = new Cat(); Cat two = new Cat();  -- one, two �����ۤ����v�T
		// Cat one = new Cat(); Cat two = one;  -- one, two ���V�P�@�a�}
		
		// �����[�� com.begin.animal.CatTest
		com.begin.animal.CatTest test = new com.begin.animal.CatTest();
		Cat one = new Cat();
		
		one.run();
		one.sleep();
		
		// ����
		// one.name = "�Z�Z";
		one.setName("�Z�Z");
		one.setAge(-3);  // �~�� - ��������, �����[���󭭨�p-3 �����X --> Solution: Encapsulation �ʸ�
		//one.weight = 1200;
		// one.races = "���إж��";
		
		System.out.println("�ʺ١G" + one.getName());
//		System.out.println("�~�֡G" + one.getAge());
		if (one.getAge() == 0)
			return;
//		System.out.println("�魫�G" + one.weight);
//		System.out.println("�~�ءG" + one.races);
	}
}
