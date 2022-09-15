package com.oops.assignment1;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of classes held = ");
        int held = input.nextInt();
        System.out.print("Enter attended classes = ");
        double attended = input.nextDouble();
        double prcntg = (attended*100)/held;
        // int prcntg = tempPrcntg*100;
        System.out.println("Percentage of attended classes = "+prcntg+"%");
        if(prcntg>75){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
