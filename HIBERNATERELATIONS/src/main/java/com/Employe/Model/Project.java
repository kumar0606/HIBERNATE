package com.Employe.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRJ_TAB")
public class Project {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
int pid;
	@Column(name="E_PNAME")
String pname;
	@ManyToMany(mappedBy = "projects")
	List<Employee> employe;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String pname, List<Employee> employe) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employe = employe;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmploye() {
		return employe;
	}

	public void setEmploye(List<Employee> employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", employe=" + employe + "]";
	}
	
}
