package com.oops.assignment1;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age = ");
        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int age3 = input.nextInt();
        int max = age1>age2?(age1>age3?age1:age3):(age2>age3?age2:age3);
        System.out.println(max);
    }
}
