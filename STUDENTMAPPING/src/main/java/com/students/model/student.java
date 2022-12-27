package com.students.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private double sfee;
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
@JoinColumn(name = "aid")
	Address address;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	Department department;
	public student() {
		// TODO Auto-generated constructor stub
	}
	public student(int sid, String sname, double sfee, Address address, Department department) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.address = address;
		this.department = department;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
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
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", address=" + address + ", department="
				+ department + "]";
	}
	
}
