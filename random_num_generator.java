import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int numberOfAttempts = 5; // Limit the number of attempts
            int attemptsMade = 0;
            boolean hasGuessedCorrectly = false;
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a number between 1 and 100. Can you guess it?");
            
            while (attemptsMade < numberOfAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsMade++;
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    totalScore += (numberOfAttempts - attemptsMade + 1); // Higher score for fewer attempts
                    hasGuessedCorrectly = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }
            
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
            }
            
            System.out.println("Your current score is: " + totalScore);
            
            System.out.print("Do you want to play another round? (yes/no): ");
            scanner.nextLine(); // Consume the newline
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        scanner.close();
    }
}
