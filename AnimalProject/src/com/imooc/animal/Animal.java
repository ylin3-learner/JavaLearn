package com.imooc.animal;

public class Animal {
	// final: �bclass �e�]�mfinal��ܤ����\���l���~��, ��k�Q���g(���i�H�Q�ϥ�) - final public / public final
	/**
	 * final �[�b�ܶq�e 
	 * final �u����� �ܶq �o�ӰѷӤ��|�Q���s��� (reassign)
	 * ���O �ܶq ���󥻨����欰���|���� final �v�T
	 * �[�J/�R���������ާ@�٬O�i�H���`���檺, �o�˴N���O immutable �F. 
	 * �p�G�A�u���Ʊ�F�� immutable ���ĪG, �h�ݭn���������O�]��� immutable �欰�~�i�H
	 * 
	 * ��Ȧ�m�G1. �w�q������l�� 2. �c�y��k 3. �c�y�N�X��
	 */
	
	/**
	 * private: �u���\�b�������i��X�� - ��{���������ʸ�, �F��ƾڦw����
	 * public: ���\�b���N��m�X��
	 * protected: ���\�b�P�����B�P�]�l���B��]�l�� ; �����\�b��]�D�l�� (�D�˫D�G)
	 * �q�{�G���\�b��e�����B�P�](package)�l��/ �D�l���� ; �����\��]�ե�
	 */
	
	private String name = "�ʪ��W"; // �ʺ�
	private int month = 2; // ���
	private String species = "�ʪ��~��"; // �~��
	public int temp = 15;
	private double weight;
	
	private static int st1 = 22;
	public static int st2 = 18;
	
	static {
		System.out.println("�ڬO�������R�A�N�X��~");
	}
	
	{
		System.out.println("�ڬO�������c�y�N�X��~");
	}
	// construct method without vars
	// �������c�y��k�����\�Q�~�ӡB�����\�Q���g - ���O�|�v�T�l������ҤƹL�{
	public Animal() {
		System.out.println("�ڬO�������L�Ѻc�y��k~");
	}
	
	public Animal(String name,  int month) {
		this.name = name;
		this.month = month;
		System.out.println("�ڬO���������Ѻc�y��k~");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	// �Y�F��
	public void eat() {
		System.out.println(this.getName() + "�b�Y�F��");
	}
	
	// Override Object.equals
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Animal temp = (Animal) obj;
		//  if�y�y���A������Ĥ@�Ӫ�F���Ψ� equals �ӲĤG�ӥΨ� == �O�H
		/*
		 * if�y�y���A��{���O���O�w��name�Mmonth���ȶi�����C
		 * 1. name�ݩʬOString�����A�]�����˥�equals�����Ӧr���ꪺ�ȬO�_�۵�
		 * 2. month�ݩʬO int �����A����˥�==�����Ӿ�ƭȬO�_
		 * �۵��C
         */
		// ���򥻼ƾ������Ө��A�S��equals��k�A�]�������B����equals�F
		if(this.getName().equals(temp.getName()) && (this.getMonth() == temp.getMonth()))
			return true;
		else
			return false;
	}
	
	/**
	 *  // �p�G������O�P�@�ӹ�H�A�h������^true�A�]���ۦP��H�֩w�۵��]�Y���s�a�}�ۦP�^
	 * if (this == obj) {
            return true;
        }
        
        // �p�G�������H��null�A�Ϊ̨�ӹ�H�������P�]�Y���O�P�@�������^�A�h��^false
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        // �N�ǤJ��obj��H�j�������ഫ��Fruits���A�M��i���ݩʪ����, �q�L���shape�Mtaste�ݩʬO�_�۵��ӧP�_���Fruits��H�O�_�۵�
        Fruits fruits = (Fruits) obj;
        
        // �ϥ�Objects����equals��k���shape�Mtaste�ݩʬO�_�۵��A�p�G���۵��h��^true�A�_�h��^false
        return Objects.equals(shape, fruits.shape) && Objects.equals(taste, fruits.taste);
	 * @param obj
	 * @return boolean
	 */
	
	// Overload Animal.equals
	public boolean equals(Animal obj) {
		if (obj == null)
			return false;
		if(this.getName().equals(obj.getName()) && (this.getMonth() == obj.getMonth()))
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "NickName: " + this.getName() + ", Age: " + this.getMonth();
	}
}
