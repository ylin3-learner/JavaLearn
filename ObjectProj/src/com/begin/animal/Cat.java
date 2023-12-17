package com.begin.animal;

/**
 * �d������
 * @author user
 *
 */
public class Cat {
    // �����ݩ�: �ʺ� null�B�~�� 0�B�魫 0.0�B�~�� null - �����q�{��
	
	// Encapsulation �ʸ� - 1. �ק��ݩʬ�private -only visible in the current class
	private String name;
	private int age;
	private double weight;
	private String races;
	
	// static: �R�A�ݩ�(���ݩ�) -1. ��H�@�ΦP�@���R�A�O�ЪŶ� 2. ���[���ɲ���, ���A�Q�ϥήɾP��, �ͩR�g������������� 3. �N�Q���������ݩ�, �X�ݤW�i�G1. ��H.���� 2. ��.����
	// ���˽ե�static ��Ʈ�, �ϥΡG��.��k() -��������k
	// static + class --> ���s�b ; static + ��k���������ܶq --> ���s�b
	public static int price; // ��� 
	public int getAge() {
		return age;
	}
	
	{
		System.out.println("�c�y�N�X��!");
	} // �c�y�N�X�� - �ЫخɽեΡB�u����c�y��k����A�C����ҤƳ��|����@��
	
	static {
		System.out.println("�c�y�N�X��!");
	} // �R�A�c�y�N�X�� -���[���ɽեΡB�u����c�y�N�X������, ���׹�ҤƦh�֭ӹ�H, ���u����@�� 
	
	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("��J�H�����~, �d���ߪ��~�֥����j��0");
		} else {
			// this �N���e��H�����
			this.age = age;
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getRaces() {
		return races;
	}

	public void setRaces(String races) {
		this.races = races;
	}

	public Cat() {
		System.out.println("�ڬO�L�Ѻc�y��k");
	}
	
	// �Ы�get/set ��k
	// �bget/set��k���K�[���ݩʪ����w
	public void setName(String name) {
		// name = name; -- ���󤣦�? �]��Java ���ӴN���h, ��ȵ���k��Ѽ�, �b��k�h�X��name�N�|����
		this.name = name;
	}
	
	public String getName() {
		return "�ڬO�@���W�s" + this.name + "���d����";
	}
	
	public Cat(int age) {
		// �c�y��k (construct method) �u�ब�۽ե�, �ϥ�this()�ե�, ���u���b��k�餺�Ĥ@��
		this();
		this.setAge(age);
		System.out.println("�ڬO�a�Ѻc�y��k");
	}
	

	// ��k: �]�B���B�s�B��
	public  static void run() {
		// this.name = "�p��";  // �R�A��k������ϥ�this
		// sleep();  // �R�A��k�����ઽ���X�ݦP�@���������D�R�A����, �u�ઽ���եΦP�@���������R�A����
		// �u��q�L��H��Ҥƫ�, ��H.��k() -> �X�ݫD�R�A����
		Cat temp = new Cat();
		temp.sleep();

		System.out.println("Kitty run");
	}
	
	// �b������k��, �i�H�����X�������R�A����
	public void sleep() {
		run();
		{
			System.out.println("�ڬO�N�X��");
		}  // ���q�N�X�� -���X�{������
		System.out.println("Kitty sleep");
	}
}
