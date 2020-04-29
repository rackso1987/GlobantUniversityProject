package com.models.people;

import static com.models.utils.Init.initClasses;
import java.util.List;
import com.models.classes.Classes;

public class FullTimeTeacher extends Teacher{
	
    private List<Classes> classesList;

	public FullTimeTeacher (String faculty, int experienceYears, int cid, String firstName, String lastName, String vinculationDate) throws Exception {
		super(faculty, experienceYears, cid, firstName, lastName, vinculationDate);
		this.classesList = initClasses();
	}
	
	@Override
	public double calculateSalary () {
		double salary = 1000.0;
		double Bonus = getExperienceYears() * 0.10;
		return salary + (salary * Bonus);
	}
	
	@Override
    public String toString() {
        return "CID= " + getCid() + 
                "\tFirst Name= " + getFirtsName()+
                "\tLast Name= " + getLastName() +
                "\tVinvulation Date= " + getVinculationDate() +
                "\tExperience= " + getExperienceYears() +
                "\tFaculty= " + getFaculty() +
                "\tSalary= " + this.calculateSalary();
    }
}
