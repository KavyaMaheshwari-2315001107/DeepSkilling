import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 24-06-2026 09:20 AM");

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1st num: ");
    Double num1 = sc.nextDouble();

    System.out.println("Enter 2nd num: ");
    double num2 = sc.nextDouble();

    System.out.println("Choose operator(+,*,/,-): ");
    char operator = sc.next().charAt(0);

    if(operator=='+'){
      System.out.println("Addition = "+ (num1+num2));
    }

    else if(operator=='-'){
      System.out.println("Subtraction = "+ (num1-num2));
    }

    else if(operator=='*'){
      System.out.println("Multiplication = "+ (num1*num2));
    }

    else if(operator=='/'){
      if(num2==0){
        System.out.println("Cannot divide by 0");
      }

      else{
        System.out.println("Division = "+ (num1/num2));
      }
    }

    else{
      System.out.println("Invalid Operation");
    }
  }
}