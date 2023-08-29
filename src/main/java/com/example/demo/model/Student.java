package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String studentId;
	private String studentfirstName;
	private String studentlastName;
	private String studentEmail;
	public Student() {
		super();
	}
	public Student(String studentId, String studentfirstName, String studentlastName, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentfirstName = studentfirstName;
		this.studentlastName = studentlastName;
		this.studentEmail = studentEmail;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentfirstName() {
		return studentfirstName;
	}
	public void setStudentfirstName(String studentfirstName) {
		this.studentfirstName = studentfirstName;
	}
	public String getStudentlastName() {
		return studentlastName;
	}
	public void setStudentlastName(String studentlastName) {
		this.studentlastName = studentlastName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
}
