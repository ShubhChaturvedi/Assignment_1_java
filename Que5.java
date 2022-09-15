package com.oops.assignment1;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        float marks = input.nextFloat();
        if (marks > 80 && marks<=100){
            System.out.println("your grade = A");
        }
        else if(marks > 60 && marks<=80){
            System.out.println("your grade = B");
        }
        else if(marks > 50 && marks<=60){
            System.out.println("your grade = C");
        }
        else if(marks > 45 && marks<=50){
            System.out.println("your grade = D");
        }
        else if(marks > 25 && marks<=45){
            System.out.println("your grade = E");
        }
        else if(marks>=0  && marks<=25){
            System.out.println("your grade = F");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
