import java.util.Scanner;
class InvalidAgeException extends Exception{
  public InvalidAgeException(String message){
    super(message);
  }

}
public class CustomException{
  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 26-06-2026 09:12 AM");

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age  = sc.nextInt();
    try{
      if(age<18){
        throw new InvalidAgeException("Invalid Age!!");
      }
      System.out.println("You are eligible!!");
    }

    catch(InvalidAgeException e){
      System.out.println(e.getMessage());
    }
    
  }
}