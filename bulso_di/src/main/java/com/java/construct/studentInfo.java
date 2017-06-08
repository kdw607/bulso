package com.java.construct;

public class studentInfo {

	private Student student;
	
	public studentInfo(Student student){
		this.student = student;
	}
	
	public void getStudentInfo() {

		if(student != null){
			System.out.println("이름 : " + student.getName());
			System.out.println("나이 : " + student.getAge());
			System.out.println("학년 : " + student.getGradeNum());
			System.out.println("반 : " + student.getClassNum());
		}
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
