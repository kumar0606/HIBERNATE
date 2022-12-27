package com.Employe.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPL_TAB")
public class Employee {
	@Id
	@Column(name = "E_ID")
	int eid;
	@Column(name = "E_NAME")
	String ename;
	@Column(name = "E_SAL")
	double esalary;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="aid")
	Address address;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="did")
	Department department;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="EMPl_PRJ_TAB",joinColumns = @JoinColumn(name="eid"),inverseJoinColumns = @JoinColumn(name="pid"))
    List<Project> projects;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double esalary, Address address, Department department,
			List<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.address = address;
		this.department = department;
		this.projects = projects;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address
				+ ", department=" + department + ", projects=" + projects + "]";
	}

}
