import java.util.Scanner;

public class RecursiveFibonacci {
  public static int fibonacci(int n){
    if(n==0) return 0;
    else if (n==1) return 1;
    else return(fibonacci(n-1) + fibonacci(n-2));
  }


  public static void main(String[] args){

    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 25-06-2026 10:41 AM");
  
    Scanner sc =new Scanner((System.in));
  
    System.out.println("Enter positive number :");
    int n = sc.nextInt();

    if(n<0) System.out.println("Please enter a positive number");
    else System.out.println("Fibonacci Number = " + fibonacci(n));
  }  
}