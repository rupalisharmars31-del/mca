import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number  ");
            
            if (!scanner.hasNextLong()) {
                System.out.println("invalid input");
                break;
            }

            long number = scanner.nextLong();
            long temp = Math.abs(number);
            int count = 0;

            if (temp == 0) {
                count = 1;
            } else {
                while (temp > 0) {
                    count++;
                    temp /= 10;
                }
            }

            System.out.println("Number of digits in " + number + " is: " + count);
        }
        
        scanner.close();
    }
}
