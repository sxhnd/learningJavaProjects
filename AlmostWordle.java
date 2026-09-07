
/**
 * This program is designed to be an attempt at a Wordle game. The program pulls from one
 * five-letter word from a small word bank.
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class AlmostWordle {

    public static void main(String[] args) {
        /**
         * 1. create an array that stores a couple words 2. have program select random word 3. while
         * loop where playAgain = yes 4. while loop where guesses are less than 6 5. only accept
         * string input when it = 5 letters 6. for each correct letter show correct position or
         * incorrect position or letter not in word 7. game ends when either 6 guesses are up or
         * when user guesses word 8. user prompted with whether they want to play again or not
         */
        // DECLARE VARIABLES
        Scanner INPUT = new Scanner(System.in);

        // Create an array
        String str1 = "crane";
        String str2 = "plant";
        String str3 = "mouse";
        String str4 = "brick";
        String str5 = "train";
        String str6 = "water";
        String[] list = { str1, str2, str3, str4, str5, str6 };
        // make program pull a word from the array


        String playAgain = "yes";
        while (playAgain.equals("yes")) {
            Random random = new Random();
            int index = random.nextInt(list.length);
            String word = list[index];
            int userGuesses = 0;
            while (userGuesses <= 5) {
                System.out.println("Enter a five letter word:");
                String answer = INPUT.nextLine();
                if (answer.length() != 5) {
                    System.out.println("Invalid Input. Please input a five letter word.");
                    continue;
                }
                userGuesses++;

                for (int i = 0; i < 5; i++) {
                    char answerLetter = answer.charAt(i);
                    char wordLetter = word.charAt(i);

                    if (answerLetter == wordLetter) {
                        System.out.println(answerLetter + " - correct spot");
                    } else if (word.indexOf(answerLetter) != -1) {
                        System.out.println(answerLetter + " - in the wrong spot");
                    } else {
                        System.out.println(answerLetter + " - not in word");
                    }
                }
                if (answer.equals(word)) {
                    System.out.println("Congrats! You guessed the word.");
                    break;
                }

            }
            System.out.println("Do you wish to play again? Type yes or no");
            playAgain = INPUT.nextLine().toLowerCase();
            if (playAgain.equals("no")) {
                System.out.println("Thank you for playing!");
            } else if (!playAgain.equals("yes") && !playAgain.equals("no")) {
                System.out.println("Invalid input. Please type yes or no.");
                return;

            }

        }
        INPUT.close();
    }
}