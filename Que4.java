package com.oops.assignment1;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary = ");
        double salary = input.nextDouble();
        System.out.print("Enter Years = ");
        int years = input.nextInt();
        double bonus;
        if (years > 5) {
            bonus = salary * (5.0 / 100.0);
        } else {
            bonus = 0.0;
        }
        System.out.println("bonus will be = " + bonus);
    }
}
