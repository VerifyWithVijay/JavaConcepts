package myPackage;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts=0;

        while(true) {
            guess = scanner.nextInt();
            attempts++;

            if(guess<numberToGuess)
            {
                System.out.println("The number is low: Try Again!! ");
            }
            else if(guess>numberToGuess)
            {
                System.out.println("The number is High: Try Again!! ");
            }
            else
            {
                System.out.println("Correct! You guessed the correct number "+ attempts +" in attempts");
            }

        }

    }
}
