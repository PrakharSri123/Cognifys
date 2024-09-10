import java.util.Scanner;
import java.util.Random;

public class GussingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;  // Random number between 1 and 100
        int numberOfTries = 0;
        int guess;
        boolean hasWon = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasWon = true;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
