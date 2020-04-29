package com.models.people;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher extends People{
	
	private String faculty;
	private int experienceYears;
		
	public Teacher(String faculty, int experienceYears, int cid, String firstName, String lastName, String vinculationDate) throws Exception {
		super(cid, firstName, lastName, vinculationDate);
		this.faculty = faculty;
		this.experienceYears = experienceYears;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getExperienceYears() {
		return experienceYears;
	}	
		
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	public abstract double calculateSalary();

}
