package com.codegnan.oop;

public class Student1 {
	private int studentId;
    private int[] grades;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getGrades() {
        return grades;
    }

    public int getGradesSum() {
        int sum = 0;
        for (int g : grades) sum += g;
        return sum;
    }


}
