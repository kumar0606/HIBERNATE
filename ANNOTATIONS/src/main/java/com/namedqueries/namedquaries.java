package com.namedqueries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Emp.sessionutil.Sessionutil;
import com.Hibernate.Employe;

public class namedquaries {
public static void main(String[] args) {
	Session se= Sessionutil.getSession();
//	Query query= se.getNamedQuery("findall");
//	List<Employe> emp=query.list();
//	for (Employe employe : emp) {
//		System.out.println(employe);
//	}
	
//	Query query1= se.getNamedQuery("getbyid");
//	query1.setParameter(0, 102);
//	List<Employe> emp1=query1.list();
//	for (Employe employe : emp1) {
//		System.out.println(employe);
//	}
//	
	
	Query q=se.getNamedQuery("delete");
	q.setParameter(0, 101);
	System.out.println(q.executeUpdate());
	se.beginTransaction().commit();
	
}
}
