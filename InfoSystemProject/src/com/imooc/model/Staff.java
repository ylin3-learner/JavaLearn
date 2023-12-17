package com.imooc.model;
import com.imooc.model.Department;
import com.imooc.model.Job;

public class Staff {
	// �����ݩʡG���u�m�W�B�u���B�~�֡B�ʧO�B���ݳ����B¾�ȫH��
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
            this.age = 18; // �q�{�~�֬�18��
        }
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender.equals("�k") || gender.equals("�k")) {
            this.gender = gender;
        } else {
            this.gender = "�k"; // �q�{�ʧO���k��
        }
	}
    
	public String introduce() {
        return "�m�W�G" + name + "�A�u���G" + employeeId + "�A�~�֡G" + age + "�A�ʧO�G" + gender +
               "�A���ݳ����G" + department.getDepartmentName() + "�A¾�ȡG" + job.getJobName();
    }
}
