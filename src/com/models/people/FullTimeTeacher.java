package com.models.people;

public class FullTimeTeacher extends Teacher{
	
	public FullTimeTeacher (String faculty, int experienceYears, int cid, String firstName, String lastName, String vinculationDate) throws Exception {
		super(faculty, experienceYears, cid, firstName, lastName, vinculationDate);
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
