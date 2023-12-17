package com.imooc.test;
import com.imooc.model.Job;
import com.imooc.model.Department;
import com.imooc.model.Staff;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department marketingDepartment = new Department("D001", "������");
        Department hrDepartment = new Department("D002", "�H�Ƴ�");

        Job managerJob = new Job("P001", "�g�z");
        Job analystJob = new Job("P002", "���R�v");

        Staff stf1 = new Staff("�i�T", "E001", 30, "�k", marketingDepartment, managerJob);
        Staff stf2 = new Staff("���|", "E002", 25, "�k", marketingDepartment, analystJob);
        Staff stf3 = new Staff("����", "E003", 22, "�k", hrDepartment, analystJob);

        marketingDepartment.addStaff(stf1);
        marketingDepartment.addStaff(stf2);
        hrDepartment.addStaff(stf3);

        System.out.println(stf1.introduce());
        System.out.println(stf2.introduce());
        System.out.println(stf3.introduce());
        System.out.println("==============");
        System.out.println(marketingDepartment.getDepartmentName() + "���u�ƶq�G" + marketingDepartment.getStaffCount());
        System.out.println(hrDepartment.getDepartmentName() + "���u�ƶq�G" +  hrDepartment.getStaffCount());
    }
}
