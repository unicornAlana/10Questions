package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int) (Math.random() * 101);
        System.out.println("Guess a number between(and including) 0 and 100. You have 10 chances to get it right.");
        int numGuesses = 0;
        int guessNum= -1;
        while (guessNum != num && numGuesses < 10) {
            numGuesses += 1;
            guessNum = input.nextInt();
            if (guessNum > num) {
                System.out.println("Too high! Guess again!");
            }
            else if (guessNum < num) {
                System.out.println("Too low! Guess again!");
            }

        }
        if (guessNum == num)
        {
            System.out.println("You got it!");
            System.out.println("Your score was " + numGuesses + " !");
        }

        if (numGuesses >= 10)
        {
            System.out.println("You lose! The number was " + num + " !");
        }
    }


    }

