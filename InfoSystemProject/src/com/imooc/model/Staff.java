package com.imooc.model;
import com.imooc.model.Department;
import com.imooc.model.Job;

public class Staff {
	// 成員屬性：員工姓名、工號、年齡、性別、所屬部門、職務信息
	private String name;
    private String employeeId;
    private int age;
    private String gender;
    private Department department;
    private Job job;
    
    public Staff(String name, String employeeId, int age, String gender, Department department, Job job) {
        this.name = name;
        this.employeeId = employeeId;
        this.setAge(age);
        this.setGender(gender);
        this.department = department;
        this.job = job;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            this.age = 18; // 默認年齡為18歲
        }
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender.equals("男") || gender.equals("女")) {
            this.gender = gender;
        } else {
            this.gender = "男"; // 默認性別為男性
        }
	}
    
	public String introduce() {
        return "姓名：" + name + "，工號：" + employeeId + "，年齡：" + age + "，性別：" + gender +
               "，所屬部門：" + department.getDepartmentName() + "，職務：" + job.getJobName();
    }
}
