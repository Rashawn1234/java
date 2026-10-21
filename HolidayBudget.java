
import java.util.Scanner;

public class HolidayBudget {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO THE HOLIDAY SHOPPING PLANNER!");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your holiday budget: $");
        double budget = input.nextDouble();
        input.nextLine();

        double total = 0;
        int giftCount = 0;
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {

            System.out.print("\nEnter the gift name: ");
            String gift = input.nextLine();

            System.out.print("Enter the gift price: $");
            double price = input.nextDouble();
            input.nextLine();

            if (price > 0) {

                total = total + price;
                giftCount++;

                System.out.println(gift + " added successfully!");

                if (total > budget) {
                    System.out.println("Warning! You are over your budget!");
                } else {
                    System.out.println("You are still within your budget!");
                }

            } else {
                System.out.println("Invalid price! Gift not added.");
            }

            System.out.print("\nAdd another gift? (yes/no): ");
            choice = input.nextLine();
        }

        double remaining = budget - total;
        boolean withinBudget = total <= budget;

        System.out.println("\n================================");
        System.out.println("HOLIDAY SHOPPING REPORT");
        System.out.println("================================");

        System.out.println("Shopper: " + name.toUpperCase());
        System.out.println("Number of Gifts: " + giftCount);

        System.out.printf("Holiday Budget: $%.2f%n", budget);
        System.out.printf("Total Spending: $%.2f%n", total);
        System.out.printf("Money Remaining: $%.2f%n", remaining);

        if (withinBudget) {
            System.out.println("Great job! You stayed within your budget!");
        } else {
            System.out.println("You exceeded your holiday budget!");
        }

        if (giftCount >= 5) {
            System.out.println("You purchased many gifts!");
        } else if (giftCount >= 2) {
            System.out.println("You purchased a few gifts!");
        } else {
            System.out.println("You have a small shopping list!");
        }

        System.out.println("\nHappy Holidays, " + name + "!");

        input.close();
    }
}
,