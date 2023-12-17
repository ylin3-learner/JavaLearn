package com.imooc.model;

public class Subject {
	// 成員屬性：學科名稱、學科編號、學制年限, 報名選修的學生信息(存儲空間長度), 報名選修的學生個數(存儲個數、大小)
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents; // 數組 -> 引用類型(默認為null)
	private int studentNum; // 通過 "集合" 可將上述兩步合而為一
	
	// no-var constructive method
	public Subject() {

	}

	// Constructive method with vars - 實現對學科名稱、學科編號、學科年限賦值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		// 兩種方法賦值：1. this.subjectName = subjectName; 2. (Recommended 方法賦值) -
		// this.setSubjectName(subjectName);
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	
	// Constructive method with vars - 實現對學科名稱、學科編號、學科年限、學生信息賦值
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		// 兩種方法賦值：1. this.subjectName = subjectName; 2. (Recommended 方法賦值) -
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

	// 設置學制年限, 必須大於0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	/**
	 * myStudents取值函數, 如果保存學生信息的數組尚未被初始化, 先初始化長度為200
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
	 * 科系描述函數 - 只管呈現描述 (單一職責原則)
	 * @return 科系描述介紹：名稱、編號、年限
	 */
	public String info() {
		String str = "科系描述如下：\n科系名稱：" + this.getSubjectName() + "\n科系編號：" + this.getSubjectNo() + "\n科系年限"
				+ this.getSubjectLife();
		return str;
	}
	
	public void addStudent(Student stu) {
		/*
		 * 1. 將學生保存到數組中
		 * 2. 將成員個數保存到studentNum
		 */
		
		// 1. 將學生保存到數組中
		for(int i=0; i < this.getMyStudents().length; i++) {
			if (this.getMyStudents()[i] == null) {
				// 如何實現Subject 和 School 雙向關聯? stu.setStuSubject(this);
				stu.setStuSubject(this); // this --當前調用的類：sub1
				this.getMyStudents()[i] = stu;
				
				// 2. 將成員個數保存到studentNum
				this.studentNum = i + 1;
				return;
			}	
		}
	}
}
