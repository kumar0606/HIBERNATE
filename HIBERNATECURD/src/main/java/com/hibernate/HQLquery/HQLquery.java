package com.hibernate.HQLquery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class HQLquery {
public static void main(String[] args) {
	Session session=Sessionutil.getSession();
	
	//LIST OF QUERY
	//String hqlquery="from students";
//	Query query=session.createQuery("from students");
//	List<students> st= query.list();
//	for (students students : st) {
//		System.out.println(students);
//		
//	}
	
	//UPDATE QUERY
//	Query query=session.createQuery("UPDATE students s SET s.sfee=50000.00");
//	 int num=query.executeUpdate();
//	 session.beginTransaction().commit();
//	 System.out.println("number of records updated:"+num);
	
	
	//QUERY FOR PARTICULAR NAME AND ID
//	String hqlquery="SELECT sid ,sname from students";
//	Query query=session.createQuery(hqlquery);
//	List<Object[]> student= query.list();
//	for (Object obj[] : student) {
//		System.out.println("sid:"+obj[0]);
//		System.out.println("sname:"+obj[1]);
//		System.out.println(".................");
//	}
	
	
	//QUERY FOR PARTICULAR ID 
	String hqlquery="select sid from students";
	Query query=session.createQuery(hqlquery);
	List<Integer> obj= query.list();
	for (Integer objects : obj) {
		System.out.println(objects);
	}
	
}
}
