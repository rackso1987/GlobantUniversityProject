package com.models.university;

import static com.models.utils.Init.*;

import java.util.ArrayList;
import java.util.List;

import com.models.classes.Classes;
import com.models.people.*;
import java.util.Scanner;

public class GlobantUniversity {

	private List<Student> studentList;
	private List<Classes> classesList;
	private List<Teacher> teacherList;
	public int control;
	public int classId;
	public int studentId;
	
	public GlobantUniversity () throws Exception {
		this.studentList = initStudents();
		this.classesList = initClasses();
		this.teacherList = initTeacher();
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Classes> getClassesList() {
		return classesList;
	}

	public void setClassesList(List<Classes> classesList) {
		this.classesList = classesList;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public void operations (int operationType) throws Exception {
	
		Scanner reader = new Scanner(System.in);

		switch (operationType) {
		case 1: //Print All Teachers
			System.out.println("Following the all teachers list: ");
			this.getTeacherList().forEach(teachers -> System.out.println(teachers.toString()));
		break;
		case 2: //Print All Classes
			control = 0;
			System.out.println("List of Clases: ");
			this.getClassesList().forEach(Classes -> System.out.println(Classes.toString()));
			System.out.println("Enter the ID of the class for which you want details: ");
			classId = reader.nextInt();
			
			for (int i=0; i < classesList.size(); i++) {
				if (classId == classesList.get(i).getClassId()) {
					control = 1;
					System.out.println("Class ID= " + classesList.get(i).getClassId() +
									"\tClass Name= " + classesList.get(i).getClassName() + 
									"\tClassroom= " + classesList.get(i).getClassroom());
					for (int j=0; j < teacherList.size(); j++) {
						if (classesList.get(i).getTeacherId() == teacherList.get(j).getCid()) {
							System.out.println("Teacher Name= " + teacherList.get(j).getFirtsName() + " " + teacherList.get(j).getLastName());
						}
					}
					System.out.println("Students List=");
					for (int k=0; k < classesList.get(i).getStudentPerClass().size(); k++) {
						System.out.println("Student ID= " + classesList.get(i).getStudentPerClass().get(k).getCid() + "\tName= " + classesList.get(i).getStudentPerClass().get(k).getFirtsName() + " " + classesList.get(i).getStudentPerClass().get(k).getLastName());	
					}
				}
			}
			if (control == 0) {
				System.out.println("Class ID does not exist. Please try again");
			}
		break;
		case 3: //Create a New Student
			control = 0;
			System.out.println("Enter the ID of the new Student: ");
			studentId = reader.nextInt();
			System.out.println("Enter the First Name of the new Student: ");
			String studentFirstName = reader.next();
			System.out.println("Enter the Last Name of the new Student: ");
			String studentLastName = reader.next();
			System.out.println("Enter the Vinculation Date (dd/MM/yyyy): ");
			String studentVinculationDate = reader.next();
			System.out.println("Introduce the Class ID from the list of clases: ");
			this.getClassesList().forEach(Classes -> System.out.println(Classes.toString()));
			classId = reader.nextInt();
			for (int i = 0; i < classesList.size(); i++) {
				if(classId == classesList.get(i).getClassId()) {
					control = 1;
					studentList.add(new Student(studentId, studentFirstName, studentLastName, studentVinculationDate));
					classesList.get(i).getStudentPerClass().add((new Student(studentId, studentFirstName, studentLastName, studentVinculationDate)));
					System.out.println("Student creation was made.");
				}
			}
			if (control == 0) {
				System.out.println("Class ID does not exist. Please try again");
			}
		break;
		case 4: // Create a new teacher
			control = 0;
			//
			System.out.println("Enter the type of teacher you want to create:\n1. Full Time\n2. Part Time");
			int teacherType = reader.nextInt();
			if (teacherType == 1) {
				System.out.println("Enter the ID of the new Teacher: ");
				int teacherId = reader.nextInt();
				System.out.println("Enter the First Name of the new Teacher: ");
				String teacherFirstName = reader.next();
				System.out.println("Enter the Last Name of the new Teacher: ");
				String teacherLastName = reader.next();
				System.out.println("Enter the Vinculation Date (dd/MM/yyyy): ");
				String teacherVinculationDate = reader.next();
				System.out.println("Enter the Years of Experience : ");
				int teacherExperienceYears = reader.nextInt();
				System.out.println("Enter the name of the Faculty: ");
				String teacherFacultyDate = reader.next();
				teacherList.add(new FullTimeTeacher(teacherFacultyDate, teacherExperienceYears, teacherId, teacherFirstName, teacherLastName, teacherVinculationDate));
				System.out.println("Teacher creation was made");
			} else if (teacherType == 2) {
				System.out.println("Enter the ID of the new Teacher: ");
				int teacherId = reader.nextInt();
				System.out.println("Enter the First Name of the new Teacher: ");
				String teacherFirstName = reader.next();
				System.out.println("Enter the Last Name of the new Teacher: ");
				String teacherLastName = reader.next();
				System.out.println("Enter the Vinculation Date (dd/MM/yyyy): ");
				String teacherVinculationDate = reader.next();
				System.out.println("Enter the Years of Experience : ");
				int teacherExperienceYears = reader.nextInt();
				System.out.println("Enter the name of the Faculty: ");
				String teacherFacultyDate = reader.next();
				System.out.println("Enter the Hours of Class assigned : ");
				int classHours = reader.nextInt();
				teacherList.add(new PartTimeTeacher(classHours, teacherFacultyDate, teacherExperienceYears, teacherId, teacherFirstName, teacherLastName, teacherVinculationDate));
				System.out.println("Teacher creation was made");
			} else {
				System.out.println("Invalid teacher type. Please try again");	
			}
		break;
		case 5: // Create a New Class
			List<Student> studentsPerClass = new ArrayList<>();
			System.out.println("Enter the ID of the new Class: ");
			int classId = reader.nextInt();
			System.out.println("Enter the Name of the new Class: ");
			String className = reader.next();
			System.out.println("Enter the Classroom of the new Class: ");
			String classroom = reader.next();
			System.out.println("Following the all teachers list, Please enter the teacher ID of the new Class: ");
			this.getTeacherList().forEach(teacher -> System.out.println("Id= " + teacher.getCid() +"\tNombre= " + teacher.getFirtsName() + " " + teacher.getLastName()));;
			int teacherId = reader.nextInt();
			System.out.println("Following the Student List");
			this.getStudentList().forEach(student -> System.out.println("Id= " + student.getCid() +"\tNombre= " + student.getFirtsName() + " " + student.getLastName()));
			do {
				System.out.println("Please enter the Student ID to include to the New Claas or 0 to Exit.");
				this.studentId = reader.nextInt();
				control = 0;
				if (studentId != 0) {
					for (int i=0; i < this.getStudentList().size(); i++) {
						if (this.studentId == this.getStudentList().get(i).getCid()) {
							control = 1;
							studentsPerClass.add(this.getStudentList().get(i));
							System.out.println("Student " + this.getStudentList().get(i).getFirtsName() + " " + this.getStudentList().get(i).getLastName() + " was admitted");
						}
					}
				if (control == 0) {
					System.out.println("Student does not exist.");
				}
				}
			}while(this.studentId != 0);
			if (studentsPerClass.size() == 0) {
				System.out.println("You must include at least one estudent to the class. Please try again");
			} else {
				classesList.add(new Classes(classId, className, classroom, teacherId, studentsPerClass));
			}
		break;
		case 6: //6. Search by Student ID.
			control = 0;
			System.out.println("Enter the Student number ID: ");
			studentId = reader.nextInt();
			System.out.println("The student is enrolled in the following classes: ");
			for(int i = 0; i < classesList.size(); i++) {
				for(int j = 0; j < classesList.get(i).getStudentPerClass().size(); j++) {
					if(studentId == classesList.get(i).getStudentPerClass().get(j).getCid()) {
						control = 1;
						System.out.println("Class ID= " + classesList.get(i).getClassId() + "\tClass Name= " + classesList.get(i).getClassName() + "\tClassroom= " + classesList.get(i).getClassroom());
					}
				
				}
			}
			if (control == 0) {
				System.out.println("Student ID does not exist.");
			}
		break;
		default:
			System.out.println("You chose a wrong option.");
		}
	}
}