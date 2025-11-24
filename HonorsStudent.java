package com.codegnan.oop;

import java.util.Scanner;

public class HonorsStudent extends Student1 {
	// Method 1: average of array (rounded down, capped at 100)
    public int computeAverage(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        int avg = sum / arr.length; // floor by default
        return Math.min(avg, 100);
    }

    // Method 2: grade + 15 (capped at 100)
    public int computeAdjusted(int grade) {
        int result = grade + 15;
        return Math.min(result, 100);
    }

    // Method 3: average + 10 (rounded down, capped at 100)
    public int computeBonusAverage(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        int avg = sum / arr.length; 
        int finalVal = avg + 10;
        return Math.min(finalVal, 100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student ID
        int id = sc.nextInt();

        // Student grades
        int n = sc.nextInt();
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) grades[i] = sc.nextInt();

        // Method 1 input
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        // Method 2 input
        int gradeForAdjust = sc.nextInt();

        // Method 3 input
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) arr3[i] = sc.nextInt();

        HonorsStudent hs = new HonorsStudent();

        // Accessing superclass setters
        hs.setStudentId(id);
        hs.setGrades(grades);

        // Process outputs
        int m1 = hs.computeAverage(arr2);
        int m2 = hs.computeAdjusted(gradeForAdjust);
        int m3 = hs.computeBonusAverage(arr3);

        // Display
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(hs.getStudentId());
        System.out.println(hs.getGradesSum());
    }


}
