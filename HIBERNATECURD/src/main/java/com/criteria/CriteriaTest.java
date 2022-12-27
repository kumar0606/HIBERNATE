package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class CriteriaTest {
public static void main(String[] args) {
	Session session=Sessionutil.getSession();
	Criteria cr=session.createCriteria(students.class);
	
	cr.add(Restrictions.eq("sname", "kumar"));
	List<students> st=cr.list();
	for (students students : st) {
		System.out.println(students);
		
	}
	
	//greaterthen criteria
Criteria cr1=session.createCriteria(students.class);
	
	cr1.add(Restrictions.gt("sfee", 50000.00));
	List<students> st1=cr1.list();
	for (students students1 : st1) {
		System.out.println(students1);
		
	}
	
	
	//lessthan criteria
Criteria cr2=session.createCriteria(students.class);
	
	cr2.add(Restrictions.lt("sfee", 50000.00));
	List<students> st2=cr2.list();
	for (students students2 : st2) {
		System.out.println(students2);
		
	}
}
}
