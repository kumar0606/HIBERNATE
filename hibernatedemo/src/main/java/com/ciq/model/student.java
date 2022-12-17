package com.ciq.model;

public class student {

	private int id;
	private String name;
	private double fee;
	public student() {
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "model [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
	

}
