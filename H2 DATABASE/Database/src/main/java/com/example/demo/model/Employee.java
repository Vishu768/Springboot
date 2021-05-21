package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String dept;
	private int age;
	private int experienceinmonths);
	private int joiningdate;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperienceinmonths() {
		return experienceinmonths;
	}
	public void setExperienceinmonths(int experienceinmonths) {
		this.experienceinmonths = experienceinmonths;
	}
	public int getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(int joiningdate) {
		this.joiningdate = joiningdate;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", age=" + age + ", experienceinmonths="
				+ experienceinmonths + ", joiningdate=" + joiningdate + "]";
	}
}