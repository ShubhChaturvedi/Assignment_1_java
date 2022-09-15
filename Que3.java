package com.oops.assignment1;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity of product");
        int quantity = input.nextInt();
        int cost = quantity*100;
        cost = cost>1000 ? cost - (cost/10):cost;
        System.out.println("Payable amount = " + cost);
    }
}
