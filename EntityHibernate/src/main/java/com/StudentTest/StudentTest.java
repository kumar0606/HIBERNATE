package com.StudentTest;

import org.hibernate.Session;

import com.Entity.Student;
import com.hibernate.util.Sessionutil;

public class StudentTest {
	public static void main(String[] args) {
		Session session = Sessionutil.getSession();
		session.save(new Student(04, "satya", 5000.00));
		
		session.beginTransaction().commit();
	}
}
