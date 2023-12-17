package com.imooc.test;
import com.imooc.model.Student;
import com.imooc.model.Subject;

/**
 * 科系類
 * @author You-lun
 *
 */
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 測試Subject
		Subject sub1 = new Subject("資工系", "J0001", 4);
		System.out.println(sub1.info());
		System.out.println("===================================");
		// 測試Student
		Student stu1 = new Student("S01", "張三", "男", 200, sub1);
		System.out.println(stu1.introduction());
		System.out.println("===================================");
		// 測試Student2
		Student stu2 = new Student("S02", "李四", "女", 17);
		System.out.println(stu2.introduction("資工系", 4));
		System.out.println("===================================");
		// 測試Student3
		Student stu3 = new Student("S03", "王五", "男", 18);
		System.out.println(stu3.introduction(sub1));
		System.out.println("===================================");
		// 測試指定科系中有多少學生報名
		sub1.addStudent(stu1);
		sub1.addStudent(stu2);
		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName() + "中已有" + sub1.getStudentNum() + "學生報名");
	}

}
