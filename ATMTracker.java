import java.util.Scanner;

public class ATMTracker {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);
        // initialize variables
        int correctPin = 1234;
        int attempts = 0;
        int choice = 0;
        boolean loggedIn = false;
        // login while loop
        while (attempts < 3 && !loggedIn) {
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                loggedIn = true;
                System.out.println("Login successful.");
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");
            }

        }

        if (!loggedIn) {
            System.out.println("Account locked.");
        } else {
            // if logged in
            System.out.println("Welcome to the ATM Tracker!");
            System.out.println("Please enter your account balance: ");
            double balance = scanner.nextDouble();
            while (balance < 0) {
                System.out.println("Balance cannot be negative. Enter it again.");
                balance = scanner.nextDouble();
            }
            System.out.println("Your current account balance is: $" + balance);
            while (choice != 4) {
                System.out.println("1. Check balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your current account balance is: $" + balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit: ");

                        double deposit = scanner.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Deposit successful. Your new balance is: $" + balance);

                        } else {
                            System.out.println("Invalid Deposit.");
                        }

                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw: ");
                        double withdraw = scanner.nextDouble();
                        if (withdraw <= 0) {
                            System.out.println("Invalid Withdrawal.");
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient funds.");

                        }

                        else {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
                        }
                        break;
                    case 4:
                        System.out.println("Your final balance is: $" + balance);
                        System.out.println("Exiting the ATM Tracker. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid menu choice.");
                }
            }
        }

        scanner.close();
    }
}
