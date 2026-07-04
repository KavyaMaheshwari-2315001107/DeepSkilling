import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 25-06-2026 09:18 AM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int number = sc.nextInt();

        int fact = 1;

        if(number<0){
            System.out.println("Factorial is not possible for negative numbers.");
        }
        else{
            for(int i =1;i<=number;i++){
                fact = fact*i;
            }
            System.out.println("Factorial = " + fact);

        }
    }
}        