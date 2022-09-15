package com.oops.assignment1;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {

        int max=Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        int fNo = input.nextInt();
        int sNo = input.nextInt();
        if(fNo>sNo){
            max=fNo;
        }
        else{
            max=sNo;
        }
        System.out.println("Max Value is = " + max);
    }

}
