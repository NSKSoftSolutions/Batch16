package com.spring.demo.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "employeeInfo")
@Component
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String e_no;
	private String pre_add;
	private String per_add;
	private String mobile;
	@CreationTimestamp
	private Timestamp joindate;
	private double salary;
	

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

	public String getE_no() {
		return e_no;
	}

	public void setE_no(String e_no) {
		this.e_no = e_no;
	}

	public String getPre_add() {
		return pre_add;
	}

	public void setPre_add(String pre_add) {
		this.pre_add = pre_add;
	}

	public String getPer_add() {
		return per_add;
	}

	public void setPer_add(String per_add) {
		this.per_add = per_add;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Timestamp getJoindate() {
		return joindate;
	}

	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String desg;
    public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

}
