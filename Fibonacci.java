package com.Main;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of iterations : ");
        int iterations = scan.nextInt();
        int x= 0, y = 1;
        for (int i = 0; i <iterations ; i++) {
            int z = x + y;
            System.out.println(z);
            x=y;
            y=z;
        }
    }
}
