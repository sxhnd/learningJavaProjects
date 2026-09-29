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
        age = scanner.nextInt();
        System.out.print("Enter your height in inches: ");
        height = scanner.nextInt();
        System.out.print("Do you have an adult with you? (true/false): ");
        hasAdult = scanner.nextBoolean();
        System.out.print("Do you have a ticket? (true/false): ");
        hasTicket = scanner.nextBoolean();
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

}