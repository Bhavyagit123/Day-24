package com.codegnan.oop;

import java.util.Scanner;

public class CardioWorkOut extends WorkOut {
	// Method 1: calories2 × 1.5 (rounded down), capped at 1000
    public int computeMethod1(int calories2) {
        int result = (int) Math.floor(calories2 * 1.5);
        return Math.min(result, 1000);
    }

    // Method 2: fixed 30 calories
    public int computeMethod2(int fixed) {
        return 30;
    }

    // Method 3: calories3 × 1.5 + 30 (rounded down), capped at 1000
    public int computeMethod3(int calories3) {
        int result = (int) Math.floor(calories3 * 1.5 + 30);
        return Math.min(result, 1000);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int calories = sc.nextInt();
        int calories2 = sc.nextInt();
        int fixedInput = sc.nextInt(); 
        int calories3 = sc.nextInt();

        CardioWorkOut cw = new CardioWorkOut();

        // Using super setters via subclass object
        cw.setMemberId(id);
        cw.setCalories(calories);

        // Compute outputs
        int m1 = cw.computeMethod1(calories2);
        int m2 = cw.computeMethod2(fixedInput);
        int m3 = cw.computeMethod3(calories3);

        // Print results
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(cw.getMemberId());
        System.out.println(cw.getCalories());

}
}


