import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of the student: ");
        String name = scanner.nextLine();
        System.out.print("Enter the marks for C: ");
        int C = scanner.nextInt();
        System.out.print("Enter the marks for C++: ");
        int CPP = scanner.nextInt();
        System.out.print("Enter the marks for Java: ");
        int Java = scanner.nextInt();
        System.out.print("Enter the marks for Python: ");
        int Python = scanner.nextInt();
        System.out.print("Enter the marks for R : ");
        int R = scanner.nextInt();


        int totalMarks = C + CPP + Java + Python + R;
        double percentage = (totalMarks / 500.0) * 100;
        if (C < 0 || C > 100 || CPP < 0 || CPP > 100 || Java < 0 || Java > 100 || Python < 0 || Python > 100 || R < 0 || R > 100) {
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
        }else{System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        }
        
        
        System.out.println("Report Card for " + name + ":");
        if (percentage >100 || percentage < 0) {
            System.out.println("Invalid percentage. Please check the marks entered.");
        } else if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else{
            System.out.println("Grade: F");
            System.out.println("Total Marks: " + totalMarks);

        }

        scanner.close();
    }
}