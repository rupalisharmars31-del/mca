import java.util.Scanner;
public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int start; int end; int upd;
        System.out.print("Enter the starting number: ");
        start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        end = sc.nextInt();
        System.out.print("Enter the update value: ");
        upd = sc.nextInt();
        System.out.println("Enter H for horizontal and V for vertical ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("H")) {
            for (int i = start; i <= end; i += upd) {
                System.out.print(i + " ");
            }
        } else if (choice.equalsIgnoreCase("V")) {
            for (int i = start; i <= end; i += upd) {
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid choice. Please enter H or V.");
        }




        sc.close();
    }
    
}
