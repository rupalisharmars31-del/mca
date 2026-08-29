import java.util.Scanner;

public class expandedforms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to expand: ");
        long number = scanner.nextLong();
        String expandedForm = getExpandedForm(number);
        System.out.println("Expanded form of " + number + " is: " + expandedForm);
        scanner.close();
    }

    public static String getExpandedForm(long number) {
        StringBuilder expandedForm = new StringBuilder();
        long placeValue = 1;

        while (number > 0) {
            long digit = number % 10;
            if (digit != 0) {
                if (expandedForm.length() > 0) {
                    expandedForm.insert(0, " + ");
                }
                expandedForm.insert(0, digit * placeValue);
            }
            number /= 10;
            placeValue *= 10;
        }

        return expandedForm.toString();
    }

    
}
