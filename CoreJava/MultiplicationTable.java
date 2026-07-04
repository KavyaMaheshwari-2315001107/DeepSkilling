import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 24-06-2026 12:18 PM"); 

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter number: ");
    int number = sc.nextInt();

    for(int i =1;i<=10;i++){
      System.out.println(number + " x " + i + " = " + (number*i));
    }
  }
}
