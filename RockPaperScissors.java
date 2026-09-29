import java.util.Scanner;
import java.util.Random;

/*
 * Program is a basic rock, paper, scissors game between the user and the program. Game ends when
 * either the program or the user reaches five wins. User has the ability to replay the game and the
 * program terminates once the user doesn't wish to replay the game.
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        // user input
        Scanner INPUT = new Scanner(System.in);
        // declare VARIABLES
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        // introduce game to user
        System.out.println("Welcome to Rock, Paper, Scissors!(first to 5 wins)");
        String playAgain = "yes";
        // while loop so user can replay game
        while (playAgain.equals("yes")) {
            // resets score to 0-0 after every replay
            int humanWins = 0;
            int computerWins = 0;
            // while loop so game is first to 5
            while (humanWins < 5 && computerWins < 5) {

                System.out.println("Please choose between rock, paper, or scissors.");

                // Creates array & makes computer pick one randomly
                String[] options = { rock, paper, scissors };
                Random random = new Random();
                int index = random.nextInt(options.length);
                String computerChoice = options[index];

                // User input
                String answer = INPUT.nextLine();
                if (!answer.equals(rock) && !answer.equals(scissors) && !answer.equals(paper)) {
                    System.out.println("Invalid choice. Please pick rock, paper, or scissors.");
                    continue;
                }
                System.out.println("Computer chose: " + computerChoice);

                /*
                 * all # possible combinations (3 draw outcomes, 3 user win outcomes, & everything
                 * else = loss)
                 */
                if (answer.equals(computerChoice)) {
                    System.out.println("Draw!");
                } else if ((answer.equals(rock) && computerChoice.equals(scissors))
                    || (answer.equals(paper) && computerChoice.equals(rock))
                    || (answer.equals(scissors) && computerChoice.equals(paper))) {
                    humanWins++; // post-increment operator gets the value of variable & adds one
                    System.out.println("You won!");
                } else {
                    computerWins++;
                    System.out.println("You lost.");
                }

                System.out.println("Score - You: " + humanWins + " Computer: " + computerWins);
            }
            // announces who won after a game player reaches 5 wins
            if (humanWins == 5) {
                System.out.println("\nYou won the game!");
            } else {
                System.out.println("\n You lost.");
            }
            // replay option
            System.out.println("Play again? Type yes or no:");
            playAgain = INPUT.nextLine().toLowerCase();

            if (playAgain.equals("no")) {
                System.out.println("Thank you for playing!");
            }
        }
        INPUT.close(); // closes scanner
    }

}
