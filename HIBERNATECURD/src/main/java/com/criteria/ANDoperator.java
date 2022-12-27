package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class ANDoperator {
public static void main(String[] args) {
	Session session=Sessionutil.getSession();
	Criteria cr=session.createCriteria(students.class);
	cr.add(Restrictions.and(Restrictions.gt("sfee", 50000.00),Restrictions.eq("sname", "kumar")));
	List<students> st= cr.list();
	for (students students : st) {
		System.out.println(students);
	}
}
}
