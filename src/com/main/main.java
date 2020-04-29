package com.main;

import java.util.Scanner;

import com.models.people.PartTimeTeacher;
import com.models.university.GlobantUniversity;

public class main {

	public static void main(String[] args) throws Exception {

		int operationType;
		Scanner reader = new Scanner(System.in);

		GlobantUniversity globantUniversity = new GlobantUniversity();
		
		do {
			System.out.println("Welcome to Globant University! Enter what operation do you want to do?\n1. Print all the professors.\n2. Print all Classes.\n3. Create a New Student.\n4. Create a New Teacher.\n5. Create a New Class.\n6. Search by Student ID.\n0 to Exit.");
			operationType = reader.nextInt();
		
			if(operationType!=0) {
				globantUniversity.operations(operationType);
					}
			}while (operationType!=0);
	}

		
}


