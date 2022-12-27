package com.NamedQueries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Entity.Student;
import com.hibernate.util.Sessionutil;

public class NamedQueries {
	public static void main(String[] args) {
		Session session = Sessionutil.getSession();
		Query query = session.getNamedQuery("FindAll");
		List<Student> list = query.list();
		for (Student student : list) {
			System.out.println(student);
		}
//		System.out.println("****************************");
//		Query query1 = session.getNamedQuery("NativefindAll1");
//		List<Student> list1 = query1.list();
//		for (Student student : list1) {
//			System.out.println(student);
//		}
//		System.out.println("****************************");
//		Query query2 = session.getNamedQuery("Native_Find_By_Id");
//		query2.setParameter(0, 2);
//		List<Student> list2 = query2.list();
//		for (Student student : list2) {
//			System.out.println(student);
//		}
//		System.out.println("****************************");
		Query query3 = session.getNamedQuery("Native_Delete");
		query3.setParameter(0, 2);
		System.out.println(query3.executeUpdate());
		session.beginTransaction().commit();
		
		
	}

}
