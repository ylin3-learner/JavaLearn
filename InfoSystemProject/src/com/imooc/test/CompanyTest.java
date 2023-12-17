package com.imooc.test;
import com.imooc.model.Job;
import com.imooc.model.Department;
import com.imooc.model.Staff;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department marketingDepartment = new Department("D001", "カ初场");
        Department hrDepartment = new Department("D002", "ㄆ场");

        Job managerJob = new Job("P001", "竒瞶");
        Job analystJob = new Job("P002", "だ猂畍");

        Staff stf1 = new Staff("眎", "E001", 30, "╧", marketingDepartment, managerJob);
        Staff stf2 = new Staff("", "E002", 25, "", marketingDepartment, analystJob);
        Staff stf3 = new Staff("き", "E003", 22, "╧", hrDepartment, analystJob);

        marketingDepartment.addStaff(stf1);
        marketingDepartment.addStaff(stf2);
        hrDepartment.addStaff(stf3);

        System.out.println(stf1.introduce());
        System.out.println(stf2.introduce());
        System.out.println(stf3.introduce());
        System.out.println("==============");
        System.out.println(marketingDepartment.getDepartmentName() + "计秖" + marketingDepartment.getStaffCount());
        System.out.println(hrDepartment.getDepartmentName() + "计秖" +  hrDepartment.getStaffCount());
    }
}
