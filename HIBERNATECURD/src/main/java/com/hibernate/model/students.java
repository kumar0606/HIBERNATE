package com.hibernate.model;

public class students {
	private int sid;
	private String sname;
	private double sfee;
	private String smail;

	public students() {
		// TODO Auto-generated constructor stub
	}

	public students(int sid, String sname, double sfee, String smail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.smail = smail;
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

	public String getSmail() {
		return smail;
	}

	public void setSmail(String smail) {
		this.smail = smail;
	}

	@Override
	public String toString() {
		return "students [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", smail=" + smail + "]";
	}

	
}
