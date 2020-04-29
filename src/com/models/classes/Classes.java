package com.models.classes;

import java.util.List;
import com.models.people.Student;

public class Classes {

	private int classId;
	private String className;
	private String classroom;
	private int teacherId;
	private List<Student> studentPerClass;
    
    public Classes (int classId, String className, String classroom, int teacherId, List<Student> studentPerClass) {
    	this.classId = classId;
    	this.className = className;
    	this.classroom = classroom;
    	this.teacherId = teacherId;
    	this.studentPerClass = studentPerClass;    	
    }

    
    public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public List<Student> getStudentPerClass() {
		return studentPerClass;
	}

	public void setStudentPerClass(List<Student> studentPerClass) {
		this.studentPerClass = studentPerClass;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	@Override
    public String toString() {
        return "Class ID= " + classId + '\'' +
        		"Class Name= " + className + 
                ", Classroom= " + classroom;
    }
}
