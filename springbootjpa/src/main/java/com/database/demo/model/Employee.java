package com.database.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int aid;
	private String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aname;
	}
	public void setaName(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Employee [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
