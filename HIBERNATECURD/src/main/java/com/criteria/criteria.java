package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class criteria {
public static void main(String[] args) {
	Session session=Sessionutil.getSession();
	Criteria criteria=session.createCriteria(students.class);
	criteria.add(Restrictions.eq("sname", "satya"));
	List<students> st=criteria.list();
	for (students students : st) {
		System.out.println(students);
	}
}
}
