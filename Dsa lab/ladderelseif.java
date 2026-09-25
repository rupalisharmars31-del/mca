
import java.util.Scanner;

public class ladderelseif {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("The number is divisible by both 3 and 7.");
        } else if (num % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } else if (num % 7 == 0) {
            System.out.println("The number is divisible by 7.");
        } else {
            System.out.println("The number is not divisible by both 3 and 7.");
        }

        scanner.close();
    }
}
