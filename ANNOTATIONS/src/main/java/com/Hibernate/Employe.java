package com.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(value = { 
		@NamedQuery(name = "findall", query = " select e from Employe e"),

		@NamedQuery(name = "getbyid", query = " select e from Employe e where eid=? ") })
@NamedNativeQueries(value = { @NamedNativeQuery(name = "delete", query = "delete from EMP_TAB where E_ID=?",resultClass = Employe.class) })

@Entity
@Table(name = "EMP_TAB")
public class Employe {
	@Id
	@Column(name = "E_ID")
	int eid;
	@Column(name = "E_NAME")
	String ename;
	@Column(name = "E_SAL")
	double esalary;

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}
