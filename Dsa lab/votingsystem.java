import java.util.Scanner;
public class votingsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            
        
        System.out.println("enter your adhar number "+name);
        long adharNumber = sc.nextLong();
        System.out.print("Enter your age: "+ name);
        int age = sc.nextInt();
        if (adharNumber < 100000000000L || adharNumber > 999999999999L) {
            System.out.println("Invalid Aadhar number. It should be a 12-digit number.");
            sc.close();
            return;
        }
        
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            System.out.print("Do you want to vote? (yes/no): ");
            String voteChoice = sc.next();
            if (voteChoice.equalsIgnoreCase("yes") || voteChoice.equalsIgnoreCase("Y")) {
                System.out.println("Select the party you want to vote for: ");
                System.out.println("1. Congress");
                System.out.println("2. BJP");
                System.out.println("3. AAP");
                System.out.println("Thank you for voting.");
                System.out.print("Enter your choice (1/2/3): ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("You have voted for Congress.");
                } else if (choice == 2) {
                    System.out.println("You have voted for BJP.");
                } else if (choice == 3) {
                    System.out.println("You have voted for AAP.");
                } else {
                    System.out.println("Invalid choice. No vote recorded.");
                }
            } else {
                System.out.println("You have chosen not to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
    }
}
