import java.util.Random;
import java.util.Scanner;



    public class Number_Game {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int score = 0;
            int roundsPlayed = 0;
            boolean playAgain = true;

            while (playAgain) {
                int number = random.nextInt(100) + 1;
                int attempts = 0;
                int maxAttempts = 10;

                System.out.println("Guess the number between 1 and 100. You have up to 10 attempts.");

                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();
                    attempts++;

                    if (guess < number) {
                        System.out.println("Too low!");
                    } else if (guess > number) {
                        System.out.println("Too high!");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                        score += maxAttempts - attempts + 1;
                        break;
                    }
                }

                if (attempts >= maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The number was " + number + ".");
                }

                roundsPlayed++;

                System.out.print("Do you want to play again? (yes/no): ");
                scanner.nextLine();  // Consume the newline
                playAgain = scanner.nextLine().equalsIgnoreCase("yes");
            }

            System.out.println("Game over! You played " + roundsPlayed + " rounds with a score of " + score + ".");
            scanner.close();
        }
    }

