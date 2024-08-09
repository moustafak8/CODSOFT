package com.mk7.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int x = (int) (Math.random() * (100 - 1) + 1);
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int num = 30;
        System.out.println("you have " + (num) + " attempts to guess the number correctly");

        while (count != num) {
            System.out.println(" enter your guess for the generated number:");
            int g = scan.nextInt();

            if (x == g) {
                System.out.println("your guess is correct!");
                System.out.println("your score is " + (count) + "  attempts");
                break;
            } else if (x < g) {
                System.out.println("your guess is too high!");
            } else {
                System.out.println("your guess is too low ");
            }
            count++;
            System.out.println("you have " + (num - count) + " attempts to guess the number correctly");
        }
        if (count == num) {
            System.out.println("sorry you have reached the maximum attempts you have !");
        }
    }
}
