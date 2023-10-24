package com.pksoftware.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PKCollege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_no;
	private int collegeCode=22104;
	private String collegeName="P.K.College Prayagraj";
	private String stdName;
	private String stdAdd;
	private int age;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	private float fee;
	
	
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public int getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAdd() {
		return stdAdd;
	}
	public void setStdAdd(String stdAdd) {
		this.stdAdd = stdAdd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
}
