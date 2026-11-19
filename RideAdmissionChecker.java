import java.util.Scanner;
public class RideAdmissionChecker {
    public static void main(String[] args) {
        // import the Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        // intialize variables
        int age;
        int height;
        boolean hasAdult;
        boolean hasTicket; 
        // prompt the user for input
        System.out.print("Enter your age: ");
        age = readInt(scanner);
        System.out.print("Enter your height in inches: ");
        height = readInt(scanner);
        System.out.print("Do you have an adult with you? (true/false): ");
        hasAdult = readBoolean(scanner);
        System.out.print("Do you have a ticket? (true/false): ");
        hasTicket = readBoolean(scanner);
           // age checker 
        if (height < 48 || height > 78) {
                System.out.println("Denied: Height must be between 48 and 78 inches.");
            }
            else if (age < 12 && !hasAdult) {
                System.out.println("Denied: Minors  under 12 must be accompanied by an adult.");
            }
            else if (!hasTicket) {
                System.out.println("Denied: You must have a ticket.");
            }
            else {
                System.out.println("Admitted.");
            }
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

    /** Reads true or false, asking again until the user types one. */
    private static boolean readBoolean(Scanner scanner) {
        while (!scanner.hasNextBoolean()) {
            scanner.next();
            System.out.print("Please type true or false: ");
        }
        return scanner.nextBoolean();
    }
}
