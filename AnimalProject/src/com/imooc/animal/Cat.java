package com.imooc.animal;

public class Cat extends Animal{
	private double weight; // �魫
	public static int st3 = 44;
	
	static {
		System.out.println("�ڬO�l�����R�A�N�X��~");
	}
	
	{
		System.out.println("�ڬO�l�����c�y�N�X��~");
	}
	
	public Cat() {
		System.out.println("�ڬO�l�����L�Ѻc�y��k~");
	}
	
	public Cat(String weight,  int month) {
		// �l���c�y - �q�{�եΤ������L�Ѻc�y��k
		// �p�G���N�եΤ�����L���Ѻc�y��k, �ϥ�super()
		// super() ������b�l���c�y��k�����ĥN�X�Ĥ@��
		super(weight, month);  // �`�N�G�Pthis��� - this ����r �M super ������b�R�A��k���ϥ�
		// this(); -- �u������P�@�������L�Ѻc�y��k ; �ӥBsuper, this�u��ܤ@, �]���������Ofirst element in valid codes
		System.out.println("�ڬO�l�������Ѻc�y��k~");
	}

	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// �]�ʪ���k
	public void run() {
		System.out.println(this.getName() + "�O�@��" + this.getSpecies() + "�b�ּ֦a�b�]~~");
	}
}
