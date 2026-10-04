# learningJavaProjects

Small Java programs I wrote while learning the language. Each one is a single file that runs in the terminal.

## Programs

| File | What it does |
|---|---|
| `AlmostWordle.java` | My attempt at Wordle. It picks a random five-letter word from a short list and gives you 6 guesses. After each guess it goes through your word letter by letter and says if that letter is in the correct spot, in the wrong spot, or not in the word. |
| `GuessingGame.java` | You think of a number from 1 to 1000 and the program guesses it with binary search. Type `h` if your number is higher, `l` if it's lower, and `c` when it gets it. It never needs more than 10 guesses since 2^10 = 1024. |
| `ATMTracker.java` | Asks for a PIN and locks the account after 3 wrong tries. Once you're in, you enter a starting balance and can check it, deposit, or withdraw. It won't let you withdraw more than you have. |
| `RockPaperScissors.java` | Rock paper scissors against the computer. First to 5 wins, then you can play again. |
| `RideAdmissionChecker.java` | Asks for your age, your height, whether an adult is with you, and whether you have a ticket. Then it either admits you or tells you why not. Height has to be 48 to 78 inches, kids under 12 need an adult, and you need a ticket. |
| `ScoreTracker.java` | Takes test scores from 0 to 100 until you enter -1, then prints the total, highest score, average, and letter grade. |
| `MultiplicationTable.java` | Prints the multiplication table for a number between a start and end you pick, and adds up the products at the end. |
| `ReviewMidterm.java` | Menu program I made to study for my midterm. It converts a number to binary, prints a number triangle, shifts a letter forward by one (z wraps back to a), and averages a list of numbers using int and double division so you can compare them. |

## Running a program

You need a JDK installed. I'm on Java 21. From the repo folder:

```
javac GuessingGame.java
java GuessingGame
```

Same two commands for any of the other files, just change the name.

The input checking is pretty basic right now. If a program asks for a number and you type a word, it will crash.
