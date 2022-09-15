package com.oops.assignment1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        String ans = length==breadth ? "square" : "not square";
        System.out.println(ans);
    }

}
