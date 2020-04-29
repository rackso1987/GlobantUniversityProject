package com.models.people;

import java.util.List;
import com.models.classes.Classes;
import com.models.university.GlobantUniversity;
import static com.models.utils.Init.*;


public class PartTimeTeacher extends Teacher {
	
    private int classHour;
	
	public PartTimeTeacher (int classHours, String faculty, int experienceYears, int cid, String firstName, String lastName, String vinculationDate) throws Exception {
	super(faculty, experienceYears, cid, firstName, lastName, vinculationDate);
	this.classHour = classHours;

	}
	
	public int getClassHour() {
		return classHour;
	}

	public void setClassHour(int classHour) {
		this.classHour = classHour;
	}

	@Override
	public double calculateSalary() {
		
		double hourValue = 45; 
		return hourValue * this.classHour;
	}
	
	@Override
    public String toString() {
        return "CID= " + getCid() + 
                "\tFirst Name= " + getFirtsName()+
                "\tLast Name= " + getLastName() +
                "\tVinvulation Date= " + getVinculationDate() +
                "\tExperience= " + getExperienceYears() +
                "\tFaculty= " + getFaculty() +
                "\tSalary= " + this.calculateSalary() +
                "\tHours per Week= " + this.getClassHour(); 
	}
}

