
import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {

    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 24-06-2026 09:40 AM");

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Number: ");
    int number = sc.nextInt();

    if(number % 2==0){
      System.out.println(number+ "is Even");
    }
    else{
      System.out.println(number + "is Odd");
    }
  }
}