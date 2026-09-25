import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the table number: ");
    int n = sc.nextInt();
        for (int i = n; i <= (n * 10); i+=n) {
            System.out.println(i + " ");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
