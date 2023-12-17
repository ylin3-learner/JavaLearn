package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PetCatTest {

	public static void main(String[] args) {
		// Define PetCat Object
		PetCat huahua = new PetCat("���", 12, "�^��u���");
		PetCat fanfan = new PetCat("�Z�Z", 10, "���إж��");
		
		// Put PetCat into HashSet
		Set<PetCat> set = new HashSet<PetCat>();
		set.add(huahua);
		set.add(fanfan);
		
		Iterator<PetCat> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// �A�K�[�@�ӻP����ݩʬۦP����
		PetCat huahua01 = new PetCat("���", 12, "�^��u���");
		set.add(huahua01);
		System.out.println("************************");
		System.out.println("Insert the repeated info: ");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ���e�ۦP���ƾڤ����\�K�[�춰�X��?
		// �p�G�O�۩w�q��, �h�����n���ghashCode() �M equals()
		
		// ���s���J�@�ӷs��info
		PetCat huahua02 = new PetCat("���G�N", 12, "�^��u���");
		set.add(huahua02);
		System.out.println("Insert the new info: ");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Search huahua info and print out
		System.out.println("***************");
		if (set.contains(huahua01)) {
			System.out.println("�����F");
			System.out.println(huahua01);
		} else {
			System.out.println("���S���");
		}
		
		// Search huahua's name
		boolean flag = false;
		PetCat c = null;
		System.out.println("�q�L�W�r�d����");
		while(it.hasNext()) {
			c = (PetCat) it.next();
			if (c.getName().equals("���")) {
				flag = true; // ���F
				break;		
			}
		}
		if (flag) {
			System.out.println("�����F!");
			System.out.println(c);
		} else {
			System.out.println("���S���!");
		}
		
		// �R�����G�N���H���í��s��X  -- ConcurrentModificationException
		/**
		 * ConcurrentModificationException���`�q�`�X�{�b�ϥμW�jfor�`���M�����X���P�ɡA�ﶰ�X���������i��F�R���ɭP���C
		 * for(PetCat cat: set) {
			if ("���G�N".equals(cat.getName()))	{
				set.remove(cat);
			}
		}
		 */
		
		/** �ѨM��k�G
		 *  �n���@�ӦP�������Ŷ��X�A�N�������󪺤����K�[��s���X���A�M��N�s���X�л\��춰�X���ܶq���C
		 *  	�ܬ۪������F�z��R�����ާ@�A�åB���|Ĳ�o���󲧱`�Ϊ̿��~�C
		 */
		HashSet<PetCat> temp = new HashSet<PetCat>();
		for(PetCat cat: set) {
			if ("���G�N" != cat.getName()) {
				temp.add(cat);
			}
		}
		
		set = temp;
		
		System.out.println("�R�����G�N�᪺�ƾڡG");
		for(PetCat cat: set) {
			System.out.println(cat);
		}
		
		// �R�����X���Ҧ��d���߫H��
		System.out.println("************************");
		boolean flag1 = set.removeAll(set);
		if(flag1) {
			System.out.println("�߳������F!");
		} else
			System.out.println("���٦b!");
	}
			


}
