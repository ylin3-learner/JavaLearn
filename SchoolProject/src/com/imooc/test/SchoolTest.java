package com.imooc.test;
import com.imooc.model.Student;
import com.imooc.model.Subject;

/**
 * ��t��
 * @author You-lun
 *
 */
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����Subject
		Subject sub1 = new Subject("��u�t", "J0001", 4);
		System.out.println(sub1.info());
		System.out.println("===================================");
		// ����Student
		Student stu1 = new Student("S01", "�i�T", "�k", 200, sub1);
		System.out.println(stu1.introduction());
		System.out.println("===================================");
		// ����Student2
		Student stu2 = new Student("S02", "���|", "�k", 17);
		System.out.println(stu2.introduction("��u�t", 4));
		System.out.println("===================================");
		// ����Student3
		Student stu3 = new Student("S03", "����", "�k", 18);
		System.out.println(stu3.introduction(sub1));
		System.out.println("===================================");
		// ���ի��w��t�����h�־ǥͳ��W
		sub1.addStudent(stu1);
		sub1.addStudent(stu2);
		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName() + "���w��" + sub1.getStudentNum() + "�ǥͳ��W");
	}

}
