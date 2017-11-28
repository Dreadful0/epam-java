package com.epam.lab5.model;

import java.util.Arrays;

import com.epam.lab5.model.entities.Student;

public class StudentsDb {
	
	private Student[] students;
	private int studentsNumber;	
	
	public StudentsDb() {
		students = new Student[100];
	}
	
	public StudentsDb(int size){
		students = new Student[size];
	}
	
	public void addStudent(Student student) throws Exception{
		try {
			students[studentsNumber] = student;
			studentsNumber ++;
		} catch (IndexOutOfBoundsException e) {
			throw new Exception(e.getMessage()+"can not add student, cotainer is full");
		}
	}

	public int getStudentsNumber() {
		return studentsNumber;
	}
	
	public Student[] getStudents() {
		return Arrays.copyOf(students, studentsNumber);
	}
}
