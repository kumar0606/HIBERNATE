package com.hibernate.test;

import java.util.List;

import com.hibernate.DAO.StudentDAO;
import com.hibernate.DAO.studentDAOimpl;
import com.hibernate.model.students;

public class studentDAOtest {
	public static void main(String[] args) {
		StudentDAO student = new studentDAOimpl();
//		studentDAOtest test = new studentDAOtest();
		// save method
//		Integer st = student.save(new students(102, "mahesh", 55000.00, "venky@1997"));
//		System.out.println(st);

		// findall method
//	List<students> st=student.findall();
//	for (students students : st){
//		System.out.println(students);
//	}

		// delete method
	//student.delete(5);

		// findbyid method
		// System.out.println(student.findbyid(2));

		// update method
		// student.update(new students(2, "kumar", 100.00, "kumar@gmail.com"));

	}
}
