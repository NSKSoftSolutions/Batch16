package com.snycon.bean;

import java.util.Set;

public class Organization {

	private String orgname;
	private String orgaddress;
	private String phone;
	private String orgemail;
	private String city;
	private String state;
	private String country;
	private Set departmentdetails;
	
	public Set getDepartmentdetails() {
		return departmentdetails;
	}
	public void setDepartmentdetails(Set departmentdetails) {
		this.departmentdetails = departmentdetails;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgaddress() {
		return orgaddress;
	}
	public void setOrgaddress(String orgaddress) {
		this.orgaddress = orgaddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOrgemail() {
		return orgemail;
	}
	public void setOrgemail(String orgemail) {
		this.orgemail = orgemail;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
