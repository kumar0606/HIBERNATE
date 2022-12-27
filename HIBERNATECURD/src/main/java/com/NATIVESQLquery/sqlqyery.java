package com.NATIVESQLquery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class sqlqyery {
public static void main(String[] args) {
	Session se=Sessionutil.getSession();
	String sqlQuery="select * from student";
	SQLQuery query=se.createSQLQuery(sqlQuery);
	List<Object[]> obj=query.list();
	for (Object[] objects : obj) {
		System.out.println(" sname :"+objects[1]+"sfee : "+objects[2]);
	}
	
	
	
	String sqlQuery1="select * from student";
	SQLQuery query1=se.createSQLQuery(sqlQuery);
	query1.addEntity(students.class);
	List<students> obj1=query1.list();
	for (students objects1 : obj1) {
		System.out.println(objects1);
	}
}
}
