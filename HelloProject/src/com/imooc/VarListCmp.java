package com.imooc;
/**
 * 
 * @author user
 *
 */
public class VarListCmp {
	// F6 ��B�ո� -- Step over
	// F5 ��k�����ո� -- Step into
	// F7 �Ѥ�k / ��Ƥ�����^breakpoint
	// �i�ܰѼƪ���k�O�̫�Q�X�ݪ�!
	
	public int sum(int... n) {
		int sum = 0;
		System.out.println("�a�i�ܰѼƳQ�ե�!");
		for(int i:n) {
			sum += i;
		}
		return sum;
	}
	
	public int sum(int a, int b) {
		System.out.println("���a�i�ܰѼƳQ�ե�!");
		return a + b;
	}
	public static void main(String[] args) {
		VarListCmp test = new VarListCmp();
		System.out.println("�M��: "+test.sum(1, 2));
	}

}
