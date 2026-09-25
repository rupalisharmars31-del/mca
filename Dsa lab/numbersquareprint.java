import java.util.Scanner;
public class numbersquareprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = scanner.nextInt(); // Size of the square

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + "\t"); // Print the row number
            }
            System.out.println(); // Move to the next line after each row
        }scanner.close();
    }
    
}
