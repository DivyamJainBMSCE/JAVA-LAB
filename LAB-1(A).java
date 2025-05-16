import java.util.Scanner;

public class GymMembershipManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter member information
        System.out.println("Welcome to the Gym Membership Management System!");
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();

        System.out.print("Enter member age: ");
        int age = scanner.nextInt();

        System.out.print("Is the membership active? (true/false): ");
        boolean isActive = scanner.nextBoolean();

        System.out.print("Enter membership duration (in months): ");
        int duration = scanner.nextInt();

        // Calculate membership fee (assuming $50 per month)
        double membershipFee = duration * 50.0;

        // Display member details
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Membership Duration: " + duration + " months");
        System.out.println("Membership Fee: $" + membershipFee);

        scanner.close();
    }
}
