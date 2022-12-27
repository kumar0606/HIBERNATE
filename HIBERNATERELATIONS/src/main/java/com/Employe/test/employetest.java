package com.Employe.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.Emp.sessionutil.SessionUtil;

import com.Employe.Model.Address;
import com.Employe.Model.Department;
import com.Employe.Model.Employee;
import com.Employe.Model.Project;

public class employetest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		
		Employee emp = new Employee();
		emp.setEid(102);
		emp.setEname("kumar");
		emp.setEsalary(60000.00);
		
        Address ad= new Address();
        
        ad.setLocation("neelampeta");
        ad.setCity("srikakulam");
        ad.setState("ap");
        
        Project pr= new Project();
//        pr.setPid(1);
        pr.setPname("it");
        Project pr1=new Project();
        pr1.setPname("marketing");
        List<Project> pro= new ArrayList<Project>();
			pro.add(pr);
        pro.add(pr1);
        
		Department dpt= new Department();
//        dpt.setDid(1);
        dpt.setDname("marketing");
        
        emp.setAddress(ad);
        emp.setDepartment(dpt);
        emp.setProjects(pro);
        session.save(emp);
        session.beginTransaction().commit();
        session.close();
        
		
	}
}
