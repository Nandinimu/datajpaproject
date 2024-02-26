package com.nandini.springdatajpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "members")
public class Member {

	@Id
	private int memberid;
	private String name;
	private String gender;
	private int age;
	private String mobile;
	private int joiningyr;

	public Member() {
		super();
	}

	public Member(int memberid, String name, String gender, int age, String mobile, int joiningyr) {
		super();
		this.memberid = memberid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobile = mobile;
		this.joiningyr = joiningyr;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getjoiningyr() {
		return joiningyr;
	}

	public void setjoiningyr(int joiningyr) {
		this.joiningyr = joiningyr;
	}

}
