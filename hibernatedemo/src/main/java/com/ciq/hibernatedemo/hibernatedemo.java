package com.ciq.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ciq.model.student;


public class hibernatedemo {
public static void main(String[] args) {
	student student=new student(4, "ravi", 25000.00);
  Configuration confg=new Configuration();
  confg.configure("hibernate.cfg.xml");
  SessionFactory sf=confg.buildSessionFactory();
  Session session=sf.openSession();
  session.save(student);
  //session.update(student);
//  session.delete(student);
  System.out.println("ravi welcome");
  session.beginTransaction().commit();
  session.close();
}
}
