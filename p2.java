public class p2{
    public static void main(String[] args) {
        int a = 12, b = 5, x = 10, n = 5;
        boolean f = true;

        // 1. Arithmetic & 2. Unary
        System.out.println("Math: " + (a+b) + " " + (a-b) + " " + (a*b) + " " + (a/b) + " " + (a%b));
        System.out.println("Unary: " + (++x) + " " + (x--) + " " + (!f) + " " + (~n));

        // 3. Relational & 4. Logical
        System.out.println("Compare: " + (a==b) + " " + (a!=b) + " " + (a>b) + " " + (a<b));
        System.out.println("Logical: " + (f && (a>b)) + " " + (f || (a<b)));

        // 5. Bitwise & 6. Shift
        System.out.println("Bitwise: " + (n & 3) + " " + (n | 3) + " " + (n ^ 3));
        System.out.println("Shift: " + (8 << 2) + " " + (8 >> 2) + " " + (8 >>> 2));

        // 7. Ternary & 8. Assignment
        System.out.println("Ternary: " + ((a > b) ? "Yes" : "No"));
        System.out.println("Assign: " + (x += 5) + " " + (x -= 2) + " " + (x *= 2));
    }
}
