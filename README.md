# Learning Java Projects

A set of Java console programs I built while learning the language.

![Java](https://img.shields.io/badge/java-21-ED8B00?logo=openjdk&logoColor=white)
![Dependencies](https://img.shields.io/badge/dependencies-none-lightgrey)
![License](https://img.shields.io/badge/license-MIT-green)

## Overview

Each program is a single self-contained file that runs in the terminal and uses only the standard library. Together they cover loops, conditionals, arrays, `switch` menus, input validation, random numbers, and a binary search.

## Programs

| Program | Description | Concepts |
|---|---|---|
| [`AlmostWordle`](AlmostWordle.java) | Wordle in the terminal. Picks a random five-letter word and gives you 6 guesses, with feedback on each letter. | Arrays, `Random`, string methods, nested loops |
| [`GuessingGame`](GuessingGame.java) | You think of a number from 1 to 1000 and the program finds it with binary search in 10 guesses or fewer. | Binary search, replay loop |
| [`ATMTracker`](ATMTracker.java) | PIN login with a 3-try lockout, then a menu to check balance, deposit, and withdraw. | `switch` menus, input validation |
| [`RockPaperScissors`](RockPaperScissors.java) | Rock paper scissors against the computer. First to 5 wins, with a running score. | `Random`, compound conditions |
| [`RideAdmissionChecker`](RideAdmissionChecker.java) | Decides if a rider gets in based on height, age, adult supervision, and ticket. | `if`/`else if` chains, booleans |
| [`ScoreTracker`](ScoreTracker.java) | Reads test scores until -1, then reports total, highest, average, and letter grade. | Sentinel loops, running totals |
| [`MultiplicationTable`](MultiplicationTable.java) | Prints a multiplication table over a custom range and sums the products. | `for` loops, accumulators |
| [`ReviewMidterm`](ReviewMidterm.java) | Midterm study menu: decimal to binary, number triangle, letter shift, and int vs. double averages. | Modulo math, `char` arithmetic, integer division |

## Getting started

### Requirements

A JDK, version 11 or newer. I develop on Java 21.

### Run a program

```bash
git clone https://github.com/sxhnd/learningJavaProjects.git
cd learningJavaProjects
javac GuessingGame.java
java GuessingGame
```

Swap `GuessingGame` for any other program name.

## Example

`GuessingGame` finding 343. The program asks, and the player answers `h` (higher), `l` (lower), or `c` (correct).

```text
Is it 500? (h/l/c) l
You said: l
Is it 250? (h/l/c) h
You said: h
Is it 375? (h/l/c) l
You said: l
Is it 312? (h/l/c) h
You said: h
Is it 343? (h/l/c) c
You said: c
Your answer is 343. Thank you for playing!
```

Each guess cuts the remaining range in half. Since 2^10 = 1024, any number from 1 to 1000 is found in at most 10 guesses.

## Project structure

```text
learningJavaProjects/
├── AlmostWordle.java
├── ATMTracker.java
├── GuessingGame.java
├── MultiplicationTable.java
├── ReviewMidterm.java
├── RideAdmissionChecker.java
├── RockPaperScissors.java
├── ScoreTracker.java
└── README.md
```

## Known limitations

- Programs that read numbers with `Scanner.nextInt()` crash if you type text instead.
- `AlmostWordle` marks a repeated letter as "in the wrong spot" every time it appears, even when the word only has one of it.
- All the logic in each program lives in `main`. Splitting it into methods is the next step.

## License

Released under the MIT License. See [LICENSE](LICENSE) for details.

## Author

Andre Idrissi, Math and CS student at the University of Georgia

[GitHub](https://github.com/sxhnd) · [LinkedIn](https://www.linkedin.com/in/andre-idrissi-6693b7353/)
