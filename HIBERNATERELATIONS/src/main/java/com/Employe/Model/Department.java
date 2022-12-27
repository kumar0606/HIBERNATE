package com.Employe.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPT_TAB")
public class Department {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
int did;
	@Column(name="D_NAME")
String dname;
	@OneToMany(mappedBy = "department")
	List<Employee> employe;

	
	public Department() {
		// TODO Auto-generated constructor stub
	}


	public Department(int did, String dname, List<Employee> employe) {
		super();
		this.did = did;
		this.dname = dname;
		this.employe = employe;
	}


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public List<Employee> getEmploye() {
		return employe;
	}


	public void setEmploye(List<Employee> employe) {
		this.employe = employe;
	}


	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", employe=" + employe + "]";
	}
	
}
