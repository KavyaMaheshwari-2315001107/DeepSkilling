// Order of Operation => 1. () Parantheses 
// 2.*,/,% 
// 3. +,- 
// 4. =

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 24-06-2026 04:36 PM");

        int result1 = 10+5*2;
        int result2 = (10+5)*2;
        int result3 = 20/(5+3);
        int result4 = 20/5+3;

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("20 / (5 + 3) = " + result3);
        System.out.println("20 / 5 + 3 = " + result4);
    }
}