package com.models.people;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People {
	
	private int cid;
	private String firstName;
	private String lastName;
	private Date vinculationDate;
	
	public People(int cid, String firstName, String lastName, String vinculationDate) throws Exception {
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(vinculationDate);  
		this.vinculationDate = date1;
	}

	public int getCid() {
		return this.cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getFirtsName () {
		return this.firstName;
	}
	
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	public String getLastName () {
		return this.lastName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public Date getVinculationDate () {
		return this.vinculationDate;
	}
	
	public void setVinculationDate (String vinculationDate) throws ParseException {
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(vinculationDate);
		this.vinculationDate = date1;
	}
	
    @Override
    public String toString() {
        return "CID='" + cid + '\'' +
                ", First Name=" + firstName +
                ", Last Name=" + lastName +
                ", Vinvulation Date=" + vinculationDate;

    }
}
