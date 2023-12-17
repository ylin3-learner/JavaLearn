package com.imooc.model;

public class Student {
	// �����ݩʡG�W�١B�Ǹ��B�ʧO�B�~�� + ��t (���3)
	private String stuName;
	private String stuNo;
	private String stuSex;
	private int stuAge;
	private Subject stuSubject;

	// �L�Ѻc�y��k
	public Student() {

	}

	// �a�Ѻc�y��k

	public String getStuName() {
		return stuName;
	}
	
	// �h�Ѻc�y��k, ��{��Ǹ�, �W��, �ʧO, �~�ֽ��
	public Student(String stuNo, String stuName, String stuSex, int stuAge) {
		this.setStuName(stuName);
		this.setStuNo(stuNo);
		this.setStuSex(stuSex);
		this.setStuAge(stuAge);
	}
	
	// �h�Ѻc�y��k, ��{��h�ݩʽ�� - �ۤ���2, ���p�ʧ�j
	public Student(String stuNo, String stuName, String stuSex, int stuAge, Subject stuSubject) {
		this.setStuName(stuName);
		this.setStuNo(stuNo);
		this.setStuSex(stuSex);
		this.setStuAge(stuAge);
		this.setStuSubject(stuSubject);
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		// ����ʧO�u��O "�k" �Ϊ� "�k", �Ϥ��w�]��"�k"
		// �i�q�Lequals() �i��r�Ŧꤺ�e�P�_, �p�G�۵���^True, �����hFalse
		if (stuSex.equals("�k") || stuSex.equals("�k")) {
			this.stuSex = stuSex;
		} else {
			this.stuSex = "�k";
		}
	}

	public int getStuAge() {
		return stuAge;
	}

	/**
	 * ���~�ֽ��, ���w��10 - 100 ������, �Ϥ���Ȭ�18
	 * 
	 * @param stuAge �ǤJ���~��
	 */
	public void setStuAge(int stuAge) {
		if (stuAge < 10 || stuAge > 100)
			this.stuAge = 18;
		else
			this.stuAge = stuAge;
	}
	
	/**
	 * �����t��H, �p�G�S����Ҥ�, ����Ҥƫ�A��^
	 * @return ��t��H�ݩ�
	 */
	public Subject getStuSubject() {
		if (this.stuSubject == null)
			this.stuSubject = new Subject();
		return stuSubject;
	}

	public void setStuSubject(Subject stuSubject) {
		this.stuSubject = stuSubject;
	}

	/**
	 * �ǥͦۧڤ��Ш��
	 * 
	 * @return �ۧڤ��дy�z�G�m�W�B�Ǹ��B�ʧO�B�~�� + Subject.subjectName + Subject.subjectLife 1.
	 *         
	 */
	public String introduction() {
		String str = "�ǥͤ��Цp�U�G\n�m�W�G" + this.getStuName() + "\n�Ǹ��G" + this.getStuNo() + "\n�ʧO�G" + this.getStuSex()
				+ "\n�~�֡G" + this.getStuAge() + "\n��t�W�١G" + this.getStuSubject().getSubjectName() + "\n��t�~���G" + this.getStuSubject().getSubjectLife();
		return str;
	}

	/**
	 * �ǥͦۧڤ��Ш��
	 * 
	 * @param subjectName ��t�W��
	 * @param subjectLife ��t�~��
	 * @return �ۧڤ��дy�z�G�m�W�B�Ǹ��B�ʧO�B�~��, ��t�W��, ��t�~��
	 * 1. �b��k���K�[��ӰѼ� - �e���z��, �ѼƦC���
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "�ǥͤ��Цp�U�G\n�m�W�G" + this.getStuName() + "\n�Ǹ��G" + this.getStuNo() + "\n�ʧO�G" + this.getStuSex()
				+ "\n�~�֡G" + this.getStuAge() + "\n��t�W�١G" + subjectName + "\n��t�~���G" + subjectLife;
		return str;
	}

	/**
	 * �ǥͦۧڤ��Ш�� - 2. �K�[��H�@���Ѽ�, ��������ݩ� -- ��[²��B����ѼƤ�K
	 * 
	 * @param mySubject
	 * @return �ۧڤ��дy�z�G�m�W�B�Ǹ��B�ʧO�B�~��, ��t�W��, ��t�~��
	 */
	public String introduction(Subject mySubject) {
		String str = "�ǥͤ��Цp�U�G\n�Ǹ��G" + this.getStuNo() + "\n�m�W�G" + this.getStuName() + "\n�ʧO�G" + this.getStuSex()
				+ "\n�~�֡G" + this.getStuAge() + "\n��t�W�١G" + mySubject.getSubjectName() + "\n��t�~���G" + mySubject.getSubjectLife();
		return str;
	}

}
