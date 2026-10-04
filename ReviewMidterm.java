import java.util.Scanner;
public class ReviewMidterm {
    /** Create a program that keeps asking you options until you quit
     * 1. binary - you type a number and it converts it to binary
     * 2. triangle - you type a size where each row starts one number later
     * 3. shift letter - you type a letter and it shifts it to the next letter in the alphabet
     * 4. average - you type a list of numbers and it averages them prints with int math & double math
     * 5. quit - exits the program
     * 
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Review Midterm Program!");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int number = 0; // Variable to store the number for binary conversion
        int rowSize = 0; // Variable to store the size for triangle

        while (choice != 5) {
            System.out.println("Please choose an option:");
            System.out.println("1. Binary");
            System.out.println("2. Triangle");
            System.out.println("3. Shift Letter");
            System.out.println("4. Average");
            System.out.println("5. Quit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Call binary conversion method
                    System.out.println("Enter a number to convert to binary:");
                    number = scanner.nextInt();
                    String binary = "";
                if (number == 0) {
                    binary = "0";
                }
                else if (number < 0) {
                    binary = "only works for positive numbers";
                }
                else {
                    while (number > 0) {
                        binary = (number % 2) + binary;
                        number /= 2;
                    }
                }
                    System.out.println("The binary version of your number is: " + binary);
                    break;
                case 2:
                    // Call triangle method
                    System.out.println("Enter the size of the triangle:");
                    rowSize = scanner.nextInt();
                    for( int i =  1; i <= rowSize; i++ ) {
                        for( int j = i; j <= rowSize; j++ ) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Call shift letter method
                    System.out.println("Enter a letter to shift:");
                    char letter = scanner.next().charAt(0);
                    char shiftedLetter = (char) (letter + 1);
                    // z goes back to a
                    if (letter == 'z') {
                        shiftedLetter = 'a';
                    }
                    else if (letter == 'Z') {
                        shiftedLetter = 'A';
                    }
                    System.out.println("The shifted letter is: " + shiftedLetter);
                    break;
                case 4:
                    // Call average method
                    System.out.println("Enter the number of elements to average:");
                    int n = scanner.nextInt();
                    int[] numbers = new int[n]; // Array to store numbers for average calculation
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter number " + (i + 1) + ":");
                        numbers[i] = scanner.nextInt();
                    }
                    // calculate the average using int math and double math
                    int numberArray = 0;
                    double sum = 0;
                    int intSum = 0;
                    for (int i = 0; i < n; i++) {
                        numberArray += numbers[i];
                        sum = (double) numberArray / n;
                        intSum = numberArray / n;
                    }
                    System.out.println("The average is: " + sum);
                    System.out.println("The average using int math is: " + intSum);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
