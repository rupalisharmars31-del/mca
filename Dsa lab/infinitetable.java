import java.util.Scanner;
    public class infinitetable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number to print its table: ");
            int num = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }

            System.out.print("Do you want to print another table? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program stopped.");
        scanner.close();
    }
}