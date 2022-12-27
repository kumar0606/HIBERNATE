package com.ProjectionsList;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class projectionsList1 {
public static void main(String[] args) {
	Session session=Sessionutil.getSession();
	Criteria cr=session.createCriteria(students.class);
	ProjectionList prl=Projections.projectionList();
	prl.add(Projections.sum("sfee"));
	prl.add(Projections.count("sname"));
	prl.add(Projections.avg("sfee"));
	prl.add(Projections.max("sfee"));
	prl.add(Projections.property("sname"));
	prl.add(Projections.min("sfee"));
	cr.setProjection(prl);
	List<Object[]> obg=cr.list();
	for (Object[] objects : obg) {
		System.out.println(objects[0]);
		System.out.println(objects[1]);
		System.out.println(objects[2]);
		System.out.println(objects[3]);
		System.out.println(objects[4]);
		System.out.println(objects[5]);
	}
}
}
