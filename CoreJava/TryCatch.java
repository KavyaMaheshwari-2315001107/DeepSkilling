import java.util.Scanner;

public class TryCatch{
  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 25-06-2026 05:18 PM");

    Scanner sc = new Scanner(System.in);

    System.out.println("Ener 1st Number:");
    int num1 = sc.nextInt();

    System.out.println("Enter 2nd Number:");
    int num2 =sc.nextInt();

    try{
      int result = num1/num2;
      System.out.println("Result= " + result);
    }
    
    catch(ArithmeticException e){
      System.out.println("Cannot divided by zero");
    }
  }
}