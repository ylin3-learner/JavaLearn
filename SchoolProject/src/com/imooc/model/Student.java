package com.imooc.model;

public class Student {
	// 成員屬性：名稱、學號、性別、年齡 + 科系 (方案3)
	private String stuName;
	private String stuNo;
	private String stuSex;
	private int stuAge;
	private Subject stuSubject;

	// 無參構造方法
	public Student() {

	}

	// 帶參構造方法

	public String getStuName() {
		return stuName;
	}
	
	// 多參構造方法, 實現對學號, 名稱, 性別, 年齡賦值
	public Student(String stuNo, String stuName, String stuSex, int stuAge) {
		this.setStuName(stuName);
		this.setStuNo(stuNo);
		this.setStuSex(stuSex);
		this.setStuAge(stuAge);
	}
	
	// 多參構造方法, 實現對多屬性賦值 - 相比方案2, 關聯性更強
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
		// 限制性別只能是 "男" 或者 "女", 反之預設為"男"
		// 可通過equals() 進行字符串內容判斷, 如果相等返回True, 不等則False
		if (stuSex.equals("男") || stuSex.equals("女")) {
			this.stuSex = stuSex;
		} else {
			this.stuSex = "男";
		}
	}

	public int getStuAge() {
		return stuAge;
	}

	/**
	 * 給年齡賦值, 限定為10 - 100 歲之間, 反之賦值為18
	 * 
	 * @param stuAge 傳入的年齡
	 */
	public void setStuAge(int stuAge) {
		if (stuAge < 10 || stuAge > 100)
			this.stuAge = 18;
		else
			this.stuAge = stuAge;
	}
	
	/**
	 * 獲取科系對象, 如果沒有實例化, 先實例化後再返回
	 * @return 科系對象屬性
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
	 * 學生自我介紹函數
	 * 
	 * @return 自我介紹描述：姓名、學號、性別、年齡 + Subject.subjectName + Subject.subjectLife 1.
	 *         
	 */
	public String introduction() {
		String str = "學生介紹如下：\n姓名：" + this.getStuName() + "\n學號：" + this.getStuNo() + "\n性別：" + this.getStuSex()
				+ "\n年齡：" + this.getStuAge() + "\n科系名稱：" + this.getStuSubject().getSubjectName() + "\n科系年限：" + this.getStuSubject().getSubjectLife();
		return str;
	}

	/**
	 * 學生自我介紹函數
	 * 
	 * @param subjectName 科系名稱
	 * @param subjectLife 科系年限
	 * @return 自我介紹描述：姓名、學號、性別、年齡, 科系名稱, 科系年限
	 * 1. 在方法中添加兩個參數 - 容易理解, 參數列表長
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "學生介紹如下：\n姓名：" + this.getStuName() + "\n學號：" + this.getStuNo() + "\n性別：" + this.getStuSex()
				+ "\n年齡：" + this.getStuAge() + "\n科系名稱：" + subjectName + "\n科系年限：" + subjectLife;
		return str;
	}

	/**
	 * 學生自我介紹函數 - 2. 添加對象作為參數, 並獲取其屬性 -- 更加簡單、獲取參數方便
	 * 
	 * @param mySubject
	 * @return 自我介紹描述：姓名、學號、性別、年齡, 科系名稱, 科系年限
	 */
	public String introduction(Subject mySubject) {
		String str = "學生介紹如下：\n學號：" + this.getStuNo() + "\n姓名：" + this.getStuName() + "\n性別：" + this.getStuSex()
				+ "\n年齡：" + this.getStuAge() + "\n科系名稱：" + mySubject.getSubjectName() + "\n科系年限：" + mySubject.getSubjectLife();
		return str;
	}

}
