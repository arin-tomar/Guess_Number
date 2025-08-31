import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfTries = 0;
        int guess = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            try {
                guess = scanner.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("❗ Please enter a number between 1 and 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("📉 Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("📈 Too high! Try again.");
                } else {
                    System.out.println("✅ Congratulations! You guessed the number in " + numberOfTries + " tries.");
                }

            } catch (Exception e) {
                System.out.println("❌ Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
