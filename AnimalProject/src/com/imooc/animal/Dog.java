package com.imooc.animal;

public class Dog extends Animal{
	private String sex; // �ʧO
	
	public Dog() {
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// ��ı����k
	public void sleep() {
		System.out.println(this.getName() + "���O�@��"+ this.getSpecies() + "�{�b" + this.getMonth() + "�Ӥ�j");
	}
	
	/**
	 * ��k�����G
	 * 1. �P�@������
	 * 2. ��k�W�ۦP�B�ѼƦC���P(�Ѽƶ��ǡB�����B�Ӽ�)
	 * 3. ��k��^�ȡB��k�X�ݭ׹��Ť�������
	 * 4. �P��k���ѼƦW�L��
	 */
	
	private String sleep(String name) {
		super.eat();
		return "";
	}
}
