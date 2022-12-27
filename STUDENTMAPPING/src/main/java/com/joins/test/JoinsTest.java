package com.joins.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.util.sessionstudent;
import com.students.model.student;

public class JoinsTest {
public static void main(String[] args) {
	Session session=sessionstudent.getsession();
	Query query=session.createQuery("from student INNER JOIN Department");
	List<student> st=query.list();
	for (student student : st) {
		System.out.println(student);
	}
	session.close();
}
}
