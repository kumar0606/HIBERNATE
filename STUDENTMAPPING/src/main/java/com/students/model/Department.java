package com.students.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	@Column
	private String dname;
	@OneToMany(mappedBy = "department")
	List<student> students;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname, List<student> students) {
		super();
		this.did = did;
		this.dname = dname;
		this.students = students;
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
	public List<student> getStudents() {
		return students;
	}
	public void setStudents(List<student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", students=" + students + "]";
	}
	
}
