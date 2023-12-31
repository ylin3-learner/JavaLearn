package com.imooc.test;
import com.imooc.model.Job;
import com.imooc.model.Department;
import com.imooc.model.Staff;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department marketingDepartment = new Department("D001", "市場部");
        Department hrDepartment = new Department("D002", "人事部");

        Job managerJob = new Job("P001", "經理");
        Job analystJob = new Job("P002", "分析師");

        Staff stf1 = new Staff("張三", "E001", 30, "男", marketingDepartment, managerJob);
        Staff stf2 = new Staff("李四", "E002", 25, "女", marketingDepartment, analystJob);
        Staff stf3 = new Staff("王五", "E003", 22, "男", hrDepartment, analystJob);

        marketingDepartment.addStaff(stf1);
        marketingDepartment.addStaff(stf2);
        hrDepartment.addStaff(stf3);

        System.out.println(stf1.introduce());
        System.out.println(stf2.introduce());
        System.out.println(stf3.introduce());
        System.out.println("==============");
        System.out.println(marketingDepartment.getDepartmentName() + "員工數量：" + marketingDepartment.getStaffCount());
        System.out.println(hrDepartment.getDepartmentName() + "員工數量：" +  hrDepartment.getStaffCount());
    }
}
