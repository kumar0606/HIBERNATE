package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

// Entity name and properties
@NamedQuery(name = "FindAll", query = "select s from Student s")
@NamedQueries(value = { @NamedQuery(name = "GetById", query = "select s from Student s where id=?"),
		@NamedQuery(name = "GetByName", query = "select s from Student s where name=?") })

@NamedNativeQuery(name = "NativefindAll1", query = "SELECT * FROM STUDENT_RAVI", resultClass = Student.class)
@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "Native_Find_By_Id", query = "SELECT * FROM STUDENT_RAVI WHERE S_ID=?",resultClass = Student.class),
		@NamedNativeQuery(name = "Native_Find_By_Name", query = "SELECT * FROM STUDENT_RAVI WHERE S_NAME=?",resultClass = Student.class),
		@NamedNativeQuery(name = "Native_update", query = "UPDATE STUDENT_RAVI SET S_NAME,S_FEE WHERE S_ID=?",resultClass = Student.class),
@NamedNativeQuery(name = "Native_Delete", query = "delete from STUDENT_RAVI WHERE S_ID=?",resultClass = Student.class), })

@Entity
@Table(name = "Student_ravi")
public class Student {
	@Id
	@Column(name = "S_ID")
	int id;
	@Column(name = "S_NAME")
	String name;
	@Column(name = "S_FEES")
	double fees;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

}
