package com.student.test;

import org.hibernate.Session;

import com.hibernate.util.sessionstudent;
import com.students.model.Address;
import com.students.model.Department;
import com.students.model.student;

public class studentTest {
public static void main(String[] args) {
	Session session=sessionstudent.getsession();
	
	student st= new student();
	st.setSid(101);
	st.setSname("venkat");
	st.setSfee(50000.00);
	Address ad=new Address();
	ad.setAloc("sklm");
	ad.setApin(532445);
	Department dpt=new Department();
	dpt.setDname("mechanical");
	st.setAddress(ad);
	st.setDepartment(dpt);
	//session.save(st);
	session.saveOrUpdate(st);
	session.beginTransaction().commit();
	
	
	session.close();
}
}
