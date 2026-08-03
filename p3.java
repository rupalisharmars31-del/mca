public class p3 {
    public static void main(String[] args) {
        // Given parameters
        double p = 2000; 
        double r = 10;   
        double t = 3;    
        double amount = p * Math.pow((1 + r / 100), t);

        double compoundInterest = amount - p;

        // Output results
        System.out.println("Total Amount (A): " + amount);
        System.out.println("Compound Interest (CI): " + compoundInterest);
    }
}
