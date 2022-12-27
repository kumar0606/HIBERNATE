package com.students.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column
	private String aloc;
	@Column
	private int apin;
	
	@OneToOne(mappedBy = "address")
	student students;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(int aid, String aloc, int apin, student students) {
		super();
		this.aid = aid;
		this.aloc = aloc;
		this.apin = apin;
		this.students = students;
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	public int getApin() {
		return apin;
	}
	public void setApin(int apin) {
		this.apin = apin;
	}
	public student getStudents() {
		return students;
	}
	public void setStudents(student students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + ", apin=" + apin + ", students=" + students + "]";
	}
	
	
}
