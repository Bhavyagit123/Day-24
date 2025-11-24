package com.codegnan.oop;

import java.util.Scanner;

public class Employee extends Worker {
	 public Employee(int id, int salary) {
	        super(id, salary);  // calling superclass constructor
	    }
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int id = sc.nextInt();
	        int salary = sc.nextInt();

	        Employee emp = new Employee(id, salary); // triggers Worker constructor

}
}