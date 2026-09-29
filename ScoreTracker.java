import java.util.Scanner;
// This program tracks test scores, calculates the average, and determines the letter grade.
public class ScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // initialize variables for tracking scores
        int count = 0;
        int total = 0;
        int highest = 0;
        // prompt the user to enter the first test score
        System.out.println("Enter a test score from 0 to 100,");
        int score = scanner.nextInt();
        // start the loop to collect test scores (the -1 acts as a sentinel)
        while (score != -1) {
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a score from 0 to 100, or -1 to stop: ");
                score = scanner.nextInt();
                continue;
            }
            count++;
            total += score;
            if (score > highest) {
                highest = score;
            }
            System.out.println("Enter a score from 0 to 100, or -1 to stop: ");
            score = scanner.nextInt();
        }
        // calculate and display the results
        if (count == 0) {
            System.out.println("No scores were entered.");
        } else {
           double average = (double) total / count;
           String letterGrade;
           if (average >= 90) {
               letterGrade = "A";
           } else if (average >= 80) {
               letterGrade = "B";
           } else if (average >= 70) {
               letterGrade = "C";
           } else if (average >= 60) {
               letterGrade = "D";
           } else {
               letterGrade = "F";
           }
           System.out.println("Total scores: " + total);
           System.out.println("Highest score: " + highest);
           System.out.println("Average score: " + average);
           }
           scanner.close();
        }
        
    }

