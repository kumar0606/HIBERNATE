package com.Employe.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDR_TAB")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int aid;
	@Column(name = "E_LOC")
	String location;
	@Column(name = "E_CITY")
	String city;
	@Column(name = "E_STATE")
	String state;
	@OneToOne(mappedBy = "address")
	Employee employee;
public Address() {
	// TODO Auto-generated constructor stub
}
public Address(int aid, String location, String city, String state, Employee employee) {
	super();
	this.aid = aid;
	this.location = location;
	this.city = city;
	this.state = state;
	this.employee = employee;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", location=" + location + ", city=" + city + ", state=" + state + ", employee="
			+ employee + "]";
}

}
