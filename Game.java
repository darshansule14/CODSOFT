package com.game;

import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {

        int answer = (int) (Math.random() * 100) + 1;

        int tries = 5;

        Scanner input = new Scanner(System.in);

        boolean correct = false;
        System. out.println("I'm thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
        
        while (tries > 0) {
            System. out.println("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == answer) {
                System.out.println("The actual answer is: "+ answer);
                System. out.println("\nYou guessed the number!\nYou win!");
                break;
            }
            else if (guess > answer) {
                System.out.println("Your guess is too high.\nYou have " + (tries - 1) + " tries left.\n");
                tries--;
            }
            else {
                System.out.println("Your guess is too low.\nYou have " + (tries - 1) + " tries left.\n");
                tries--;
            }
        }
        while(tries==0) {
            System.out.println("The actual answer is: " + answer);
            System.out.println("\nYou ran out of tries.\nYou lose!");
            break;
        }            
    }
}