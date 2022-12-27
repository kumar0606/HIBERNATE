package com.Projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class Projections1 {
public static void main(String[] args) {
	Session session=Sessionutil.getSession();
	Criteria cr=session.createCriteria(students.class);
	cr.setProjection(Projections.property("sname"));
	List<String> obj=cr.list();
	obj.forEach(System.out::println);
	
	//projections for sum
	Criteria cr1=session.createCriteria(students.class);
	cr1.setProjection(Projections.sum("sfee"));
	System.out.println(cr1.list());
	
	//projections for count
	Criteria cr2=session.createCriteria(students.class);
	cr2.setProjection(Projections.count("sname"));
//	List<String> obj1=cr2.list();
//	obj1.forEach(System.out::println);
	System.out.println(cr2.list());
	
	Criteria cr3=session.createCriteria(students.class);
	cr3.setProjection(Projections.avg("sfee"));
	System.out.println(cr3.list());
	
	
}
}
