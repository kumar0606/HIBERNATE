package com.EmpTest;

import org.hibernate.Session;

import com.Emp.sessionutil.Sessionutil;
import com.Hibernate.Employe;

public class Emptest {
	public static void main(String[] args) {
		Session se = Sessionutil.getSession();
		se.save(new Employe(102, "kumar", 30000.00));
		se.beginTransaction().commit();
	}
}
