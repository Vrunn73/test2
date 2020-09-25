package com.Main;

import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = (int)(Math.random() * 25 + Math.random() * 25+Math.random() * 25 + Math.random() * 25);
        System.out.println("GUESS THE NUMBER IN MY MIND");
        int tries=1;
        double guess;
        do{
            guess = scan.nextDouble();
            if (guess == target){break;}
            String HiLo = guess<target ?"LOW":"HIGH";
            System.out.println(HiLo);
            tries++;
        }while(guess != target);
        System.out.println("\n\n~~~~¡YOU WIN! Guessed in "+tries+" tries~~~~\n\n");

    }
}