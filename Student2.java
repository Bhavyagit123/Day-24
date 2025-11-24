package com.codegnan.oop;

import java.util.Scanner;

public class Student2 extends Person1 {
	public Student2(String name) {
        super(name);   // calling superclass constructor
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Student2 s = new Student2(name); // triggers Person constructor

}
    }
