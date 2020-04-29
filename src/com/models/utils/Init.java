package com.models.utils;

import com.models.people.*;
import com.models.classes.Classes;
import java.util.ArrayList;
import java.util.List;

public class Init {
    private static Common common = new Common();
        
    public static List<Teacher> initTeacher() throws Exception {
    	List<String> lines = common.readFile("PartTimeTeachers.txt");
    	List<Teacher> teacherList = new ArrayList<>();

    	for (String line : lines) {
    		String[] values = line.split(",");
    		PartTimeTeacher partTimeTeacher = new PartTimeTeacher (Integer.parseInt(values[0]),values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]), values[4], values[5], values[6]);
    		teacherList.add(partTimeTeacher);
    	}
    	lines = common.readFile("FUllTimeTeachers.txt");
    	
    	for (String line : lines) {
    		String[] values = line.split(",");
    		FullTimeTeacher fullTimeTeacher = new FullTimeTeacher(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), values[3], values[4], values[5]);
            teacherList.add(fullTimeTeacher);
    	}
    	
    	return teacherList;
    }

    public static List<Student> initStudents() throws Exception {
    	List<String> lines = common.readFile("Students.txt");
    	List<Student> studentList = new ArrayList<>();

    	for (String line : lines) {
    		String[] values = line.split(",");

    		Student student = new Student(Integer.parseInt(values[0]), values[1], values[2], values[3]);
    		studentList.add(student);
    	}
    	return studentList;
    }
    
    public static List<Classes> initClasses() throws Exception {

        List<Classes> classesList = new ArrayList<>();

        Classes classes1 = new Classes(101, "How to make Orange Juice", "104A", 1020, getStudentPerClass1());
        Classes classes2 = new Classes(102, "How to cut an Apple", "204A", 2020, getStudentPerClass2());
        Classes classes3 = new Classes(103, "How to peel a Mango", "304A", 1023, getStudentPerClass3());
        Classes classes4 = new Classes(104, "How to peel a Banana", "404A", 2021, getStudentPerClass4());
        
        classesList.add(classes1);
        classesList.add(classes2);
        classesList.add(classes3);
        classesList.add(classes4);

        
        return classesList;
        
    }

    private static List<Student> getStudentPerClass1() throws Exception {
        Student firstStudent = new Student(3020,"Ivan", "Diaz", "11/01/2019");
        Student SeccondStuddent = new Student(3021,"Fredy","Peña","12/07/2018");
        
        List<Student> students = new ArrayList<>();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        
        return students;
    }

    private static List<Student> getStudentPerClass2() throws Exception {
        Student firstStudent = new Student(3022,"Carol","Bohorq","11/01/2017");
        Student SeccondStuddent = new Student(3023,"Felipe","Jimenez","12/01/2016");
        
        List<Student> students = new ArrayList<>();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        
        return students;
    }
    
    private static List<Student> getStudentPerClass3() throws Exception {
        Student firstStudent = new Student(3020,"Ivan", "Diaz", "11/01/2019");
        Student SeccondStuddent = new Student(3025,"Karen","Contreras","12/01/2018");
        
        List<Student> students = new ArrayList<>();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        
        return students;
    }
    
    private static List<Student> getStudentPerClass4() throws Exception {
        Student firstStudent = new Student(3023,"Felipe","Jimenez","12/01/2016");
        Student SeccondStuddent = new Student(3024,"Oscar","Valencia","11/07/2019");
        
        List<Student> students = new ArrayList<>();
        students.add(firstStudent);
        students.add(SeccondStuddent);
        
        return students;
    }



    

    
}