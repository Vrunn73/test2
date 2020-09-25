package com.Main;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        System.out.println("\n\n                ~~~~~~~~~~~~~~~~MORTGAGE CALCULATOR~~~~~~~~~~~~~~~~~~\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("              Principal : ");
        double P = scan.nextDouble();
        System.out.print("              Rate      : ");
        double R = scan.nextDouble();
        R /= 100d;  //Rate divided by 100 as it is percentage
        System.out.print("              Months    : ");
        int months = scan.nextInt();
        double N =(double)months/12d;
        double Rn = Math.pow(1+R,N); //(1=R)^N is repeated twice in mortgage formula hence simplified
        double M = P*((R*Rn)/(Rn-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(M);
        System.out.println("                Your Mortgage is "+mortgage);

        }

    }

