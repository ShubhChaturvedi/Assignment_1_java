package com.oops.assignment1;

import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        //level 1


        //level 2
        // que 1
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year%4 == 0){
            if(year%100 == 0){
                if(year % 400 == 0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not leap year");
                }
            }
            else{
                System.out.println("leap year");
            }
        }
        else{
            System.out.println("not leap year");
        }

        //que 2
        int age = input.nextInt();
        char sex = input.next().charAt(0);
        char marital = input.next().charAt(0);
        if(sex == 'F'){
            System.out.println("Urban");
        }
        else if(sex == 'M' && age>=20 && age<=40){
            System.out.println("either urban or rural");
        }
        else if(sex == 'M' && age>40 && age<=60){
            System.out.println("Urban");
        }
        else{
            System.out.println("ERROR");
        }
        //que 3
        System.out.print("Enter = ");
        int entered = input.next().charAt(0);
        if(entered>=65 && entered<=90){
            System.out.print("Uppercase");
        }
        else if(entered>=97 && entered<=122){
            System.out.print("Lowercase");
        }
    }

}
