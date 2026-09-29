import java.util.Scanner;

/*
 * Program guesses the user's number through a binary search algorithm. Also supports the option to
 * replay.
 * 
 */
public class GuessingGame {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equals("yes")) {
            // the number range in the game is between 1-1000
            int low = 1;
            int high = 1000;

            while (low <= high) {
                // binary search algorithm
                int guess = (low + high) / 2;

                System.out.print("Is it " + guess + "? (h/l/c) ");
                String answer = INPUT.nextLine();
                System.out.println("You said: " + answer);

                if (!answer.equals("h") && !answer.equals("l") && !answer.equals("c")) {
                    System.out.println("Invalid choice. Please try again.");
                } else if (answer.equals("h")) {
                    low = guess + 1;
                } else if (answer.equals("l")) {
                    high = guess - 1;
                } else {
                    System.out.println("Your answer is " + guess + ". Thank you for playing!");
                    break;

                }

            }
            // Option to replay
            System.out.println("Play again? Type yes or no:");
            playAgain = INPUT.nextLine().toLowerCase();

            if (playAgain.equals("no")) {
                System.out.println("Thank you for playing!");
            }

        }
        INPUT.close();

    }
}
