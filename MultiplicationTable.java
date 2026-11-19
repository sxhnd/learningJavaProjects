import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // import scanner
        Scanner scanner = new Scanner(System.in);
        // declare variables
        int sum = 0;
        System.out.println("Enter a number: ");
        int number = readInt(scanner);
        System.out.println("What should the table start at?");
        int start = readInt(scanner);
        while (start <= 0) {
            System.out.println("Invalid start. Please enter a number greater than 0:");
            start = readInt(scanner);
        }
        System.out.println("What should the table end at? ");
        int limit = readInt(scanner);
        while (limit < start) {
            System.out.println("Invalid limit. Please enter a number greater than or equal to start. ");
            limit = readInt(scanner);
        }
      // for loop 
        for (int i = start;  i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            sum += (number * i);
        }
        System.out.println("Sum of the table: " + sum);
        // note to self if you declare a variable inside of a loop then it is local to that loop and can't be used outside of the loop
        scanner.close();
    }

    /** Reads a whole number, asking again until the user types one. */
    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Please enter a whole number: ");
        }
        return scanner.nextInt();
    }
}
