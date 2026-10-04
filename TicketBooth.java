import java.util.Scanner;
public class TicketBooth {
    // create datatype Age
    enum Age {Infant, Child, Adult, Senior}

    public static void main(String[] args){
        /** 
         * 1. Greet user
         *  2. ask about how many ppl
         *  3. for each person calculate member n ticket price
         *  5. calculate ticket price
         *  6. seating chart
         *  7. countdown to the movie theater
         */
       
        // greet them
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ticket Booth!");
        System.out.println("How many people are in your party?");
        int n = input.nextInt();
        double[] prices = new double[n];
        // process every guest 
        for (int i = 0; i < n; i++) {
            double ticketPrice = 0.0;
            System.out.println("Guest " + (i + 1) + " age:");
            int age = input.nextInt();
            // ask again if the age doesn't make sense
            while (age < 0 || age > 123) {
                System.out.println("Invalid age. Please enter an age from 0 to 123:");
                age = input.nextInt();
            }
            Age category;

            if (age <= 3) {
                category = Age.Infant;
                ticketPrice = 0.0;
            } 
            else if (age <= 12) {
                category = Age.Child;
                ticketPrice = 10.50;
            } 
            else if (age <= 60) {
                category = Age.Adult;
                ticketPrice = 14.00;
            } 
            else {
                category = Age.Senior;
                ticketPrice = 11.50;
            }

            System.out.println("Guest " + (i + 1) + ": " + category + ", $" + String.format("%.2f", ticketPrice));
            prices[i] = ticketPrice;
        }
        // total cost    
        double totalCost = 0;        
        for( int i = 0; i < n; i++) {
            totalCost += prices[i];
        }
        System.out.println("Total: $" + String.format("%.2f", totalCost));
        // seating chart
        System.out.println("Here is the seating chart for your movie:");
        for (int row =1; row <= n; row ++) {
            for (int seat = 1; seat <= (n - row) + 1; seat ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // countdown
        int countdown =  (int) (Math.random() * 60);
        System.out.println("The movie begins in " + countdown + " seconds!");
        while (countdown > 0) {
        System.out.println(countdown);
        countdown--;
        }
        System.out.println("Enjoy the movie!");
    } 
    
}