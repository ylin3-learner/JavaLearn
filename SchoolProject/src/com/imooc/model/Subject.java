package com.imooc.model;

public class Subject {
	// �����ݩʡG�Ǭ�W�١B�Ǭ�s���B�Ǩ�~��, ���W��ת��ǥͫH��(�s�x�Ŷ�����), ���W��ת��ǥͭӼ�(�s�x�ӼơB�j�p)
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents; // �Ʋ� -> �ޥ�����(�q�{��null)
	private int studentNum; // �q�L "���X" �i�N�W�z��B�X�Ӭ��@
	
	// no-var constructive method
	public Subject() {

	}

	// Constructive method with vars - ��{��Ǭ�W�١B�Ǭ�s���B�Ǭ�~�����
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		// ��ؤ�k��ȡG1. this.subjectName = subjectName; 2. (Recommended ��k���) -
		// this.setSubjectName(subjectName);
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	
	// Constructive method with vars - ��{��Ǭ�W�١B�Ǭ�s���B�Ǭ�~���B�ǥͫH�����
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		// ��ؤ�k��ȡG1. this.subjectName = subjectName; 2. (Recommended ��k���) -
		// this.setSubjectName(subjectName);
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
		}
		
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// �]�m�Ǩ�~��, �����j��0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	/**
	 * myStudents���Ȩ��, �p�G�O�s�ǥͫH�����Ʋթ|���Q��l��, ����l�ƪ��׬�200
	 * @return
	 */
	public Student[] getMyStudents() {
		if (this.myStudents == null)
			this.myStudents = new Student[200];
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * ��t�y�z��� - �u�ާe�{�y�z (��@¾�d��h)
	 * @return ��t�y�z���СG�W�١B�s���B�~��
	 */
	public String info() {
		String str = "��t�y�z�p�U�G\n��t�W�١G" + this.getSubjectName() + "\n��t�s���G" + this.getSubjectNo() + "\n��t�~��"
				+ this.getSubjectLife();
		return str;
	}
	
	public void addStudent(Student stu) {
		/*
		 * 1. �N�ǥͫO�s��Ʋդ�
		 * 2. �N�����ӼƫO�s��studentNum
		 */
		
		// 1. �N�ǥͫO�s��Ʋդ�
		for(int i=0; i < this.getMyStudents().length; i++) {
			if (this.getMyStudents()[i] == null) {
				// �p���{Subject �M School ���V���p? stu.setStuSubject(this);
				stu.setStuSubject(this); // this --��e�եΪ����Gsub1
				this.getMyStudents()[i] = stu;
				
				// 2. �N�����ӼƫO�s��studentNum
				this.studentNum = i + 1;
				return;
			}	
		}
	}
}
