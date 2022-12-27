package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class sessionstudent {

	static SessionFactory sf=null;
	
	static {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistryBuilder srb= new ServiceRegistryBuilder().applySettings(cfg.getProperties());
		ServiceRegistry registry=srb.buildServiceRegistry();
		sf=cfg.buildSessionFactory(registry);
	}
	public static Session getsession() {
		return sf.openSession();
	}
	public static void closesession() {
		sf.close();
	}
}
