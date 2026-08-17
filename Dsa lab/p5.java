import java.util.Scanner;

public class p5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name ");
        String name = sc.nextLine();
        System.out.print("Enter your class ");
        String cls = sc.next();
        System.out.print("Enter your roll number ");
        int roll = sc.nextInt();
        System.out.print("Enter your section ");
        String section = sc.next();

        System.out.println("Name: " + name + ", Class: " + cls );
        System.out.println("Roll Number: " + roll );
        System.out.println("Section: " + section );

        sc.close();
    }
}
