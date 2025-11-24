package com.codegnan.oop;

import java.util.Scanner;

public class CorporateDonation extends Donation {
	// Method 1: amount2 × 4 (capped at 10000)
    public int computeMethod1(int amount2) {
        int result = amount2 * 4;
        return Math.min(result, 10000);
    }

    // Method 2: fixed 40
    public int computeMethod2(int fixed) {
        return 40;
    }

    // Method 3: amount3 × 4 + 40 (capped at 10000)
    public int computeMethod3(int amount3) {
        int result = amount3 * 4 + 40;
        return Math.min(result, 10000);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int amount = sc.nextInt();
        int amount2 = sc.nextInt();
        int fixedInput = sc.nextInt();
        int amount3 = sc.nextInt();

        CorporateDonation cd = new CorporateDonation();

        // Using super setters via subclass object
        cd.setDonorId(id);
        cd.setAmount(amount);

        int m1 = cd.computeMethod1(amount2);
        int m2 = cd.computeMethod2(fixedInput);
        int m3 = cd.computeMethod3(amount3);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(cd.getDonorId());
        System.out.println(cd.getAmount());
    }
}


