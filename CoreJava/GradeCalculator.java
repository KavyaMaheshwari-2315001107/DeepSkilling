import java.util.Scanner;

public class GradeCalculator{
  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 24-06-2026 05:18 PM");

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your marks out of 100: ");
    int marks = sc.nextInt();

    if(marks>=90 && marks<=100){
      System.out.println("Your Grade is A for marks : " + marks);
    }
    else if(marks>=80 && marks<=89){
      System.out.println("Your Grade is B for marks : " + marks);
    }
    else if(marks>=70 && marks<=79){
      System.out.println("Your Grade is C for marks : " + marks);
    }
    else if(marks>=60 && marks<=69){
      System.out.println("Your Grade is D for marks : " + marks);
    }
    else if (marks>=0 && marks<60){
      System.out.println("Your Grade is F for marks : " + marks);
    }
    else{
      System.out.println("Invalid marks");
    }
  }
}