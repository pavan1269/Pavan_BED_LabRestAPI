package com.gl.student.dto;

public class StudentDTO {
	public String fName;
	public String lName;
	public String course;
	public String country;
	public StudentDTO(String fName, String lName, String course, String country) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.course = course;
		this.country = country;
	}
	
	
	public StudentDTO() {
		super();
	}


	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
