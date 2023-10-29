import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int score = 0;
        int maxAttempts = 10;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int attempts = 0;
            int randnum = new Random().nextInt(1, 100);


            System.out.println("randomly generating a number between 1 and 100");
            System.out.println("Guess the number in " + maxAttempts + " attempts");

            while (attempts < maxAttempts) {
                System.out.print("guess a mumber between 1-100: ");
                int guess = read.nextInt();
                attempts++;

                if (guess == randnum) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < randnum) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The ramdom generated number is: " + randnum);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = read.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Game Over! Your score is: " + score);
        read.close();
    }
}

