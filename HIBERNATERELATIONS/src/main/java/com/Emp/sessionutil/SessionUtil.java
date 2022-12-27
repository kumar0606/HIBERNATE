package com.Emp.sessionutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class SessionUtil {
	static SessionFactory sf=null;
	 static  {
		Configuration confg = new Configuration();
		confg.configure("hibernate.cfg.xml");
		ServiceRegistryBuilder srb = new ServiceRegistryBuilder().applySettings(confg.getProperties());
		ServiceRegistry serviceRegistry = srb.buildServiceRegistry();
		sf=confg.buildSessionFactory(serviceRegistry);
	}
	 public static Session  getSession() {
		return sf.openSession();
		 
	 }
	 public static void  CloseSession() {
		 sf.close();
			
			 
		 }
	
	
		 
	 
}
